package com.rahul.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExerciseSolutionJava8 {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Rahul", "Bhatia", 26),
                new Person("Shivam", "Mishra", 28),
                new Person("Mohit", "Benadikar", 25),
                new Person("Anant", "Choudhary", 23));

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("Printing all persons on the ordering basis of Last Name: ");
        printAll(people);

        System.out.println("Printing all persons whose last name starts with 'B': ");
        performConditionally(people, person -> person.getLastName().startsWith("B"), person -> System.out.println(person));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        people.forEach(person -> {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        });
    }

    private static void printAll(List<Person> people) {
        people.forEach(person -> System.out.println(person));
    }
}
