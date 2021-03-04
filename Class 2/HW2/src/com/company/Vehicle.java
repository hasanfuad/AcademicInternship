package com.company;

public class Vehicle {
    int speed;
    int volume;
    int move;
    int increaseSpeed;
    int decreaseSpeed;
    int changeSpeedUp;
    int changeSpeedDown;

    public Vehicle(int vSpeed, int vVolume) {
        this.speed = vSpeed;
        this.volume = vVolume;
    }

    public void move(){
        move = 1;
        System.out.println("Moving speed"+speed);
    }
    public int setSpeed(int vSpeed){
        speed = vSpeed;
        return speed;
    }
    public int setVolume(int vVolume){
        volume = vVolume;
        return volume;
    }

    public int speedUp(){
        System.out.println("Acceleration speed"+increaseSpeed);
        return increaseSpeed;
    }
    public int setSpeedDown(){
        System.out.println("Down speed"+decreaseSpeed);
        return decreaseSpeed;
    }


    public void changeSpeedUp(){
        changeSpeedUp=speed+increaseSpeed;
        System.out.println("Output after acceleration: "+changeSpeedUp);
    }
    public void changeSpeedDown(){
        changeSpeedDown=speed-decreaseSpeed;
        System.out.println("Output after decreasing: "+changeSpeedDown);
    }
}

