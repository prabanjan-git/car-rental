package com.example.carrental.model;

public class Car {
    private String name;
    private String model;
    private int pricePerDay;

    public Car() {}

    public Car(String name, String model, int pricePerDay) {
        this.name = name;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(int pricePerDay) { this.pricePerDay = pricePerDay; }
}

