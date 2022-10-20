package com.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("test", 1);
        m.put("test2", 1);
        m.put("test2", 2);
        m.put("test3", 2);
        m.put(null, null);
        m.put(null, 1);
        System.out.println("null value : " + m.get(null));
        System.out.println(m);
        System.out.println("Contains key :" + m.containsKey("test11"));
        for (Map.Entry<String, Integer> mm : m.entrySet()) {
            System.out.println(mm.getKey() + "::" + mm.getValue());
        }
    }
}
