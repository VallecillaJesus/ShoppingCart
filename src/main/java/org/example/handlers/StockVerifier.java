package org.example.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.models.AthenaConstants;
import org.example.models.Product;
import org.example.utils.AthenaClientFactory;
import software.amazon.awssdk.services.athena.AthenaClient;

import static org.example.services.AthenaQueryManager.*;

public class StockVerifier implements RequestHandler<Product, Object> {
    @Override
    public Object handleRequest(Product input, Context context) {
         AthenaClient athenaClient = AthenaClientFactory.athenaClient();

        String queryExecutionId = submitAthenaQuery(athenaClient, String.format(
          AthenaConstants.ATHENA_SAMPLE_QUERY,
                input.getName()
        ));
        try {
            waitForQueryToComplete(athenaClient, queryExecutionId);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        processResultRows(athenaClient, queryExecutionId);
        athenaClient.close();

        System.out.println(input.toString());
        return null;
    }
}
