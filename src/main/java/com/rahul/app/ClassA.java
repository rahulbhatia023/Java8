package com.rahul.app;

import com.rahul.interfaces.InterfaceA;
import com.rahul.interfaces.InterfaceB;

public class ClassA implements InterfaceA, InterfaceB {
    public static void main(String args[]) {
        ClassA objA = new ClassA();
        InterfaceA.greet();
        objA.show();
    }

    @Override
    public void show() {
        InterfaceA.show();
        InterfaceB.super.show();
    }
}
