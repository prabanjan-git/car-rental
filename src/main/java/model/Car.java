package com.example.carrental.model;

public class Car {
    private String name;
    private String type;
    private double pricePerDay;

    // Constructors
    public Car() {}
    public Car(String name, String type, double pricePerDay) {
        this.name = name;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }
}

