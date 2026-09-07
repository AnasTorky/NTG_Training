package com.example.SpringApp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    public List<ProductResponse> getAll(){
        List<Product> product = productRepo.findAll();
        return product.stream().map(productMapper::toProductResponse).toList();
//        return productRepo.findAll();
    }
//request -> entity -> response
    public ProductResponse create(ProductRequest request){
        Product product = productMapper.toProductEntity(request);
        productRepo.save(product);
        return productMapper.toProductResponse(product);
    }

    public ProductResponse getById(Long id){
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return productMapper.toProductResponse(product);
//        return productRepo.findById(id).orElse(null);
    }

    public ProductResponse update(ProductRequest request,Long id){
        Product product =productRepo.findById(id).orElse(null);
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        productRepo.save(product);
        return productMapper.toProductResponse(product);

//        Product updatedProduct = productRepo.findById(id).orElse(null);
//        updatedProduct.setTitle(product.getTitle());
//        updatedProduct.setDescription(product.getDescription());
//        updatedProduct.setPrice(product.getPrice());
//        return productRepo.save(updatedProduct);

    }

    public void delete(Long id){
        productRepo.deleteById(id);
    }

    public List<Product> getByTitle(String title){
        return productRepo.findByTitle(title);
    }
}
