package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Horse extends Transport implements Movable {
    public Horse(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
        this.moveCost = 4;

        //лошадь не может перемещатсья по болоту
        this.landscapeRestriction = new Landscape[] {Landscape.SWAMP};
    }

    public boolean move(int distance, Landscape landscape) {
        //проверяем, можем ли мы перемещаться в данной местности
        for(int i = 0; i < landscapeRestriction.length; i++) {
            if(landscapeRestriction[i] == landscape) {
                System.out.println("Лошадь "+name+" не может перемещаться по переданному типу местности "+landscape);
                return false;
            }
        }

        //проверяем хватит ли у лошади сил
        int enduranceConsumption = distance * moveCost;
        if(enduranceConsumption > endurance) {
            System.out.println("Лошади "+name+" не хватит сил, чтобы проскакать расстояние "+distance+" км");
            return false;
        }

        System.out.println("Лошадь "+name+" проскакала "+distance+" км. по местности "+landscape);
        endurance -= enduranceConsumption;
        System.out.println("У лошади "+name+" осталось "+endurance+" выносливости");
        return  true;

    }
}
