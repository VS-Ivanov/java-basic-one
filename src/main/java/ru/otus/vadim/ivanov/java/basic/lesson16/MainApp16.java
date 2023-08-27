package ru.otus.vadim.ivanov.java.basic.lesson16;

import java.util.*;

public class MainApp16 {
    public static void main(String[] args) {
        System.out.println("----hw16----");

        PhoneEntry contact1 = new PhoneEntry("Иванов","Иван","Иванович","+7(909)313-11-29");
        PhoneEntry contact2 = new PhoneEntry("Пыхтин","Даниил","Петрович","+7(905)111-55-14");
        PhoneEntry contact3 = new PhoneEntry("Иванов","Александр","Павлович","8(928)541-12-49");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(contact1);
        phoneBook.add(contact2);
        phoneBook.add(contact3);

        //ищем записи по фамилии
        for(PhoneEntry contact: phoneBook.find("Иванов")) {
            System.out.println(contact.getFullName()+" : "+contact.getPhoneNumber());
        }

        for(PhoneEntry contact: phoneBook.find("Пыхтин")) {
            System.out.println(contact.getFullName()+" : "+contact.getPhoneNumber());
        }

        for(PhoneEntry contact: phoneBook.find("Петров")) {
            System.out.println(contact.getFullName()+" : "+contact.getPhoneNumber());
        }

        //ищем есть ли номера в книге
        // ожидаем true
        System.out.println("+7(909)313-11-29 - "+phoneBook.containsPhoneNumber("+7(909)313-11-29"));

        // ожидаем false
        System.out.println("+7(903)277-11-29 - "+phoneBook.containsPhoneNumber("+7(903)277-11-29"));

        //ожидаем true
        System.out.println("8(928)541-12-49 - "+phoneBook.containsPhoneNumber("8(928)541-12-49"));


    }
}
