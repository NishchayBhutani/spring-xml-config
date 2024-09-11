package com.nishchay;

public class Dev {

    private int age;
    private Laptop laptop;

    public Dev() {
        System.out.println("dev constructor");
    }

    public Dev(int age, Laptop laptop) {
        System.out.println("dev parameterized constructor");
        this.age = age;
        this.laptop = laptop;
    }

    public void build() {
        System.out.println("building a new project");
        laptop.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
