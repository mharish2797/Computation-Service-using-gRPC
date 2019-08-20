package com.grpc.apis.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.opentracing.Tracer;

import java.io.IOException;

public class ServerNode {
    static Tracer tracer;

    public static void main(String[] args) throws IOException, InterruptedException {
        //plaintext server
            Server server= ServerBuilder.forPort(50052)
                .intercept(new ServerInterceptor())
                .addService(new ServerImpl())
              //  .addService(ProtoReflectionService.newInstance())
                .build();

        //SSL encrypted server
//        Server server= ServerBuilder.forPort(50052)
//                .addService(new ServerImpl())
//                .useTransportSecurity(
//                        new File("ssl/server.crt"),
//                        new File("ssl/server.pem")
//                )
//                .build();

        server.start();

        System.out.println("Server running!");
        Runtime.getRuntime().addShutdownHook( new Thread( () -> {
            server.shutdown();
            System.out.println("Server Shutdowns");
        }));


        server.awaitTermination();
    }
}
