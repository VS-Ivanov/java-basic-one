package ru.otus.vadim.ivanov.java.basic.lesson15;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Employee: name - "+this.name+", age - "+this.age;
    }
}
