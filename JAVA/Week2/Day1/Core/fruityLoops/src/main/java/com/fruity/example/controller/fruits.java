package com.fruity.example.controller;

public class fruits {

    private String name;
    private double price;

    public fruits(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters for name and price
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
