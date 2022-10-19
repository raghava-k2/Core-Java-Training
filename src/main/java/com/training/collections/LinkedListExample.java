package com.training.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
