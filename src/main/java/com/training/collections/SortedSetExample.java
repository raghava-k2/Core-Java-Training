package com.training.collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>(Collections.reverseOrder());
        s.add("test1");
        s.add("test2");
        s.add("test3");
        System.out.println(s);
        SortedSet<String> s1 = new TreeSet<>();
        s1.add("test1");
        s1.add("test2");
        s1.add("test3");
        System.out.println(s1);
    }
}
