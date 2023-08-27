package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public class Bicycle implements Movable {
    //наименование транспорта
    private String name;

    //затраты на перемещение
    private int moveCost;

    //ограничения по местности
    private Landscape[] landscapeRestriction;


    public Bicycle(String name) {
        this.name = name;
        this.moveCost = 5;

        this.landscapeRestriction = new Landscape[] {Landscape.SWAMP};
    }

    //возвращаем затраты на езду для нашего велика
    public int getCost() {
        return this.moveCost;
    }

    public boolean move(int distance, Landscape landscape) {

        //проверяем, можем ли мы перемещаться в данной местности
        for(int i = 0; i < landscapeRestriction.length; i++) {
            if(landscapeRestriction[i] == landscape) {
                System.out.println("Велосипед "+name+" не может перемещаться по переданному типу местности "+landscape);
                return false;
            }
        }

        System.out.println("Велосипед "+name+" проехал "+distance+" км. по местности "+landscape);
        return  true;
    }

}
