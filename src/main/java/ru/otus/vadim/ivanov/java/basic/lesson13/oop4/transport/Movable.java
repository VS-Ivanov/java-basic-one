package ru.otus.vadim.ivanov.java.basic.lesson13.oop4.transport;

public interface Movable {
    // метод перемещения, принимает дистанцию в км и тип местности, возвращает true или false
    public boolean move(int distance, Landscape landscape);
}
