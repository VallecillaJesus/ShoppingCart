package org.example.utils;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.http.urlconnection.UrlConnectionHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.AthenaClientBuilder;

public class AthenaClientFactory {
    private static final AthenaClientBuilder builder = AthenaClient.builder()
            .region(Region.US_EAST_1)
            .httpClient(UrlConnectionHttpClient.builder().build());

    public static AthenaClient athenaClient() {
        return builder.build();
    }
}
