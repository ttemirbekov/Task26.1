package com.company;

import java.time.LocalDate;

public class CarDetails {
    private LocalDate yearOfManafacture;
    private String model;
    private int price;
    private String color;

    public CarDetails(){

    }

    public CarDetails(LocalDate yearOfManafacture, String model, int price, String color) {
        this.yearOfManafacture = yearOfManafacture;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getYearOfManafacture() {
        return yearOfManafacture;
    }

    public void setYearOfManafacture(LocalDate yearOfManafacture) {
        this.yearOfManafacture = yearOfManafacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "yearOfManafacture: " + yearOfManafacture +
                ", model: " + model +
                ", price: " + price + " USD" +
                ", color: " + color  +
                '}';
    }
}

