package ru.otus.vadim.ivanov.java.basic.lesson26;

public class MainApp26 {
    public static void main(String[] args) {
        System.out.println("----hw26----");

        Apple ap1 = new Apple();
        System.out.println(ap1.getWeight());

        Orange or1 = new Orange();

        Box<Apple> box1 = new Box<>();
        System.out.println(box1.weight());

        box1.addFruit(ap1);
        System.out.println(box1.weight());

        //так будет ошибка
        //box1.addFruit(or1);

        //а так нормально
        box1.addFruit(new Apple());
        System.out.println(box1.weight());

        //сравниваем коробку яблок и коробку апельсинов
        Box<Orange> box2 = new Box<>();
        box2.addFruit(or1);
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());

        //а так равны
        System.out.println(box2.compare(box3));
        //и так
        System.out.println(box2.compare(box2));

        //перенос фруктов из box3 в box2
        box3.transfer(box2);
        System.out.println(box2.weight());
        System.out.println(box3.weight());

        //так ошибка
        //box1.transfer(box2);

        //создаем общую коробку и пересыпаем все в нее
        Box<Fruit> largeBox = new Box<>();
        box1.transfer(largeBox);
        box2.transfer(largeBox);
        System.out.println(largeBox.weight());
    }
}
