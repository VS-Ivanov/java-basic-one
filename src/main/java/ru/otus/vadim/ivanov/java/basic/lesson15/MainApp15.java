package ru.otus.vadim.ivanov.java.basic.lesson15;

import java.util.ArrayList;

public class MainApp15 {
    public static void main(String[] args) {
        System.out.println("----hw15----");

        System.out.println(getRange(2,10));

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(2);
        intList.add(0);
        intList.add(15);
        System.out.println(sumIntList(intList));

        intList.add(null);
        intList.add(25);

        //все элементы, кроме предпоследнего меняются на 8
        replaceListItem(8,intList);
        System.out.println(intList);

        //повсюду получим 16, в предпоследнем 8
        increaseListItem(8,intList);
        System.out.println(intList);

    }

    //метод возвращает список последовательных значений
    public static ArrayList getRange(int min, int max) {

        ArrayList<Integer> resultRange = new ArrayList<>();

        // по хорошему такого быть не должно
        if(min >max) {
            return resultRange;
        }

        //разворачиваем диапазон и возвращаем результат
        for(int i=min;i<=max;i++) {
            resultRange.add(i);
        }
        return resultRange;
    }

    //метод суммирующий целые числа в списке, которые больше 5
    public static int sumIntList(ArrayList<Integer> intList) {
        int sum = 0;
        for(int listValue : intList) {
            if(listValue > 5) {
                sum += listValue;
            }
        }
        return sum;
    }

    //метод должен переписать каждую заполненную ячейку списка указанным числом
    public static void replaceListItem(int value, ArrayList<Integer> intList) {

        for(int i = 0; i < intList.size(); i++) {
            //исходим из того, что если ячейка не заполнена - там null
            if(intList.get(i) != null) {
                intList.set(i,value);
            }
        }
    }

    //метод увеличивающий каждый элемент списка на указанное число
    public static void increaseListItem(int value, ArrayList<Integer> intList) {

        for(int i = 0; i< intList.size(); i++) {
            Integer listItem = intList.get(i);
            // если в ячейке есть значение - увеличим его
            if(listItem != null) {
                intList.set(i,listItem + value);
            } else {
                // если в ячейке null, просто присваиваем значение
                intList.set(i,value);
            }
        }
    }


}
