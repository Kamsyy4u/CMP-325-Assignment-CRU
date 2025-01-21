package com.RealStore.demo.beststore.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message ="The Name is Required")
    private String name;


    @NotEmpty(message ="The Brand is Required")
    private String brand;


    @NotEmpty(message ="The Category is Required")
    private String Category;

    @Min(0)
    private double price;

    @Size(min = 10, message="the description should be at least ten characters")
    @Size(max = 2000, message="the description should not exceed 2000 characters")
    private String description;

    private MultipartFile imageFile;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
