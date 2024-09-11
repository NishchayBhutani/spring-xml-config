package com.nishchay;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("desktop constructor");
    }

    @Override
    public void compile() {
        System.out.println("compiling with desktop");
    }
}
