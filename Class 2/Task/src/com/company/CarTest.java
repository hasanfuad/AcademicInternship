package com.company;

public class CarTest {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari");
        ferrari.drive();

        int a = 2, b=2;
        System.out.println(a == b);
        Car carA = new Car("ford");
        Car carB = new Car("fordd");

        System.out.println(carA == carB);
        System.out.println("Car a is: "+carA);
        System.out.println("Car b is: "+carB);
        System.out.println(carA.equals(carB));

    }
}
