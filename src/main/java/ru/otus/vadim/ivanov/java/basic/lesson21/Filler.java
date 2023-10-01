package ru.otus.vadim.ivanov.java.basic.lesson21;

public class Filler implements Runnable {

    private double[] arr;
    private int startIndex;
    private int endIndex;
    public Filler(double[] arr, int startIndex, int endIndex) {
        this.arr = arr;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    @Override
    public void run() {
        for(int i=startIndex; i<endIndex; i++){
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

    }
}
