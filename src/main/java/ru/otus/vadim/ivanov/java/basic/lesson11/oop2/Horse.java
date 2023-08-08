package ru.otus.vadim.ivanov.java.basic.lesson11.oop2;

public class Horse extends WaterfowlAnimal {
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name,runSpeed,swimSpeed,endurance);
    }

    @Override
    int initSwimCost() {
        //Лошади на 1 метр плавания тратят 4 единицы
        return 4;
    }
}
