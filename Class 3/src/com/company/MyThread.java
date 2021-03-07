package com.company;

public class MyThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Thread is running: "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
