package client;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mycompany.example.car.AlarmStatus;
import org.mycompany.example.car.CarGrpc;
import org.mycompany.example.car.WindowsStatus;
import org.mycompany.example.car.DrsStatus;

public class CarClient implements ServiceObserver {

   protected ServiceDescription current;
   private final String serviceType;
   private final String name;
   private static final Logger logger = Logger.getLogger(CarClient.class.getName());

   private ManagedChannel channel;
   private CarGrpc.CarBlockingStub blockingStub;

   /**
    * Car Client Constructor.
    */
   public CarClient() {
      serviceType = "_car._udp.local.";
      name = "Car";
      jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
      clientManager.register(this);

      serviceAdded(new ServiceDescription("localhost", 50021));
      
   }

   String getServiceType() {
      return serviceType;
   }

   @Override
   public List<String> serviceInterests() {
      List<String> interests = new ArrayList<String>();
      interests.add(serviceType);
      return interests;
   }

   @Override
   public void serviceAdded(ServiceDescription service) {
      logger.info("Start Car Control Service: ");
      current = service;
      channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
              .usePlaintext(true)
              .build();
      blockingStub = CarGrpc.newBlockingStub(channel);
   }

   @Override
   public boolean interested(String type) {
      return serviceType.equals(type);
   }

   @Override
   public String getName() {
      return name;
   }

   public void shutdown() throws InterruptedException {
      channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
   }

   // car control windows contact the car server and get response back
   public void winControl() {
      try {
         new Thread() {
            public void run() {
               Empty request = Empty.newBuilder().build();

               Iterator<WindowsStatus> response = blockingStub.closeWindows(request);
               while (response.hasNext()) {
                  int i = response.next().getPercentage();
                  System.out.println("Windows levels: " +i+"%");
                  if (i == 100) {
                     System.out.println("All Windows Locked !!!");
                  }
               }
            }
         }.run();

      } catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }
   }
   
   // car doors control contact the car server and get response back
   public void drControl(){
      try {
         Empty req1 = Empty.newBuilder().build();
         DrsStatus status = blockingStub.lockDoors(req1);
         System.out.println("Doors " + status.getLock());
      } catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }
   }
   
   // car Alarm control contact the car server and get response back
   public void alControl(){
      try {
         Empty req2 = Empty.newBuilder().build();
         AlarmStatus status = blockingStub.switchAlarm(req2);
         System.out.println("Alarm " + status.getAlarm());
      } catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }
   }

   public static void main(String[] args) throws InterruptedException {
      CarClient client = new CarClient();
      try{
         client.winControl();
         client.drControl();
         client.alControl();
         
      }finally{
         client.shutdown();
      }
   }

}
