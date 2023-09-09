package ru.otus.vadim.ivanov.java.basic.lesson12.oop3;

public class MainApp12 {

    public static void main(String[] args) {
        System.out.println("----hw12.oop3----");


        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzik", 35),
                new Cat("Vasya", 31)
        };

        Plate plt = new Plate(75);

        for (int i=0; i < cats.length; i++) {
            cats[i].eat(plt);
        }

        for (int i=0; i < cats.length; i++) {
            cats[i].info();
        }

    }

}
