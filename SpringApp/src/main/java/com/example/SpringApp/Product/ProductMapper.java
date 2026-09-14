package com.example.SpringApp.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProductEntity (ProductRequest request);
    ProductResponse toProductResponse(Product product);
//    void updateProduct(ProductRequest request, @MappingTarget Product product);
}
