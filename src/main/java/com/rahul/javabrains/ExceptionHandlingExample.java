package com.rahul.javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int key = 0;

        processNumbers(numbers, key, (n, k) -> {
            try {
                System.out.println(n / k);
            } catch (ArithmeticException ex) {
                System.out.println("Arithmetic Exception");
            }
        });
    }

    static void processNumbers(List<Integer> numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        numbers.forEach(number -> biConsumer.accept(number, key));
    }
}
