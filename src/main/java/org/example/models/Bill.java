package org.example.models;

import java.util.List;

public class Bill {
    private List<Product> products;

    public Bill() {}

    public Bill(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "products=" + products +
                '}';
    }
}
