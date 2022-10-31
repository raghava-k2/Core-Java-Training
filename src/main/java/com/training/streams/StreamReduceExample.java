package com.training.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1, 2, 3, 4, 5);
        int sum = s.stream().reduce(0, (acc, item) -> {
            System.out.println("acc :" + acc + "item :" + item);
            return acc += item;
        });
        System.out.println(sum);
    }
}
