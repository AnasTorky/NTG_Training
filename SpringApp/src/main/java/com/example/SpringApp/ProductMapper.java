package com.example.SpringApp;

import java.util.List;

public class ProductMapper {

//    from req to entity

    Product toProductEntity (ProductRequest request){
        Product product=new Product();
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return product;
    }

    // from entity to response

    ProductResponse toProductResponse(Product product){
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setTitle(product.getTitle());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        return response;
    }



}
