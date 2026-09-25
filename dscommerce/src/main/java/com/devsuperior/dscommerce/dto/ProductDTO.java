package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductDTO(){

    }

    public ProductDTO(String description, Long id, String imgUrl, String name, Double price) {
        this.description = description;
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
    }
    public ProductDTO(Product product) {
        description = product.getDescription();
        id = product.getId();
        imgUrl = product.getImgUrl();
        name = product.getName();
        price = product.getPrice();
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
