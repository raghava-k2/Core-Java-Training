package com.training.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(3);
        System.out.println(s);
        Set<String> ss = new HashSet<>();
        ss.add("test2");
        ss.add("test1");
        ss.add("test1");
        ss.add("test3");
        System.out.println(ss);
        Set<String> ss1 = new LinkedHashSet<>();
        ss1.add("test2");
        ss1.add("test1");
        ss1.add("test1");
        ss1.add("test3");
        System.out.println(ss1);
    }
}
