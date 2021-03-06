package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionTypeTesting {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("kdhd","tomimi");
        System.out.println(list);

        List<Integer> listInt = Arrays.asList(2, 3, 4);
        System.out.println(listInt);

        HashSet<String> set = new HashSet<>();
        set.add("fuad");
        set.add("hasan");
        set.add("fahad");
        System.out.println(set);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("mohammad",20);
        map.put("Bangladesh",71);

        for (String element:map.keySet()) {
            System.out.println(element);
        }
        for (Integer value:map.values()) {
            System.out.println(value);
        }

        }



    }

