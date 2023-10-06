package ru.otus.vadim.ivanov.java.basic.lesson21;

public class MainApp21 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----hw21----");

        double[] arr = new double[100_000_000];

        Measure measure = new Measure();

        //замеряем выполнение в одном потоке
        Thread tFull = new Thread(new Filler(arr, 0, arr.length));

        System.out.println("One thread...");
        measure.stamp();
        tFull.start();
        tFull.join();
        measure.print();


        //замеряем выполнение в четырех потоках
        int step = arr.length/4;

        Thread t1 = new Thread( new Filler(arr,0, step));
        Thread t2 = new Thread( new Filler(arr, step, step*2));
        Thread t3 = new Thread( new Filler(arr, step*2, step*3));
        Thread t4 = new Thread( new Filler(arr, step*3, arr.length));

        System.out.println("Four threads...");
        measure.stamp();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        measure.print();

    }
}
