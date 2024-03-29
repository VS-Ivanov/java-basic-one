package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

import java.time.Year;

public class MainApp10 {
    public static void main(String[] args) {
        System.out.println("----hw10.oop1----");


        User[] users  = {
                new User("Иванов", "Иван", "Иванович", 1967, "ivanov@hotmail.com"),
                new User("Лиховидов", "Павел", "Андреевич", 1977, "liho@xxx.ru"),
                new User("Иванов", "Владислав", "Семенович", 1988, "vlad@gmail.com"),
                new User("Симонов", "Артем", "Иванович", 1989, "tema@mail.ru"),
                new User("Морозов", "Павел", "Сергеевич", 1991, "pasha@xxx.ru"),
                new User("Семенов", "Игорь", "Владиславович", 1975, "semen@gmail.com"),
                new User("Пыхтин", "Даниил", "Игоревич", 1992, "puh@mail.ru"),
                new User("Кеплер", "Иоганн", "Иванович", 1571, "kepler@earth.org"),
                new User("Магомедов", "Магомед", "Магомедович", 1965, "maga@maga.com"),
                new User("Ерасов", "Олег", "Поликарпович", 1981, "oleg_er@mail.ru")
        };

        int CurrentYear = Year.now().getValue();

        for(int i=0; i < users.length; i++) {
            if(CurrentYear - users[i].getBirthYear() >= 40) {
                users[i].info();
            }
        }

        System.out.println("----Коробка----");
        MagicBox mBox = new MagicBox(75,50,50, "green");

        mBox.info();

        mBox.setColor("black");
        mBox.info();

        mBox.put("rabbit");

        mBox.open();
        mBox.put("rabbit");
        mBox.close();

        mBox.info();

        String surprise  = mBox.takeOut();

        if(surprise == null) {
            mBox.open();
            surprise = mBox.takeOut();
        }

        mBox.info();

    }
}
