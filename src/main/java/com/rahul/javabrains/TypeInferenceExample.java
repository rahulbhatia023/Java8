package com.rahul.javabrains;

public class TypeInferenceExample {
    public static void main(String args[]) {
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda lambda) {
        System.out.print(lambda.getLength("Hello World"));
    }
}

interface StringLengthLambda {
    int getLength(String s);
}