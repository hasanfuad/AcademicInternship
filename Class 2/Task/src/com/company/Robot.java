package com.company;

public class Robot implements Walkable,Flyable,Talk {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name+" is walking...");

    }

    @Override
    public void fly() {
        System.out.println(name+" is flying...");
    }

    @Override
    public void talk() {
        System.out.println(name+" is talking...");
    }
}
