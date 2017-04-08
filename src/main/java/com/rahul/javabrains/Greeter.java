package com.rahul.javabrains;

public class Greeter {
    public static void main(String args[]) {
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        helloWorldGreeting.greet();
        lambdaGreeting.greet();
    }
}
