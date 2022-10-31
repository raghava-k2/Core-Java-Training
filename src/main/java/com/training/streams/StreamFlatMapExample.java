package com.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<List<String>> s = Arrays.asList(Arrays.asList("test1", "test2"), Arrays.asList("test3", "test4"));
        System.out.println(s);
        List<String> flatList = s.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
