package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Auto extends Transport implements Movable {

    public Auto(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
        this.moveCost = 1;

        //машина не может перемещаться через лес и болото
        this.landscapeRestriction = new Landscape[] {Landscape.DEEP_FOREST,Landscape.SWAMP};
    }

    public boolean move(int distance, Landscape landscape) {

        //проверяем, можем ли мы перемещаться в данной местности
        for(int i = 0; i < landscapeRestriction.length; i++) {
            if(landscapeRestriction[i] == landscape) {
                System.out.println("Машина "+name+" не может перемещаться по переданному типу местности "+landscape);
                return false;
            }
        }

        //проверяем хватит ли у нас топлива
        int fuelConsumption = distance * moveCost;
        if(fuelConsumption > fuel) {
            System.out.println("Машине "+name+" не хватит топлива, чтобы проехать расстояние "+distance+" км");
            return false;
        }

        System.out.println("Машина "+name+" проехала "+distance+" км. по местности "+landscape);
        fuel -= fuelConsumption;
        System.out.println("У машины "+name+" осталось "+fuel+" л. топлива");
        return  true;
    }
}
