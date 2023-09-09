package ru.otus.vadim.ivanov.java.basic.lesson13.oop4;

import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport.*;
public class MainApp13 {

    public static void main(String[] args) {
        System.out.println("----hw13.oop4----");

        Auto car1 = new Auto("Жигули", 30);
        Human human1 = new Human("Иван Иванович",110);

        //ходим по равнине без транспорта
        human1.move(10,Landscape.PLAIN);

        //берем транспорт
        human1.getOnTransport(car1);

        //пытаемся ехать по лесу
        human1.move(10,Landscape.DEEP_FOREST);

        //меняем транспорт на лошадь
        Horse maxim = new Horse("Maxim",500);
        human1.getOnTransport(maxim);

        // не получилось, сначала покидаем машину
        human1.leaveTransport();
        human1.getOnTransport(maxim);

        //пытаемся снова по лесу
        human1.move(10,Landscape.DEEP_FOREST);

        //впереди болото
        human1.move(20,Landscape.SWAMP);

        //меняем лошадь на вездеход
        human1.leaveTransport();

        Rover rover1 = new Rover("Rover1", 45);
        human1.getOnTransport(rover1);

        //пробуем снова
        human1.move(20,Landscape.SWAMP);

        // по равнине можно ехать на велосипеде
        human1.leaveTransport();

        Bicycle bike = new Bicycle("Bicycle1");

        human1.getOnTransport(bike);
        human1.move(2, Landscape.PLAIN);

        human1.move(10, Landscape.PLAIN);

    }
}
