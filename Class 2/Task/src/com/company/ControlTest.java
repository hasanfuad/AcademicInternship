package com.company;

public class ControlTest {
    public static void main(String[] args) {
//        for(int i = 0; i<10;i++){
//            System.out.println(i);
//        }
//        int i = 0;
//        while(i<10){
//            i++;
//            if(i==5)
//                continue;
//
//            System.out.println(i);
//        }
        int a = 0;
        try {
            System.out.println(5 / a);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Program end.");
    }
}
