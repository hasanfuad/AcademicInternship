package com.company;

public class VehicleTesting {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120,332);
        System.out.println("Current speed: "+vehicle.move);
        System.out.println("Current vol: "+vehicle.volume);
        vehicle.increaseSpeed = 4;
        vehicle.decreaseSpeed = 1;

        vehicle.move();
        vehicle.speedUp();
        vehicle.setSpeedDown();
        vehicle.changeSpeedUp();
        vehicle.changeSpeedDown();
    }
}
