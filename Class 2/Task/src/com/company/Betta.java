package com.company;

public class Betta extends Fish{
    int age;
    Betta(String fName, int fAge) {
        super(fName);
        this.age = fAge;
    }

    public void blowBubbles(){
        System.out.println(super.getName()+" is bubbling>-->--:>;;");
    }

    public void swim(){
        System.out.println(getName()+" swimming betta...");
    }
}
