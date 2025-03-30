package com.ecommerce.product.service;

import com.ecommerce.product.dto.ProductDTO;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
@Autowired
ProductRepo productRepo;

public List<ProductDTO> getAllProducts(){
    return productRepo.findAll()
            .stream()
            .map(product -> new ProductDTO (product.getName(),product.getDescription(), product.getBrand() , product.getPrice(),product.getCategory(),product.getReleaseDate(),product.isProductAvailable(),product.getStockQuantity()))
            .collect(Collectors.toList());
}

    public ProductDTO addProduct(ProductDTO productDTO) {
    Product product = new Product();
    product.setName(productDTO.getName());
    product.setDescription(productDTO.getDescription());
    product.setProductAvailable(productDTO.getProductAvailable());
    product.setReleaseDate(productDTO.getReleaseDate());
    product.setBrand(productDTO.getBrand());
    product.setPrice(productDTO.getPrice());
    product.setCategory(productDTO.getCategory());
    product.setStockQuantity(productDTO.getStockQuantity());

    product =  productRepo.save(product);
    return new ProductDTO(product.getName(),product.getDescription(), product.getBrand() , product.getPrice(),product.getCategory(),product.getReleaseDate(),product.isProductAvailable(),product.getStockQuantity());

    }




}
