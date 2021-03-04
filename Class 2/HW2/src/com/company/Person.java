package com.company;

public class Person {
    String name;
    int age;
    String nationality;
    public static int count = 0;

     Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        count++;
    }

    public void getName() {
        System.out.println("Name: "+name);
    }

    public void getAge() {
        System.out.println("Age: "+age);
    }

    public void getNationality() {
        System.out.println("Nationality: "+nationality);
    }

    public void growUp(){
        age++;
    }

    public void show(){
        System.out.println("Person counted: "+count);
    }
    public String toString(){
         return name+" "+age+" "+nationality;
    }
}
