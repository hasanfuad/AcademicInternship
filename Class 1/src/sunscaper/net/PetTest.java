package sunscaper.net;


public class PetTest {
    public static void main(String[] args) {
        //Good practice
        Pet tom = new Pet("Tom",23,"white");
        String name = tom.tellMeYourName();
        int age = tom.tellMeYourAge();
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);

    }
}
