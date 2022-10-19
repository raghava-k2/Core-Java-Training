package com.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //list as dynamic array
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(list.get(0));
        list.remove(1);
        list.add(2);
        list.add(30);
        System.out.println(list.contains(20));
    }
}
