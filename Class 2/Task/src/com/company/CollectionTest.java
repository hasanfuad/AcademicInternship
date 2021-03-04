package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args) {
    // Collection framework composed 3three main categories
        // List - It's an array, it stores list of data
//        ArrayList arr = new ArrayList();
//        arr.add("fuad");
//        arr.add("hasan");
//        arr.add("fahad");
//        arr.add("fuad");
//        arr.add("kichuna");
//        System.out.println(arr);
//        System.out.println(arr.contains("fuad"));
//        System.out.println(arr.get(1));
//        System.out.println(arr.size());
//
//        for (int i = 0; i < arr.size(); i++){
//            String store = (String) arr.get(i);
//            System.out.println(store);
//        }
//        for each

// Follows order
        LinkedList linkedList = new LinkedList();

        linkedList.add("hasan");
        linkedList.add("fuad");
        linkedList.add("fahad");
        linkedList.add("laal");
        linkedList.add("shada");
        for(Object element : linkedList){
//            System.out.println("With foreach: "+linkedList);
        }



        // Set - stores data but without duplicate element. Don't follow the order

        HashSet set = new HashSet();
        set.add("Fuad");
        set.add("Fahad");
        set.add("hasan");
        set.add("Fuad");
        System.out.println(set);



        // Map - key map an object person => personDetail which means its point an object


    }
}
