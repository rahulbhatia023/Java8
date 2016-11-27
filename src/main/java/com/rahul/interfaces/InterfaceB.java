package com.rahul.interfaces;

public interface InterfaceB {
    default void show() {
        System.out.println("Inside InterfaceB show() method");
    }
}
