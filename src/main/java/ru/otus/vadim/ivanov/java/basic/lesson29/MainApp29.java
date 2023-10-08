package ru.otus.vadim.ivanov.java.basic.lesson29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp29 {

    private class CharPrinter {

        private char printedChar;

        public CharPrinter() {
            this.printedChar = 'C';
        }

        public void print(char ch) {
                System.out.print(ch);
                printedChar = ch;
        }
    }

    //монитор для синхронизации
    private final Object mon = new Object();

    private CharPrinter chPrinter = new CharPrinter();
    public static void main(String[] args) {
        System.out.println("----hw29----");

        MainApp29 waitNotifyApp = new MainApp29();

        ExecutorService serv = Executors.newFixedThreadPool(3);

        //задача, которая печатает букву А
        serv.execute(() -> {
            waitNotifyApp.printA();
        });

        //задача, которая печатает букву B
        serv.execute(() -> {
            waitNotifyApp.printB();
        });

        //задача, которая печатает букву C
        serv.execute(() -> {
            waitNotifyApp.printC();
        });

        serv.shutdown();

    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (chPrinter.printedChar != 'C') {
                        mon.wait();
                    }
                    chPrinter.print('A');
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (chPrinter.printedChar != 'A') {
                        mon.wait();
                    }
                    chPrinter.print('B');
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (chPrinter.printedChar != 'B') {
                        mon.wait();
                    }
                    chPrinter.print('C');
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
