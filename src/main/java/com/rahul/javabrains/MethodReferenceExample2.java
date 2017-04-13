package com.rahul.javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("Rahul", "Bhatia", 26),
                new Person("Shivam", "Mishra", 28),
                new Person("Mohit", "Benadikar", 25),
                new Person("Anant", "Choudhary", 23));

        System.out.println("Printing all persons whose last name starts with 'B': ");
        performConditionally(people, person -> person.getLastName().startsWith("B"), System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        people.forEach(person -> {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        });
    }
}
