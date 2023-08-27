package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.Human;

public class Bicycle implements Movable, HumanDriven {
    //наименование транспорта
    private String name;

    //затраты на перемещение
    private int moveCost;

    //ограничения по местности
    private Landscape[] landscapeRestriction;

    //ссылка на водителя
    private Human driver;


    public Bicycle(String name) {
        this.name = name;
        this.moveCost = 5;

        this.landscapeRestriction = new Landscape[] {Landscape.SWAMP};
    }

    public boolean move(int distance, Landscape landscape) {

        //проверяем, можем ли мы перемещаться в данной местности
        for(int i = 0; i < landscapeRestriction.length; i++) {
            if(landscapeRestriction[i] == landscape) {
                System.out.println("Велосипед "+name+" не может перемещаться по переданному типу местности "+landscape);
                return false;
            }
        }

        //проверим, что хватит сил крутить педали
        int enduranceConsumption = distance * moveCost;
        if(enduranceConsumption > driver.getEndurance()) {
            System.out.println("Человеку "+driver+" не хватит сил, чтобы проехать на велосипеде "+distance+" км");
            return false;
        }

        //сил хватает, пробуем ехать
        driver.setEndurance(driver.getEndurance() - enduranceConsumption);
        System.out.println("У человека "+driver+" осталось "+driver.getEndurance()+" выносливости после езды на велосипеде");

        System.out.println("Велосипед "+name+" проехал "+distance+" км. по местности "+landscape);
        return true;
    }

    public void getOn(Human driver) {
        if(this.driver != null) {
            System.out.println("У велосипеда "+name+" уже есть водитель!");
            return;
        }
        this.driver = driver;
    }

    public void getOff() {
        if(this.driver == null) {
            System.out.println("У велосипеда "+name+" нет водителя!");
            return;
        }
        this.driver = null;
    }


}
