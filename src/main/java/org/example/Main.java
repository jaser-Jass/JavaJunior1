package org.example;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        double average = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).average().orElse(0.0);
        System.out.println("Среднее значение четных чисел: " + average);
        }
}