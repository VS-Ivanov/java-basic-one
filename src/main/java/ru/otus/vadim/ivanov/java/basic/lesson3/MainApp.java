package ru.otus.vadim.ivanov.java.basic.lesson3;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("-----hw1-----");
        System.out.println("Hello World!");

        System.out.println("\n-----hw2-----");
        System.out.println("> hw2.1");
        greetings();

        System.out.println("\n> hw2.2");
        checkSign(166,9,14);
        checkSign(-166,9,15);

        System.out.println("\n> hw2.3");
        selectColor();


    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 8;
        if(data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
