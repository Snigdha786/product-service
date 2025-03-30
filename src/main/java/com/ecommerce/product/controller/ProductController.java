package com.ecommerce.product.controller;

import com.ecommerce.product.dto.ProductDTO;
import com.ecommerce.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
@Autowired
    ProductService productService;
    @GetMapping("/products")
    public ResponseEntity <List<ProductDTO>> getProducts (){
        return ResponseEntity.ok(productService.getAllProducts()) ;

    }

    @PostMapping("/product")
    public ResponseEntity <ProductDTO> addProduct (@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.addProduct(productDTO));
    }
}
