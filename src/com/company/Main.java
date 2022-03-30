package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, CarDetails> car = new HashMap<>();
        car.put(new Car("09KG",987), new CarDetails(LocalDate.of(2020,06,10), "Lexus", 56000,"Black" ));
        car.put(new Car("08KG",109), new CarDetails(LocalDate.of(2019,05,18), "BMW", 20000,"White" ));
        car.put(new Car("01KG",774), new CarDetails(LocalDate.of(2021,12,29), "Mercedes", 90000,"Black" ));
        car.put(new Car("03KG",989), new CarDetails(LocalDate.of(2019,03,15), "Toyota", 7600,"Red" ));
        car.put(new Car("05KG",666), new CarDetails(LocalDate.of(2018,02,23), "Rolce Royce", 120000,"Black" ));
        for (Map.Entry a: car.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
}

    }