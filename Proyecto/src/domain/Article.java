/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author BrayRPGs
 */
public class Article {
    private String id;
    private String brand;
    private String description;
    private String category;
    private int quantity;
    private double price;

    public Article() {
    }

    public Article(String id,String brand, String description, String category, int quantity, double price) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Articles{" + "brand=" + brand + ", description=" + description + ", category=" + category + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
}
