package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        HashMap<List, List> map = new HashMap<>();
        map.put(Arrays.asList(2,3),Arrays.asList(3,5));
        map.put(Arrays.asList(33,44),Arrays.asList(99,8));

        System.out.println(map.get(Arrays.asList(2,3)));
    }
}
