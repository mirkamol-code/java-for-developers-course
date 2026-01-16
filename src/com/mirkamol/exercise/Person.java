package com.mirkamol.exercise;

public class Person {
    private String name;
    private String surName;
    private Gender gender;
    private Address address;
    private Car car;
    private House house;

    public Person(String name, String surName, Address address, Car car, House house) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.car = car;
        this.house = house;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", address=" + address +
                ", car=" + car +
                ", house=" + house +
                '}';
    }

}
