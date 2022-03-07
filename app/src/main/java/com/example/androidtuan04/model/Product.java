package com.example.androidtuan04.model;

public class Product {
    private String name;
    private String shop;
    private int image;

    public Product() {
    }

    public Product(String name, String shop, int image) {
        this.name = name;
        this.shop = shop;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
