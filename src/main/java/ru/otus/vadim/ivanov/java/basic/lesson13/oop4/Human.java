package ru.otus.vadim.ivanov.java.basic.lesson13.oop4;

import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport.Bicycle;
import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport.HumanDriven;
import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport.Landscape;
import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport.Movable;

public class Human {
    private String name;

    private int endurance;

    private int walkCost;

    private Movable currentTransport;

    public Human(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
        this.currentTransport = null;

        //затраты на перемещение пешком
        this.walkCost = 10;
    }

    //садимся на транспорт
    public void getOnTransport(Movable transport) {
        if(currentTransport != null) {
            System.out.println("У человека "+name+" уже есть транспорт! Сначала покиньте текущий транспорт!");
            return;
        }

        System.out.println("Человек "+name+" садится на транспорт!");
        currentTransport = transport;

        //если транспорту требуется доступ к человеку, передаем ссылку
        if(transport instanceof HumanDriven) {
            ((HumanDriven) transport).getOn(this);
        }
    }

    //покидаем текущий транспорт
    public void leaveTransport() {
        if(currentTransport == null) {
            System.out.println("У человека "+name+" нет транспорта!");
            return;
        }

        System.out.println("Человек "+name+" покидает транспорт!");
        currentTransport = null;
    }

    //ходим пешком
    private boolean walk(int distance, Landscape landscape) {

        //проверяем хватит ли у человека сил
        int enduranceConsumption = distance * walkCost;
        if(enduranceConsumption > endurance) {
            System.out.println("Человеку "+name+" не хватит сил, чтобы пройти расстояние "+distance+" км");
            return false;
        }

        System.out.println("Человек "+name+" прошел "+distance+" км. по местности "+landscape);
        endurance -= enduranceConsumption;
        System.out.println("У человека "+name+" осталось "+endurance+" выносливости");
        return  true;

    }

    //перемещаемся
    public boolean move(int distance, Landscape landscape) {

        //а вдруг :)
        if(distance <= 0) {
            System.out.println("Неккоректное значение расстояния!");
            return false;
        }

        //если транспорта нет, идем пешком
        if(currentTransport == null) {
            System.out.println("У человека "+name+" нет транспорта! Идем пешком!");
            return walk(distance,landscape);
        }

        //транспорт есть, едем на транспорте
        System.out.println("У человека "+name+" есть транспорт! Едем на нем!");

        return currentTransport.move(distance,landscape);
    }

    //доступ к выносливости
    public int getEndurance() {
        return this.endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public String toString() {
        return this.name;
    }
}
