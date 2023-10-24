package ru.otus.vadim.ivanov.java.basic.lesson26;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    //фрукты хранящиеся в коробке
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public int weight() {
        return fruits.stream().mapToInt( fruit -> fruit.getWeight()).sum();
    }

    public boolean compare(Box<?> box) {
        if(box == null) {return false;}
        if(box == this) {return true;}

        return (this.weight() == box.weight());
    }

    //пересыпаем фрукты из текущей коробки в другую
    public void transfer(Box<? super T> box) {
        if((box == null) || (box == this) ) {return;}
        for(T fruit: fruits) {
            box.addFruit(fruit);
            //fruits.remove(fruit); - ConcurrentModificationException :)
        }
        fruits.clear();
    }
}
