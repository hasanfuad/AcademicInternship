package com.company;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(55);
        for(int i = 1; i < 1000; i++){
            arr.add(i);
        }
        System.out.println(arr);
    }
}
