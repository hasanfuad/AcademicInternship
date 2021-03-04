package com.company;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,9,99};
        try {
            System.out.println(arr[7]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
