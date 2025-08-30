package com.example.carrental.model;

public class Car {
    private String name;
    private String type;
    private double pricePerDay;

    public Car(String name, String type, double pricePerDay) {
        this.name = name;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public double getPricePerDay() { return pricePerDay; }
}
