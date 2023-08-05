package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

public class User {
    private String Surname;
    private String FirstName;
    private String Patronymic;

    private int BirthYear;

    private String email;

    public void User(String Surname, String FirstName, String Patronymic, int BirthYear, String email) {
        this.Surname =  Surname;
        this.FirstName = FirstName;
        this.Patronymic = Patronymic;
        this.BirthYear = BirthYear;
        this.email = email;

    }

    public void info() {
        System.out.println("ФИО: "+Surname+" "+FirstName+" "+Patronymic);
        System.out.println("Год рождения: "+BirthYear);
        System.out.println("e-mail:"+email);
    }
}
