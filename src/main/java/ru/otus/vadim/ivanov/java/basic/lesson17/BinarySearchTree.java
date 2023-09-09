package ru.otus.vadim.ivanov.java.basic.lesson17;

import java.util.List;

public class BinarySearchTree implements SearchTree{

    Integer value;
    BinarySearchTree left;
    BinarySearchTree right;

    List<Integer> sortedList;

    public BinarySearchTree(List<Integer> inputList) {
        //конструктор дерева
        //исходим из того, что список пришел уже отсортированный
        //найти середину списка, взять центральный элемент и раскидать остальное по веткам

       this.sortedList = inputList;
       int len = inputList.size();

       if(len > 0) {
           int low = 0;
           int mid = len/2;
           int high = len - 1;

           //если есть меньшие значения, добавляем их слева
           if(mid > low) {
               this.left = new BinarySearchTree(inputList.subList(low, mid));
           }

           //если есть большие значения, добавляем их справа
           if(mid < high) {
               this.right = new BinarySearchTree(inputList.subList(mid+1, len));
           }

           this.value = inputList.get(mid);
       }

    }

    @Override
    public Integer find(Integer element) {
        // такое иногда бывает
        if(element == null) {
            return null;
        }

        // если значение для поиска равно текущему, то возвращаем его
        if(element == value) {
            return value;
        }

        // если значение больше и ссылка не нулевая, то вызываем себя для правой ветки
        if((element > value) && (right != null)) {
            return right.find(element);
        }

        // если значение меньше и ссылка не нулевая, то вызываем себя для левой ветки
        if((element < value) && (left != null)) {
            return left.find(element);
        }

        // печатаем что элемент не найден
        System.out.println("Значение :"+element+" не найдено в дереве!");
        return null;
    }

    @Override
    public List getSortedList() {
        //возврат отсортированного списка
        return sortedList;
    }

    public void printTree(String prefix) {
        System.out.println(prefix+value);

        if(left != null) {
            left.printTree(prefix+value+"->");
        }

        if(right != null) {
            right.printTree(prefix+value+"->");
        }
    }
}
