package ru.otus.vadim.ivanov.java.basic.lesson16;

public class PhoneEntry {

    //фамилия
    private String surname;

    //имя
    private String firstName;

    //отчество
    private String patronymic;

    //номер телефона
    private String phoneNumber;

    public PhoneEntry(String surname, String firstName, String patronymic,String phoneNumber) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return this.surname+" "+this.firstName+" "+this.patronymic;
    }
}
