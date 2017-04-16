package com.rahul.teluskolearnings;

public class ClassC implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.show();
        InterfaceB.show();
    }
}
