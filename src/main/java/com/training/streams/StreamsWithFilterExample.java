package com.training.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithFilterExample {

    public static void main(String[] args) {
        List<String> s = Arrays.asList("test", "test1", "test2");
        List<String> filteredList = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals("test1") || s.get(i).equals("test2")) {
                filteredList.add(s.get(i));
            }
        }
        System.out.println(filteredList);
        List<Double> filteredList1 = s.stream().filter((i) -> {
            System.out.println("Inside filter Condition  : " + i);
            return i.equals("test1") || i.equals("test2");
        }).map(i -> {
            System.out.println("Inside map Condition : " + i);
            return 10 * Math.random();
        }).collect(Collectors.toList());
        System.out.println("using streams :" + filteredList1);
    }
}
