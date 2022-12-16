package org.example.utils;

import com.google.gson.Gson;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.services.lambda.model.InvocationType;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;

public class RequestManager {

    public static InvokeRequest generateRequest(Object payload, String functionName){
        String inputJSON = new Gson().toJson(payload);
        SdkBytes convertedPayload = SdkBytes.fromUtf8String(inputJSON);

        InvokeRequest invokeRequest = InvokeRequest.builder()
                .functionName(functionName)
                .invocationType(InvocationType.EVENT)
                .payload(convertedPayload)
                .build();

        return invokeRequest;
    }
}
