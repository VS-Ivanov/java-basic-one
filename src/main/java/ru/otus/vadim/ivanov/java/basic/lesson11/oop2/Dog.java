package ru.otus.vadim.ivanov.java.basic.lesson11.oop2;

public class Dog extends WaterfowlAnimal {

    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name,runSpeed,swimSpeed,endurance);
    }

    @Override
    int initSwimCost() {
        // Собаки на 1 метр плавания - 2 ед.
        return 2;
    }
}
