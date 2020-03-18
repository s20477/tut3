package com.company;

public class Airplane {
    String brand;
    int numberOfSeats;

    private Airplane (String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

