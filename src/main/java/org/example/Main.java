package org.example;

import org.example.models.AthenaConstants;
import org.example.utils.AthenaClientFactory;
import org.example.utils.LambdaClientFactory;
import org.example.models.Bill;
import org.example.utils.RequestManager;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;

import static org.example.services.AthenaQueryManager.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    }
}