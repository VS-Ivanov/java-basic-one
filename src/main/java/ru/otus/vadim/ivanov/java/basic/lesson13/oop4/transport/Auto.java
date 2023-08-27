package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Auto extends FueledTransport {

    public Auto(String name, int fuel) {

        //затраты на перемещение машины - 1
        //машина не может перемещаться через лес и болото
        super(name,fuel,1,new Landscape[] {Landscape.DEEP_FOREST,Landscape.SWAMP});

    }


}
