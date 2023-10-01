package ru.otus.vadim.ivanov.java.basic.lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp17 {

    public static void main(String[] args) {
        System.out.println("----hw17----");

        //простой список для тестов
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);

        //сортируем перед созданием дерева
        Collections.sort(listInt);

        BinarySearchTree bst = new BinarySearchTree(listInt);
        bst.printTree("");

        System.out.println(bst.find(3));
        System.out.println(bst.find(10));

        //список посложнее
        List<Integer> listBigInt = new ArrayList<>();
        listBigInt.add(15);
        listBigInt.add(24);
        listBigInt.add(5);
        listBigInt.add(78);
        listBigInt.add(99);
        listBigInt.add(10);
        listBigInt.add(120);
        listBigInt.add(111);
        listBigInt.add(10099);
        listBigInt.add(22769);
        listBigInt.add(9999999);

        Collections.sort(listBigInt);

        BinarySearchTree bstBig = new BinarySearchTree(listBigInt);
        bstBig.printTree("");

        System.out.println(bstBig.find(78));
        System.out.println(bstBig.find(222));
        System.out.println(bstBig.find(24));
        System.out.println(bstBig.getSortedList());

    }
}
