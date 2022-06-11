package com.ajiteshmadai.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindingOutEvenNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 8, 6, 7, 5, 10, 11, 90, 78, 77, 56);
        integers.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);


    }
}
