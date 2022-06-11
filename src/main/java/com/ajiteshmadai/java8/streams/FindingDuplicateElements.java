package com.ajiteshmadai.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicateElements {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 8, 7, 6, 7, 5, 10, 78, 11, 90, 78, 77, 56);
        Set<Integer> uniqueIntegers = new HashSet<>();
        integers.stream()
                .filter(integer -> !uniqueIntegers.add(integer))
                .forEach(System.out::println);

    }
}
