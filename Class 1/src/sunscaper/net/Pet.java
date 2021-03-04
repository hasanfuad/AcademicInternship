package sunscaper.net;

public class Pet {
    int age;
    String name;
    String color;

     Pet(String pName, int pAge, String pColor){
        age = pAge;
        name = pName;
        color = pColor;

    }
    String tellMeYourName(){
         return name;
    }
    int tellMeYourAge(){
         return age;
    }

}
