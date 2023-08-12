package ru.otus.vadim.ivanov.java.basic.lesson12.oop3;

public class Plate {

    //максимальное количество еды в ед.
    private int maxVolume;

    //текущее количество еды в ед.
    private int currentVolume;

    public Plate(int startVolume) {
        this.maxVolume = startVolume;
        this.currentVolume = startVolume;
    }

    public void addFood(int foodVolume) {
        if((currentVolume + foodVolume) > maxVolume) {
            System.out.println("В тарелке не может быть еды больше максимального!");
            return;
        }
        currentVolume+=foodVolume;
    }

    public boolean removeFood(int foodVolume) {
        if(foodVolume >  currentVolume) {
            System.out.println("В тарелке не может быть отрицательное количество еды!");
            return false;
        }
        currentVolume -= foodVolume;
        return true;
    }

    public int getFood() {
        return currentVolume;
    }
}
