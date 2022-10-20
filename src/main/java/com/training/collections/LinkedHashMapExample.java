package com.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("test1", 1);
        m.put("test2", null);
        m.put("test2", 3);
        m.put("test3", 3);
        System.out.println(m);
    }
}
