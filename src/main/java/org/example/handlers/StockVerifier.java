package org.example.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.models.Product;

public class StockVerifier implements RequestHandler<Product, Object> {
    @Override
    public Object handleRequest(Product input, Context context) {
        System.out.println(input.toString());
        return null;
    }
}
