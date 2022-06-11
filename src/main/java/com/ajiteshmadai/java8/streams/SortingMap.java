package com.ajiteshmadai.java8.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zyx");
        map.put(2, "yxw");
        map.put(3, "abc");


        List<String> sortedList = map
                .values().stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
