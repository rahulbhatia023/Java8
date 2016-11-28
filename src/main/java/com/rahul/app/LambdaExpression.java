package com.rahul.app;

import com.rahul.interfaces.InterfaceC;

public class LambdaExpression {

    public static void main(String args[]) {
        InterfaceC obj = () -> System.out.println("In InterfaceCImpl show() method");
        obj.show();
    }
}
