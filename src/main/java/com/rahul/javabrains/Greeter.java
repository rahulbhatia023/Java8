package com.rahul.javabrains;

public class Greeter {
    public static void main(String args[]) {
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        helloWorldGreeting.greet();
        innerClassGreeting.greet();
        lambdaGreeting.greet();
    }
}
