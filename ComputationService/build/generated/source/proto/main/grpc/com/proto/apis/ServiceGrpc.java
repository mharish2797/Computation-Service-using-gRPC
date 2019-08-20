package com.proto.apis;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: apis/apis.proto")
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "apis.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.apis.SumRequest,
      com.proto.apis.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.apis.SumRequest.class,
      responseType = com.proto.apis.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.apis.SumRequest,
      com.proto.apis.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.apis.SumRequest, com.proto.apis.SumResponse> getSumMethod;
    if ((getSumMethod = ServiceGrpc.getSumMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSumMethod = ServiceGrpc.getSumMethod) == null) {
          ServiceGrpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<com.proto.apis.SumRequest, com.proto.apis.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "apis.Service", "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.SumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.apis.PrimeRequest,
      com.proto.apis.PrimeResponse> getPrimeDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimeDecomposition",
      requestType = com.proto.apis.PrimeRequest.class,
      responseType = com.proto.apis.PrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.apis.PrimeRequest,
      com.proto.apis.PrimeResponse> getPrimeDecompositionMethod() {
    io.grpc.MethodDescriptor<com.proto.apis.PrimeRequest, com.proto.apis.PrimeResponse> getPrimeDecompositionMethod;
    if ((getPrimeDecompositionMethod = ServiceGrpc.getPrimeDecompositionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getPrimeDecompositionMethod = ServiceGrpc.getPrimeDecompositionMethod) == null) {
          ServiceGrpc.getPrimeDecompositionMethod = getPrimeDecompositionMethod = 
              io.grpc.MethodDescriptor.<com.proto.apis.PrimeRequest, com.proto.apis.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "apis.Service", "PrimeDecomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.PrimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("PrimeDecomposition"))
                  .build();
          }
        }
     }
     return getPrimeDecompositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.apis.AverageRequest,
      com.proto.apis.AverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Average",
      requestType = com.proto.apis.AverageRequest.class,
      responseType = com.proto.apis.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.apis.AverageRequest,
      com.proto.apis.AverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.apis.AverageRequest, com.proto.apis.AverageResponse> getAverageMethod;
    if ((getAverageMethod = ServiceGrpc.getAverageMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getAverageMethod = ServiceGrpc.getAverageMethod) == null) {
          ServiceGrpc.getAverageMethod = getAverageMethod = 
              io.grpc.MethodDescriptor.<com.proto.apis.AverageRequest, com.proto.apis.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "apis.Service", "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.AverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Average"))
                  .build();
          }
        }
     }
     return getAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.apis.MaxRequest,
      com.proto.apis.MaxResponse> getMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Max",
      requestType = com.proto.apis.MaxRequest.class,
      responseType = com.proto.apis.MaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.apis.MaxRequest,
      com.proto.apis.MaxResponse> getMaxMethod() {
    io.grpc.MethodDescriptor<com.proto.apis.MaxRequest, com.proto.apis.MaxResponse> getMaxMethod;
    if ((getMaxMethod = ServiceGrpc.getMaxMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getMaxMethod = ServiceGrpc.getMaxMethod) == null) {
          ServiceGrpc.getMaxMethod = getMaxMethod = 
              io.grpc.MethodDescriptor.<com.proto.apis.MaxRequest, com.proto.apis.MaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "apis.Service", "Max"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.MaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.apis.MaxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Max"))
                  .build();
          }
        }
     }
     return getMaxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.apis.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.apis.SumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void primeDecomposition(com.proto.apis.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.apis.PrimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimeDecompositionMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.apis.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.apis.AverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.apis.MaxRequest> max(
        io.grpc.stub.StreamObserver<com.proto.apis.MaxResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMaxMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.apis.SumRequest,
                com.proto.apis.SumResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimeDecompositionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.apis.PrimeRequest,
                com.proto.apis.PrimeResponse>(
                  this, METHODID_PRIME_DECOMPOSITION)))
          .addMethod(
            getAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.apis.AverageRequest,
                com.proto.apis.AverageResponse>(
                  this, METHODID_AVERAGE)))
          .addMethod(
            getMaxMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.apis.MaxRequest,
                com.proto.apis.MaxResponse>(
                  this, METHODID_MAX)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceStub extends io.grpc.stub.AbstractStub<ServiceStub> {
    private ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.apis.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.apis.SumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primeDecomposition(com.proto.apis.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.apis.PrimeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrimeDecompositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.apis.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.apis.AverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.apis.MaxRequest> max(
        io.grpc.stub.StreamObserver<com.proto.apis.MaxResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMaxMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceBlockingStub> {
    private ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.apis.SumResponse sum(com.proto.apis.SumRequest request) {
      return blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.apis.PrimeResponse> primeDecomposition(
        com.proto.apis.PrimeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrimeDecompositionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceFutureStub> {
    private ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.apis.SumResponse> sum(
        com.proto.apis.SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIME_DECOMPOSITION = 1;
  private static final int METHODID_AVERAGE = 2;
  private static final int METHODID_MAX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.apis.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.apis.SumResponse>) responseObserver);
          break;
        case METHODID_PRIME_DECOMPOSITION:
          serviceImpl.primeDecomposition((com.proto.apis.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.apis.PrimeResponse>) responseObserver);
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
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.apis.AverageResponse>) responseObserver);
        case METHODID_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.max(
              (io.grpc.stub.StreamObserver<com.proto.apis.MaxResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.apis.Apis.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimeDecompositionMethod())
              .addMethod(getAverageMethod())
              .addMethod(getMaxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
