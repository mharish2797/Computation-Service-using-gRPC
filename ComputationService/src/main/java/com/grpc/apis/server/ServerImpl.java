package com.grpc.apis.server;


import com.proto.apis.*;
import io.grpc.stub.StreamObserver;

public class ServerImpl extends ServiceGrpc.ServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        int a= (int) request.getA();
        int b= (int) request.getB();
        int result=a+b;

        SumResponse response= SumResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void primeDecomposition(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        long a = request.getA();
        int factor=2;
        while(a>1){
            if(a%factor==0){
                PrimeResponse response= PrimeResponse.newBuilder().setResult(factor).build();
                responseObserver.onNext(response);
                a/=factor;
            }
            else{
                factor++;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AverageRequest> average(StreamObserver<AverageResponse> responseObserver) {
        StreamObserver<AverageRequest> requestObserver = new StreamObserver<AverageRequest>() {
            long sum=0,count=0;
            @Override
            public void onNext(AverageRequest value) {
                sum+=value.getA();
                count++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                AverageResponse averageResponse= AverageResponse.newBuilder()
                        .setResult(sum/count).build();
                responseObserver.onNext(averageResponse);
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }


    @Override
    public StreamObserver<MaxRequest> max(StreamObserver<MaxResponse> responseObserver) {
        StreamObserver<MaxRequest> requestObserver = new StreamObserver<MaxRequest>() {
            long max_val=0;
            @Override
            public void onNext(MaxRequest value) {
                long temp=value.getA();
                if(max_val<temp){
                    max_val=temp;
                    MaxResponse maxResponse= MaxResponse.newBuilder()
                            .setResult(max_val).build();
                    responseObserver.onNext(maxResponse);
                }

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}
