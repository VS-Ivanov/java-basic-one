package ru.otus.vadim.ivanov.java.basic.lesson5;

public class MainApp5 {

    public static void main(String[] args) {
        System.out.println("------------hw3------------");

        System.out.println("> hw3.1");
        printString(0,"hello");
    }

    public static void printString(int n, String str) {
        for(int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }
}
