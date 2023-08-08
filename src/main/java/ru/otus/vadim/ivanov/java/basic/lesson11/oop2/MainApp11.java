package ru.otus.vadim.ivanov.java.basic.lesson11.oop2;

public class MainApp11 {

    public static void main(String[] args) {
        System.out.println("----hw11.oop2----");

        System.out.println("----Cat----");
        Cat barsik = new Cat("Barsik",10, 100);
        barsik.info();

        barsik.run(10);
        barsik.info();

        barsik.run(100);
        barsik.info();

        System.out.println("----Dog----");
        Dog bobik = new Dog("Bobik",20,10,200);
        bobik.info();

        bobik.run(100);
        bobik.info();

        bobik.swim(10);
        bobik.info();

        bobik.swim(150);

        System.out.println("----Horse----");
        Horse maxim = new Horse("Maxim",100,50, 5000);
        maxim.run(1000);
        maxim.info();
        maxim.swim(500);
        maxim.info();



    }
}
