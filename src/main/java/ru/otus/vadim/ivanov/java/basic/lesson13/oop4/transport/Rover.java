package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Rover extends Transport implements Movable {

    public Rover (String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
        this.moveCost = 2;
    }

    public boolean move(int distance, Landscape landscape) {

        // у ровера нет ограничений по местности, только топливо
        int fuelConsumption = distance * moveCost;
        if(fuelConsumption > fuel) {
            System.out.println("Вездеходу "+name+" не хватит топлива, чтобы проехать расстояние "+distance+" км");
            return false;
        }

        System.out.println("Вездеход "+name+" проехал "+distance+" км. по местности "+landscape);
        fuel -= fuelConsumption;
        System.out.println("У вездехода "+name+" осталось "+fuel+" л. топлива");
        return  true;

    }

}
