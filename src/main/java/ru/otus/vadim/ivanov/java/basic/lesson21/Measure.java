package ru.otus.vadim.ivanov.java.basic.lesson21;

public class Measure {
    private static long time;

    public void stamp() {time = System.currentTimeMillis();}
    public void print() {
        time = System.currentTimeMillis() - time;
        System.out.println("Time: "+time+" ms");
    }
}
