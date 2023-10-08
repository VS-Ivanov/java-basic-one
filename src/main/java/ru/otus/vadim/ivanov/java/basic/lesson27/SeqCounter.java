package ru.otus.vadim.ivanov.java.basic.lesson27;

public class SeqCounter {
    private int count;

    public SeqCounter() {this.count = 0;}

    public synchronized int getCount() {return count;}

    // на всякий случай синхронизируемся
    public synchronized void inc() { count++;}
}
