package com.mirkamol.exercise;

import java.time.LocalDate;

public class Car {
   private CarBrand brand;
   private String model;
   private LocalDate registeredYear;

    public Car(CarBrand brand, String model, LocalDate registeredYear) {
        this.brand = brand;
        this.model = model;
        this.registeredYear = registeredYear;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegisteredYear() {
        return registeredYear;
    }

    public void setRegisteredYear(LocalDate registeredYear) {
        this.registeredYear = registeredYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", registeredYear=" + registeredYear +
                '}';
    }
}
