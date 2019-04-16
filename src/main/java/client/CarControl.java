/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mycompany.example.car.CarGrpc;
import org.mycompany.example.car.WindowStatus;

/**
 *
 * @author ismail
 */
public class CarControl implements ServiceObserver {
   protected ServiceDescription current;
   private ManagedChannel channel;
   private CarGrpc.CarBlockingStub blockingStub;
   private final String serviceType;
   private final String name;

   private static final Logger logger = Logger.getLogger(CarControl.class.getName());

   public CarControl() {
      serviceType = "_car_control";
      name = "car";
      
      jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
      clientManager.register(this);

      serviceAdded(new ServiceDescription("18.202.21.182", 50021));
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
   public boolean interested(String type) {
      return serviceType.equals(type);
   }

   @Override
   public String getName() {
      return name;
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
   
   public void carControl(){
      
      try {
         
         Empty request = Empty.newBuilder().build();
         WindowStatus response = blockingStub.lockDoors(request);
         System.out.println("Doors "+response);
         
      } catch (StatusRuntimeException e) {
         logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
         return;
      }
      
   }
   
   public static void main(String[] args) {
      new CarControl();
   }

}
