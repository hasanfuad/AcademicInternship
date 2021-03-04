package com.company;

public class Main {

    public static void main(String[] args) {
	Calculator cal = new Calculator(22,2);
	int res = cal.addtion();
        int res2= cal.substaction();
        int res1 = cal.multiplication();
        float res3 = cal.division();
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
