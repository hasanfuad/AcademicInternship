package com.company;

public class FishTesting {

    public static void main(String[] args) {
	    Fish fish = new Fish("Tilapiya");
        System.out.println(fish.getName());
        Betta betta = new Betta("Betta",3);
        System.out.println(betta.getName());
        Betta betta1 = new Betta("Hilsha",2);
        betta1.swim();
        betta1.blowBubbles();
        betta1.swim();
    }
}
