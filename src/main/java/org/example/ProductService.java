package org.example;

public class ProductService {
    ProductApiClient productApiClient;
    public  ProductService(ProductApiClient productApiClient){
        this.productApiClient = productApiClient;
    }
    public Product getProduct(String productId){
        return productApiClient.getProduct(productId);

    }
}
