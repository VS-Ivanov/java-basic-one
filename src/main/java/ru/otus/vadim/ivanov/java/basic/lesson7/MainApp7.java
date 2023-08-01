package ru.otus.vadim.ivanov.java.basic.lesson7;

import java.util.Arrays;

public class MainApp7 {

    public static void main(String[] args) {
        System.out.println("----hw7----");

        System.out.println("----hw7.1----");
        int[][] arr1 = {{-1,3,-4}, {0,5,0},{1,56,3}};
        System.out.println(sumOfPositiveElements(arr1));

        System.out.println("----hw7.2----");
        drawBox(5);

        System.out.println("----hw7.3----");
        int[][] arr2 = {{-1,3,-4}, {4,5,19},{1,56,3}};
        setNullOnDiagonal(arr2);
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("----hw7.4----");
        int[][] arr3 = {{1,3,-4}, {-4,5,-19},{1,-56,3}};
        System.out.println(findMax(arr3));

        System.out.println("----hw7.5----");
        int[][] arr4 = {{1,3,34}};
        System.out.println(sumOfSecondArrRaw(arr4));

        int[][] arr5 = {{1,3,34},{4,5,89}};

        System.out.println(sumOfSecondArrRaw(arr5));

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for(int i=0; i < arr.length;i++){
            for(int j=0; j <arr[i].length;j++){
                if(arr[i][j] > 0) {
                   sum +=  arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void drawBox(int size) {
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void setNullOnDiagonal(int[][] arr) {
        int[] offset = {0,0};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if( (offset[0] == i) && (offset[1] == j)) {
                    arr[i][j] = 0;
                    offset[0]++;
                    offset[1]++;
                }
            }
        }
    }

    public static int findMax(int[][] array) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < array.length;i++) {
            for(int j = 0; j < array[i].length;j++){
               if( array[i][j] > result) {
                   result = array[i][j];
               }
            }
        }
        return result;
    }

    public static int sumOfSecondArrRaw(int[][] array) {
        if(array.length < 2) {
            return  -1;
        } else {
            int sum = 0;
            for (int i = 0; i < array[1].length;i++) {
                sum += array[1][i];
            }
            return sum;
        }
    }
}
