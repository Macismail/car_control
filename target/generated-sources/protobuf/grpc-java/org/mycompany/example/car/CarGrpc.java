package org.mycompany.example.car;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: car.proto")
public final class CarGrpc {

  private CarGrpc() {}

  public static final String SERVICE_NAME = "window.Car";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.mycompany.example.car.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getCloseMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus> getCloseMethod;
    if ((getCloseMethod = CarGrpc.getCloseMethod) == null) {
      synchronized (CarGrpc.class) {
        if ((getCloseMethod = CarGrpc.getCloseMethod) == null) {
          CarGrpc.getCloseMethod = getCloseMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "window.Car", "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mycompany.example.car.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CarMethodDescriptorSupplier("Close"))
                  .build();
          }
        }
     }
     return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.mycompany.example.car.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus> getGetStatusMethod;
    if ((getGetStatusMethod = CarGrpc.getGetStatusMethod) == null) {
      synchronized (CarGrpc.class) {
        if ((getGetStatusMethod = CarGrpc.getGetStatusMethod) == null) {
          CarGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "window.Car", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mycompany.example.car.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CarMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getLockDoorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockDoors",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.mycompany.example.car.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.mycompany.example.car.WindowStatus> getLockDoorsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus> getLockDoorsMethod;
    if ((getLockDoorsMethod = CarGrpc.getLockDoorsMethod) == null) {
      synchronized (CarGrpc.class) {
        if ((getLockDoorsMethod = CarGrpc.getLockDoorsMethod) == null) {
          CarGrpc.getLockDoorsMethod = getLockDoorsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.mycompany.example.car.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "window.Car", "LockDoors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mycompany.example.car.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new CarMethodDescriptorSupplier("LockDoors"))
                  .build();
          }
        }
     }
     return getLockDoorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarStub newStub(io.grpc.Channel channel) {
    return new CarStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class CarImplBase implements io.grpc.BindableService {

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    public void lockDoors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getLockDoorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCloseMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.mycompany.example.car.WindowStatus>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.mycompany.example.car.WindowStatus>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getLockDoorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.mycompany.example.car.WindowStatus>(
                  this, METHODID_LOCK_DOORS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CarStub extends io.grpc.stub.AbstractStub<CarStub> {
    private CarStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarStub(channel, callOptions);
    }

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockDoors(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockDoorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CarBlockingStub extends io.grpc.stub.AbstractStub<CarBlockingStub> {
    private CarBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.mycompany.example.car.WindowStatus> close(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mycompany.example.car.WindowStatus getStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mycompany.example.car.WindowStatus lockDoors(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLockDoorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class CarFutureStub extends io.grpc.stub.AbstractStub<CarFutureStub> {
    private CarFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mycompany.example.car.WindowStatus> getStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mycompany.example.car.WindowStatus> lockDoors(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLockDoorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLOSE = 0;
  private static final int METHODID_GET_STATUS = 1;
  private static final int METHODID_LOCK_DOORS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLOSE:
          serviceImpl.close((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus>) responseObserver);
          break;
        case METHODID_LOCK_DOORS:
          serviceImpl.lockDoors((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.mycompany.example.car.WindowStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mycompany.example.car.CarProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Car");
    }
  }

  private static final class CarFileDescriptorSupplier
      extends CarBaseDescriptorSupplier {
    CarFileDescriptorSupplier() {}
  }

  private static final class CarMethodDescriptorSupplier
      extends CarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarFileDescriptorSupplier())
              .addMethod(getCloseMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getLockDoorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
