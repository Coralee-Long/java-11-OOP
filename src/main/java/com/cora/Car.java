package com.cora;

public class Car {

    // Define Attributes
    String brand;
    String model;
    String colour;
    String year;
    boolean isElectric;
    int speed;

    public void startCar() {
        System.out.println("Car has started");

    }
    public void accelerateCar(int delta) {
        System.out.println("Initial speed: " + speed);

        this.speed += delta;

        System.out.println("Car accelerated by: " + delta);
        System.out.println("Speed is now: " + this.speed);
    }
}
