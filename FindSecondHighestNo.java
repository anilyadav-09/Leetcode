package org.example.java8;

import java.util.*;

public class FindSecondHighestNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20, 54, 23, 54, 87, 87, 45, 23, 90, 90, 100, 100);
        System.out.println("original list "+ list);

        List<Integer> sortedList = list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("sorted list in reverse order " + sortedList);

        int secondHighestNo = sortedList.stream()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondHighestNo);

    }
}
