package com.ecommerce.product.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.Date;


public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date releaseDate;

    private Boolean productAvailable = false;
    private Integer stockQuantity;

    // Default Constructor (Required for JSON Deserialization)
    public ProductDTO() {}

    // Constructor with all fields
    public ProductDTO(String name, String description, String brand, BigDecimal price, String category, Date releaseDate, Boolean productAvailable, Integer stockQuantity) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.productAvailable = productAvailable;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Date getReleaseDate() { return releaseDate; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }

    // ✅ Renamed getter to `getProductAvailable()`
    public Boolean getProductAvailable() { return productAvailable; }
    public void setProductAvailable(Boolean productAvailable) { this.productAvailable = productAvailable; }

    public Integer getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }
}
