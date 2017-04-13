package com.rahul.javabrains;

public class MethodReferenceExample1 {
    public static void main(String args[]) {
        Thread thread = new Thread(MethodReferenceExample1::greet);
        thread.start();
    }

    public static void greet() {
        System.out.println("Hello World");
    }
}
