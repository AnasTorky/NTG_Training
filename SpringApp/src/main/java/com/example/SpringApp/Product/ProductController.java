package com.example.SpringApp.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;


    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(request));
//        return productService.create(request);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductResponse> getBYId(@PathVariable Long id){
        return ResponseEntity.ok(productService.getById(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductResponse> update(@RequestBody ProductRequest request,@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productService.update(request,id));
        //      return productService.update(request,id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Product> getByTitle(@RequestParam String title){
        return productService.getByTitle(title);
    }
}
