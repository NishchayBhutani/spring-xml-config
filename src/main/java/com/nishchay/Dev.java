package com.nishchay;

public class Dev {

    private Computer computer;

    public Dev() {
        System.out.println("dev constructor");
    }

    public Dev(Computer computer) {
        System.out.println("dev parameterized constructor");
        this.computer = computer;
    }

    public void build() {
        System.out.println("building a new project");
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
