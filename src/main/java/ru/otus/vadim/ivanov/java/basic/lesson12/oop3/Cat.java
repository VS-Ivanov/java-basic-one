package ru.otus.vadim.ivanov.java.basic.lesson12.oop3;

public class Cat {

    private String name;

    private int appetite;

    //сытость кода
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

        // при создании кот всегда голоден
        this.isFull = false;
    }

    public void eat(Plate plate) {

        //если коту мало еды в тарелке, он ее не трогает
        if(plate.getFood() < appetite) {
            System.out.println("Для кота "+name+" мало еды в тарелке.");
            return;
        }

        plate.removeFood(appetite);
        isFull = true;
        System.out.println("Кот "+name+" поел.");
    }

    public void info() {
        if(isFull) {
            System.out.println("Кот "+name+" сыт.");
        } else {
            System.out.println("Кот "+name+" голоден.");
        }
    }
}
