package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

import java.time.Year;

public class MainApp10 {
    public static void main(String[] args) {
        System.out.println("----hw10.oop1----");


        User[] Users  = {
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

        for(int i=0; i < Users.length; i++) {
            if(CurrentYear - Users[i].getBirthYear() >= 40) {
                Users[i].info();
            }
        }

    }
}
