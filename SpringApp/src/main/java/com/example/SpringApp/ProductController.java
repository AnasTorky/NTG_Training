package com.example.SpringApp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest request){
        return productService.create(request);
    }

    @GetMapping("{id}")
    public ProductResponse getBYId(@PathVariable Long id){
        return productService.getById(id);
    }

    @PutMapping("{id}")
    public ProductResponse update(@RequestBody ProductRequest request,@PathVariable Long id){
      return productService.update(request,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }

    @GetMapping("/search")
    public List<Product> getByTitle(@RequestParam String title){
        return productService.getByTitle(title);
    }
}
