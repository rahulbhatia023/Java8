package com.rahul.others.app;

import com.rahul.others.interfaces.InterfaceA;
import com.rahul.others.interfaces.InterfaceB;

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
