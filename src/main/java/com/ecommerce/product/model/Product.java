package com.ecommerce.product.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity

@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isProductAvailable() {
        return productAvailable;
    }

    public void setProductAvailable(boolean productAvailable) {
        this.productAvailable = productAvailable;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "product_available")
    private boolean productAvailable;
    @Column(name = "stock_quantity")
    private int stockQuantity;

}
