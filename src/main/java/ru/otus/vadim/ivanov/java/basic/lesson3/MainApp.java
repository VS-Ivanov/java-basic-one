package ru.otus.vadim.ivanov.java.basic.lesson3;

import java.util.Scanner;

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

        System.out.println("\n> hw2.4");
        compareNumbers();

        System.out.println("\n> hw2.5");
        addOrSubtractAndPrint(166, 6, true);

        System.out.println("\n> hw2.*");

        Scanner sc = new Scanner(System.in);
        int methodNumber = sc.nextInt();

        switch (methodNumber) {
            case 1:
                greetings();
                break;

            case 2:
                int a = (int) (Math.random() * Integer.MAX_VALUE);
                int b = (int) (Math.random() * Integer.MAX_VALUE);
                int c = (int) (Math.random() * Integer.MAX_VALUE);
                System.out.println("Random args: a="+a+", b="+b+", c="+c);
                checkSign(a,b,c);
                break;

            case 3:
                selectColor();
                break;

            case 4:
                compareNumbers();
                break;

            case 5:
                int initValue = (int) (Math.random() * Integer.MAX_VALUE);
                int delta = (int) (Math.random() * Integer.MAX_VALUE);
                boolean increment = Math.random() < 0.5;
                System.out.println("Random args: initValue="+initValue+", delta="+delta+", increment="+increment);
                addOrSubtractAndPrint(initValue, delta, increment);
                break;

            default:
                System.out.println("Вы ввели неправильное число");
                break;
        }

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

    public static void compareNumbers() {
        int a = 8;
        int b = 17;

        if(a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
