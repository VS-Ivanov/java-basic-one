package ru.otus.vadim.ivanov.java.basic.lesson7;

public class MainApp7 {

    public static void main(String[] args) {
        System.out.println("----hw7----");

        System.out.println("----hw7.1----");
        int[][] arr1 = {{-1,3,-4}, {0,5,0},{1,56,3}};
        System.out.println(sumOfPositiveElements(arr1));

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for(int i1=0; i1 < arr.length;i1++){
            for(int i2=0; i2 <arr[i1].length;i2++){
                if(arr[i1][i2] > 0) {
                   sum +=  arr[i1][i2];
                }
            }
        }
        return sum;
    }
}
