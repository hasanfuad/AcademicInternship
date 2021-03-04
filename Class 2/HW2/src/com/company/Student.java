package com.company;

 public class Student extends Person implements Nationality{
     String education;
     Student(String name, int age, String nationality, String education) {
         super(name, age, nationality);
         this.name = name;
         this.age = age;
         this.nationality = nationality;
         this.education = education;
     }

     public void growUp(){
         if("BSc".equals(education)){
             System.out.println("Bachelor student.");
         }else{
             System.out.println("Masters Student.");
         }
         age++;
         super.growUp();
     }
     public String toString(){
         return name+" "+age+" "+nationality+" "+education;
     }



     @Override
     public void custom() {
         System.out.println("Different sort of festival.");

     }

     @Override
     public void polity() {
        if("han".equals(nationality)){
            System.out.println("No policies");
        }else{
            System.out.println("Have policies");
        }
     }
 }
