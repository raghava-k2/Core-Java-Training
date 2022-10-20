package com.training.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> s = new TreeMap<>();
        s.put("test3", 10);
        s.put("test", 10);
        s.put("test2", null);
        System.out.println(s);
    }
}
