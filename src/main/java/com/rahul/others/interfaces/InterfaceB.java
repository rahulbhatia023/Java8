package com.rahul.others.interfaces;

public interface InterfaceB {
    default void show() {
        System.out.println("Inside InterfaceB show() method");
    }
}
