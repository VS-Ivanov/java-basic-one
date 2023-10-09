package ru.otus.vadim.ivanov.java.basic.lesson30;

import java.util.Arrays;

public class MainApp30 {
    public static void main(String[] args) {
        System.out.println("----hw18----");

        int[] arr = {1, 2, 1, 2, 2, };
        int[] arr2 = {1,1};
        int[] arr3 = {2,2,3};
        int[] arr4 = {1,2,1,2};

        System.out.println(Arrays.toString(getArrAfterLastOne(arr3)));

        System.out.println(arrIsContainOneTwoOnly(arr4));
    }

    public static int[] getArrAfterLastOne(int[] arr){
        int lastOneIndex = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 1) {lastOneIndex = i;}
        }

        //если в массиве нет единиц - исключение
        if(lastOneIndex == -1) {
            throw new RuntimeException("the passed array does not contain value 1 ");
        }

        //если единица последняя в массиве возвращаем пустой массив
        if(lastOneIndex == arr.length-1) {
            return new int[0];
        }
        //возвращаем все что идет после последней единицы
        return Arrays.copyOfRange(arr,lastOneIndex+1,arr.length);
    }

    public static boolean arrIsContainOneTwoOnly(int[] arr){
        int oneCount = 0, twoCount = 0;
        for(int i=0;i<arr.length;i++){

            if(arr[i] != 1 && arr[i] != 2) {return false;}
            else if(arr[i] == 1) {oneCount++;}
            else if(arr[i] == 2) {twoCount++;}
        }

        if(oneCount == 0 || twoCount == 0) {return  false;}
        return true;
    }
}
