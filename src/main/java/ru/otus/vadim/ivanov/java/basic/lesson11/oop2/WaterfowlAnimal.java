package ru.otus.vadim.ivanov.java.basic.lesson11.oop2;

//водоплавающие
public abstract class WaterfowlAnimal extends Animal {

    private int swimCost;
    private int swimSpeed;
    public WaterfowlAnimal(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name,runSpeed,endurance);
        this.swimSpeed = swimSpeed;

        this.swimCost = initSwimCost();

    }

    public int swim(int distance) {
        int actionCost = swimCost * distance;
        if(actionCost > endurance) {
            System.out.println("Животное "+name+" устало");
            return -1;
        }

        endurance -= actionCost;
        int time = distance/swimSpeed;
        System.out.println("Животное "+name+" проплыло "+distance+" м за "+time+" c");

        return time;
    }

    abstract int initSwimCost();
}
