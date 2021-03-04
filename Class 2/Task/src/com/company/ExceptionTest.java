package com.company;

import java.net.URI;
import java.net.URISyntaxException;

public class ExceptionTest {
    public static void main(String[] args) {
        new ExceptionTest().division(0);
    }
    public double division(int num) {
//        double res = 0;
//        try{
//            res = 5/num;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//            return res;
        try {
            URI uri = new URI("23323://2323");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
