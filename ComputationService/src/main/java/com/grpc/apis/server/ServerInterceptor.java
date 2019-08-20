package com.grpc.apis.server;

import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class ServerInterceptor<R> extends ForwardingServerCallListener<R>{
//    @Override
//    public void onMessage(R message) {
//        System.out.println(message);
//        super.onMessage(message);
//    }
//
//    @Override
//    protected ServerCall.Listener<R> delegate() {
//        return null;
//    }
//}

public class ServerInterceptor implements io.grpc.ServerInterceptor {

    static final Metadata.Key<String> CUSTOM_HEADER_KEY =
            Metadata.Key.of("custom_server_header_key", Metadata.ASCII_STRING_MARSHALLER);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT>
        interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        final Set<String> headerKeys = headers.keys();
        Map<String, String> headerMap = new HashMap<>(headerKeys.size());
        for (String key : headerKeys) {
            if (!key.endsWith(Metadata.BINARY_HEADER_SUFFIX)) {
                String value = headers.get(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER));
                System.out.println(key +" "+value);
                headerMap.put(key, value);
            }
        }

        System.out.println("header received from client:"+ headers);
        System.out.println("ServerCall " + call.getMethodDescriptor().getRequestMarshaller().toString());
        System.out.println("ServerCall- getFullMethodName " + call.getMethodDescriptor().getFullMethodName());
        System.out.println("CallHandler " + next.toString());

//        ServerCall.Listener<ReqT> listener=next.startCall(call, headers);

        return next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void request(int numMessages) {
                System.out.println("Message number"+numMessages);
                super.request(numMessages);
            }

            @Override
            public void sendMessage(RespT message) {
                System.out.println("Message-RespT "+message);
                super.sendMessage(message);
            }
        }, headers);

//    return listener;
    }

}
