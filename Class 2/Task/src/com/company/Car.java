package com.company;

import java.util.Objects;

public class Car {
    private String name;

    public Car(String name) {
//        System.out.println("In constructor: "+this);
        this.name = name;
    }
    public void drive(){

        System.out.println(name+" is being driven by fuad..");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
