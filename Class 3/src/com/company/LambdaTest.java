package com.company;

public class LambdaTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java 8");
            }
        }).start();
        //Lambda Expression
        new Thread(() -> System.out.println("After Java8")).start();

        new Thread(() -> {
            System.out.println("After Java8 example-2");
        }).start();
    }
}
