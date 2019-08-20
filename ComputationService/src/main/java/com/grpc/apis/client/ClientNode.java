package com.grpc.apis.client;

import com.proto.apis.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.net.ssl.SSLException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ClientNode {

    public static void main(String[] args) throws InterruptedException, SSLException {
        ManagedChannel channel= ManagedChannelBuilder
                .forAddress("localhost",50052)
                .usePlaintext()
                .build();
//      Secure channel
//        ManagedChannel channel= NettyChannelBuilder.forAddress("localhost",50052)
//                .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
//                .build();

        UnaryApi(channel);
//        ServerStreamApi(channel);
//        ClientStreamApi(channel);
//        BiDiStreamApi(channel);
       channel.shutdown();

    }

    public static void UnaryApi(ManagedChannel channel) {
        ServiceGrpc.ServiceBlockingStub blockingStub=ServiceGrpc.newBlockingStub(channel);
        SumRequest request=SumRequest.newBuilder().setA(10).setB(7).build();
        SumResponse response = blockingStub.sum(request);
        System.out.println("Result = "+response.getResult());
    }

    public static void ServerStreamApi(ManagedChannel channel) {
        ServiceGrpc.ServiceBlockingStub blockingStub=ServiceGrpc.newBlockingStub(channel);
        PrimeRequest request= PrimeRequest.newBuilder().setA(72).build();
        blockingStub.primeDecomposition(request).forEachRemaining(response -> {
        System.out.println("Factor = "+response.getResult());
        });
    }

    public static void ClientStreamApi(ManagedChannel channel) throws InterruptedException {

        ServiceGrpc.ServiceStub stub= ServiceGrpc.newStub(channel);

        CountDownLatch latch =new CountDownLatch(1);

        StreamObserver<AverageRequest> observer= stub.average(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Result = "+ value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        Arrays.asList(12,112,1012).forEach(val ->
                observer.onNext(AverageRequest.newBuilder().setA(val).build()));
        observer.onCompleted();

        latch.await(3L, TimeUnit.SECONDS);
    }

    public static void BiDiStreamApi(ManagedChannel channel) throws InterruptedException {

        ServiceGrpc.ServiceStub stub= ServiceGrpc.newStub(channel);

        CountDownLatch latch =new CountDownLatch(1);
        StreamObserver<MaxRequest> requestStreamObserver= stub.max(new StreamObserver<MaxResponse>() {
            @Override
            public void onNext(MaxResponse value) {
            System.out.println("Current Maximum: "+value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });


        Arrays.asList(1,5,3,6,2,20).forEach(val->
                requestStreamObserver.onNext(MaxRequest.newBuilder().setA(val).build()));

        requestStreamObserver.onCompleted();

        latch.await();

    }


}
