package org.example.models;

public class AthenaConstants {

    public static final int CLIENT_EXECUTION_TIMEOUT = 100000;
    public static final String ATHENA_OUTPUT_BUCKET = "s3://jvallecilla-s3/results/";
    public static final String ATHENA_SAMPLE_QUERY = "SELECT * FROM products WHERE name = '%s';";
    public static final long SLEEP_AMOUNT_IN_MS = 1000;
    public static final String ATHENA_DEFAULT_DATABASE = "devopsathenadb";

}
