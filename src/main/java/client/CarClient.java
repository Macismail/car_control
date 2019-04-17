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
import org.mycompany.example.car.CarGrpc;
import org.mycompany.example.car.CarStatus;
import org.mycompany.example.car.DrsStatus;

public class CarClient implements ServiceObserver {

   protected ServiceDescription current;
   private final String serviceType;
   private final String name;
   private static final Logger logger = Logger.getLogger(CarClient.class.getName());

   private ManagedChannel channel;
   private CarGrpc.CarBlockingStub blockingStub;

   /**
    * Constructor.
    */
   public CarClient() {
      serviceType = "_car_udp.local.";
      name = "Car";
      jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
      clientManager.register(this);

      serviceAdded(new ServiceDescription("localhost", 50021));
      //18.202.21.182
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
      System.out.println("Start service");
      current = service;
      channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
              .usePlaintext(true)
              .build();
      blockingStub = CarGrpc.newBlockingStub(channel);
      carControl();
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

   /**
    * Close the car windows method.
    */
   public void carControl() {

      try {
         new Thread() {
            public void run() {
               Empty request = Empty.newBuilder().build();

               Iterator<CarStatus> response = blockingStub.close(request);
               while (response.hasNext()) {
                  System.out.println(response.next().toString());
               }
            }
         }.start();

         Empty request = Empty.newBuilder().build();
         CarStatus status = blockingStub.getStatus(request);
         logger.info("Closing windows:");

      } catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }
      
      try{
         
         Empty req = Empty.newBuilder().build();
         DrsStatus resp = blockingStub.lockDoors(req);
         logger.info("Doors " + resp);
         
      }catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }

   }

   public static void main(String[] args) throws InterruptedException {
      new CarClient();
   }

}
