package client;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mycompany.example.car.CarGrpc;
import org.mycompany.example.car.CarStatus;

public class CarClient implements ServiceObserver {

   protected ServiceDescription current;
   private final String serviceType;
   private final String name;
   private static final Logger logger = Logger.getLogger(GRPCCarClient.class.getName());

   private ManagedChannel channel;
   private CarGrpc.CarBlockingStub blockingStub;

   /**
    * Constructor.
    */
   public CarClient() {
      serviceType = "_windows._up.local.";
      name = "Car";
      jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
      clientManager.register(this);

      serviceAdded(new ServiceDescription("18.202.21.182", 50021));
   }

   String getServiceType() {
      return serviceType;
   }

   public List<String> serviceInterests() {
      List<String> interests = new ArrayList<String>();
      interests.add(serviceType);
      return interests;
   }

   public void serviceAdded(ServiceDescription service) {
      System.out.println("Start service");
      current = service;
      channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
              .usePlaintext(true)
              .build();
      blockingStub = CarGrpc.newBlockingStub(channel);
      carControl();
   }

   public boolean interested(String type) {
      return serviceType.equals(type);
   }

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
         System.out.println("Closing windows " + status);

      } catch (RuntimeException e) {
         logger.log(Level.WARNING, "RPC failed", e);
         return;
      }
      
      try {
         
         Empty request = Empty.newBuilder().build();
         CarStatus response = blockingStub.lockDoors(request);
         System.out.println("Doors "+response);
         
      } catch (StatusRuntimeException e) {
         logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
         return;
      }

   }

   public static void main(String[] args) {
      new CarClient();
   }

}
