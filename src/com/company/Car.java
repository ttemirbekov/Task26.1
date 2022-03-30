package com.company;

public class Car {
    private String ID;
    private int number;

    public Car(){
    }

    public Car(String ID, int number) {
        this.ID = ID;
        this.number = number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID: " + ID  +
                ", number: " + number +
                '}';
    }
}
