package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Rover extends FueledTransport {

    public Rover (String name, int fuel) {

        //затраты на перемещение ровера - 2
        //ровер может перемещаться повсюду
        super(name,fuel,2,null);
    }

}
