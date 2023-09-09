package ru.otus.vadim.ivanov.java.basic.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<PhoneEntry>> phoneMap;

    public PhoneBook(){
        this.phoneMap = new HashMap<>();
    }

    //метод добавляет новую запись в книгу
    public void add(PhoneEntry contact) {
        List<PhoneEntry> contactList;
        contactList = phoneMap.get(contact.getSurname());
        if( contactList != null) {
            //такая фамилия уже есть в книге, добавляем контакт к ней
            contactList.add(contact);
        } else {
            //такой фамилии еще нет, добавляем список в книгу
            contactList = new ArrayList<>();
            contactList.add(contact);
            phoneMap.put(contact.getSurname(),contactList);
        }
    }

    //метод выполняет поиск телефонов по фамилии
    public List<PhoneEntry> find (String surname) {
        //если ничего нет, просто возвращаем пустой список
        return phoneMap.get(surname) != null?phoneMap.get(surname): new ArrayList<>();
    }

    //метод проверяем наличие телефона в справочнике
    public boolean containsPhoneNumber(String phoneNumber) {

        //обходим все записи в книге и если попался наш номер, возвращаем true
        for(List<PhoneEntry> contacts: phoneMap.values()) {
            for(PhoneEntry contact: contacts) {
                if(contact.getPhoneNumber() == phoneNumber) {
                    return true;
                }
            }
        }
        //если во время обхода ничего не нашли - false
        return  false;
    }

}
