package org.dominic.example.window;

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
    comments = "Source: window.proto")
public final class WindowGrpc {

  private WindowGrpc() {}

  public static final String SERVICE_NAME = "window.Window";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.dominic.example.window.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getOpenMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus> getOpenMethod;
    if ((getOpenMethod = WindowGrpc.getOpenMethod) == null) {
      synchronized (WindowGrpc.class) {
        if ((getOpenMethod = WindowGrpc.getOpenMethod) == null) {
          WindowGrpc.getOpenMethod = getOpenMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "window.Window", "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dominic.example.window.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new WindowMethodDescriptorSupplier("Open"))
                  .build();
          }
        }
     }
     return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.dominic.example.window.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getCloseMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus> getCloseMethod;
    if ((getCloseMethod = WindowGrpc.getCloseMethod) == null) {
      synchronized (WindowGrpc.class) {
        if ((getCloseMethod = WindowGrpc.getCloseMethod) == null) {
          WindowGrpc.getCloseMethod = getCloseMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "window.Window", "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dominic.example.window.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new WindowMethodDescriptorSupplier("Close"))
                  .build();
          }
        }
     }
     return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.dominic.example.window.WindowStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.window.WindowStatus> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus> getGetStatusMethod;
    if ((getGetStatusMethod = WindowGrpc.getGetStatusMethod) == null) {
      synchronized (WindowGrpc.class) {
        if ((getGetStatusMethod = WindowGrpc.getGetStatusMethod) == null) {
          WindowGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.dominic.example.window.WindowStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "window.Window", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dominic.example.window.WindowStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new WindowMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WindowStub newStub(io.grpc.Channel channel) {
    return new WindowStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WindowBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WindowBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WindowFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WindowFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class WindowImplBase implements io.grpc.BindableService {

    /**
     */
    public void open(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.dominic.example.window.WindowStatus>(
                  this, METHODID_OPEN)))
          .addMethod(
            getCloseMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.dominic.example.window.WindowStatus>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.dominic.example.window.WindowStatus>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WindowStub extends io.grpc.stub.AbstractStub<WindowStub> {
    private WindowStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WindowStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WindowStub(channel, callOptions);
    }

    /**
     */
    public void open(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WindowBlockingStub extends io.grpc.stub.AbstractStub<WindowBlockingStub> {
    private WindowBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WindowBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WindowBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.dominic.example.window.WindowStatus> open(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.dominic.example.window.WindowStatus> close(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dominic.example.window.WindowStatus getStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WindowFutureStub extends io.grpc.stub.AbstractStub<WindowFutureStub> {
    private WindowFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WindowFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WindowFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dominic.example.window.WindowStatus> getStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_GET_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WindowImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WindowImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN:
          serviceImpl.open((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.dominic.example.window.WindowStatus>) responseObserver);
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

  private static abstract class WindowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WindowBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dominic.example.window.WindowProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Window");
    }
  }

  private static final class WindowFileDescriptorSupplier
      extends WindowBaseDescriptorSupplier {
    WindowFileDescriptorSupplier() {}
  }

  private static final class WindowMethodDescriptorSupplier
      extends WindowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WindowMethodDescriptorSupplier(String methodName) {
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
      synchronized (WindowGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WindowFileDescriptorSupplier())
              .addMethod(getOpenMethod())
              .addMethod(getCloseMethod())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
