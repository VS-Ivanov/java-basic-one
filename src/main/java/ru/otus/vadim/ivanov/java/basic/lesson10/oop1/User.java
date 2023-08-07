package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

public class User {
    private String surname;
    private String firstName;
    private String patronymic;

    private int birthYear;

    private String email;

    public User(String surname, String firstName, String patronymic, int birthYear, String email) {
        this.surname =  surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;

    }

    public void info() {
        System.out.println("ФИО: "+ surname +" "+ firstName +" "+ patronymic);
        System.out.println("Год рождения: "+ birthYear);
        System.out.println("e-mail:"+email);
    }

    public int getBirthYear() {
        return birthYear;
    }
}
