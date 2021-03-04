package com.company;

import java.util.Scanner;

public class Calculator {
       int val1 ,val2;
       public int addtion(){
           return val1+val2;
       }
        public int substaction(){
        return val1-val2;
    }
    public int multiplication(){
        return val1*val2;
    }
    public float division(){
        return val1/val2;
    }

    public Calculator(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
}

