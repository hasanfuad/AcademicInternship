package com.company;

public class StaticTest {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        staticTest.test();
    }

    public void test(){
        System.out.println("I am static...");
    }
}
