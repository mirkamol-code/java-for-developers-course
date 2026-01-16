package com.mirkamol.exercise;

public class Address {
    private String firstLine;
    private String secondLine;
    private int postcode;
    private String country;

    public Address(String firstLine, String secondLine, int postcode, String country) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.postcode = postcode;
        this.country = country;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", postcode=" + postcode +
                ", country='" + country + '\'' +
                '}';
    }
}
