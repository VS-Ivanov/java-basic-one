package ru.otus.vadim.ivanov.java.basic.lesson5;

import java.util.Arrays;

public class MainApp5 {

    public static void main(String[] args) {
        System.out.println("------------hw3------------");

        System.out.println("> hw3.1");
        printString(0,"hello");

        System.out.println("> hw3.2");
        int[] arr1 = {1,2,4,6,5,7,3,2,1};
        printArraySum(arr1);

        System.out.println("> hw3.3");
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));
        fillArray(arr2,3);
        System.out.println(Arrays.toString(arr2));
    }

    public static void printString(int n, String str) {
        for(int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }

    public static void printArraySum(int[] arr) {
        //суммируем элементы, которые больше 5 и печатаем сумму
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Arr sum: "+sum);
    }

    public static void fillArray(int[] arr, int n) {
        //заполняем каждый элемент массива указанным числом
        for(int i = 0; i < arr.length; i++){
            arr[i] = n;
        }
    }
}
