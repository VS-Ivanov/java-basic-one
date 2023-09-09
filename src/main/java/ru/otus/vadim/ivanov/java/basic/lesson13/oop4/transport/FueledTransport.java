package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.Human;

public class FueledTransport implements Movable {
    //наименование транспорта
    private String name;

    //объем топлива в литрах
    private int fuel;

    //затраты на перемещение
    private int moveCost;

    //ограничения по местности
    private Landscape[] landscapeRestriction;

    public FueledTransport(String name, int fuel, int moveCost, Landscape...landscapeRestriction) {
        this.name = name;
        this.fuel = fuel;
        this.moveCost = moveCost;
        this.landscapeRestriction = landscapeRestriction;
    }

    //метод движения для транспорта, работающего на топливе
    public boolean move(int distance, Landscape landscape) {

        //проверяем, можем ли мы перемещаться в данной местности
        if(landscapeRestriction != null) {
            for (int i = 0; i < landscapeRestriction.length; i++) {
                if (landscapeRestriction[i] == landscape) {
                    System.out.println("Транспорт " + name + " не может перемещаться по переданному типу местности " + landscape);
                    return false;
                }
            }
        }

        //проверяем хватит ли у нас топлива
        int fuelConsumption = distance * moveCost;
        if(fuelConsumption > fuel) {
            System.out.println("Транспорту "+name+" не хватит топлива, чтобы проехать расстояние "+distance+" км");
            return false;
        }

        System.out.println("Транспорт "+name+" проехал "+distance+" км. по местности "+landscape);
        fuel -= fuelConsumption;
        System.out.println("У транспорта "+name+" осталось "+fuel+" л. топлива");
        return  true;
    }

}
