package com.rahul.interviewpractice;

class A {
    void m1() {
        System.out.println("m1");
    }
}

class B extends A {
    void m2() {
        System.out.println("m2");
    }
}

class Program1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        // a.m2();   --> Wrong Implementation
    }
}
