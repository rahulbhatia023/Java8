package com.rahul.others.app;

import com.rahul.others.interfaces.InterfaceC;

public class LambdaExpression {

    public static void main(String args[]) {
        InterfaceC obj = () -> System.out.println("In InterfaceCImpl show() method");
        obj.show();
    }
}
