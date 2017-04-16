package com.rahul.javabrains;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Rahul", "Bhatia", 26),
                new Person("Shivam", "Mishra", 28),
                new Person("Mohit", "Benadikar", 25),
                new Person("Anant", "Choudhary", 23));

        System.out.println("Using just for each method: ");
        people.forEach(person -> {
            if (person.getLastName().startsWith("B")) {
                System.out.println(person);
            }
        });

        System.out.println("Using stream method: ");
        people.stream()
                .filter(person -> person.getLastName().startsWith("B"))
                .forEach(System.out::println);

        System.out.println("Total Count: " +
                people.stream()
                        .filter(person -> person.getLastName().startsWith("B"))
                        .count());
    }
}
