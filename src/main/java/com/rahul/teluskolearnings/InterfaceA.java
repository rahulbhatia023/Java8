package com.rahul.teluskolearnings;

public interface InterfaceA {
    default void show() {
        System.out.println("In InterfaceA show() method");
    }
}
