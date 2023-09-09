package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

import ru.otus.vadim.ivanov.java.basic.lesson13.oop4.Human;

public interface HumanDriven {
    //методы связывающие водителя и транспорт
    public void getOn(Human driver);

    public void getOff();

}
