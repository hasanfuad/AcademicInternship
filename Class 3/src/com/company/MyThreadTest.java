package com.company;

public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new MyThread()).start();
        System.out.println("Current thread is: "+Thread.currentThread().getName());

    }
}
