package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java 8");
            }
        }).start();
        //Lambda Expression
        new Thread(() -> System.out.println("After Java8")).start();

        new Thread(() -> {
            System.out.println("After Java8 example-2");
        }).start();

        //Prior Java 8

        List<String> list = Arrays.asList("lambda","Practice","2021","3","7");

        for (String elem:list) {
            System.out.println(elem);
        }
        System.out.println("=============== After Java-8 =======");
        list.forEach((res) -> System.out.println(res));
        // More shorter
        System.out.println("============ More shorter ==============");
        list.forEach(System.out::println);

        //Before Java 8

//        List <String> language = Arrays.asList("Java","Scala","C++","Haskell", "Lisp");
//        for (String elem: language){
//            System.out.println("Lan: "+elem);
//        }

        List<String> list1 = Arrays.asList("xyz","abc","nothing","lovely") ;
//        for (String elem: list1){
//            System.out.println("Lan: "+elem);
//        }
        //Using lambda
        System.out.println("=========== Using Lambda =============");
        List<String> lanList = list1.stream()
                .map(lan->"Lan: "+lan)
                .collect(Collectors.toList());
        System.out.println(lanList);

        Set<Integer> prices = new HashSet<>(Arrays.asList(50,23,20,30,50,70));
        Optional<Integer> processedPrice = prices.stream()
                .filter(price -> price > 20)
                .map(price -> price + 100)
                .reduce((priceA,priceB) -> priceA+priceB);
//                .max((priceA,priceB) -> priceA - priceB);
                //.collect(Collectors.toSet());
        System.out.println(processedPrice.get());
    }
}
