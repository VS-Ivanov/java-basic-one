package ru.otus.vadim.ivanov.java.basic.lesson11.oop2;

//обычные животные
public abstract class Animal {
    //имя
    String name;

    //скорость бега м/с
    private int runSpeed;

    //выносливость ед.
    int endurance;

    //Все животные на 1 метр бега тратят 1 ед выносливости
    private final int runCost = 1;

    public Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    public int run(int distance) {
        int actionCost = runCost * distance;
        if(actionCost > endurance) {
            System.out.println("Животное "+name+" устало");
            return -1;
        }

        endurance -= actionCost;
        int time = distance/runSpeed;
        System.out.println("Животное "+name+" пробежало "+distance+" м за "+time+" c");

        return time;
    }

    public void info() {
        System.out.println("У "+name+" "+endurance+" ед выносливости.");
    }

}
