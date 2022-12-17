package org.example.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.models.Bill;
import org.example.models.Product;
import org.example.utils.LambdaClientFactory;
import org.example.utils.RequestManager;
import software.amazon.awssdk.services.lambda.LambdaClient;

public class ShoppingCart implements RequestHandler<Bill, Object> {

    private final LambdaClient lambdaClient;

    public ShoppingCart(){
        this.lambdaClient = LambdaClientFactory.lambdaClient();
    }

    @Override
    public Object handleRequest(Bill input, Context context) {
        String STOCK_VERIFIER = "jvallecilla-stock-verifier";
        System.out.println(input.toString());

        for(Product product : input.getProducts()){
            this.lambdaClient.invoke(RequestManager.generateRequest(product, STOCK_VERIFIER));
        }

        return null;
    }
}
