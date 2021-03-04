package com.company;

public class Fish {
    private String name;

    Fish(String fName){
        name = fName;
    }

    public void setName(String fName){
        name = fName;
    }

    public String getName(){
        return name;
    }

    public void swim(){
        System.out.println(name+" is swimming.........");
    }
}
