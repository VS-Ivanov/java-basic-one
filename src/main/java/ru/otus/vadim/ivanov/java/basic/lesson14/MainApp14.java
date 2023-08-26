package ru.otus.vadim.ivanov.java.basic.lesson14;

public class MainApp14 {

    public static void main(String[] args) {
        System.out.println("----hw14----");

        String[][] test_arr = {
                {"1","3","4","6"},
                {"4","5","6","7"},
                {"67","5","3","2"},
                {"45","12","55","78"}
        };

        try {
            System.out.println("Сумма элементов массива равна: "+sumArray(test_arr));
        }
        catch (AppArraySizeException e) {
            System.out.println("AppArraySizeException: "+e.getMessage());
        }
         catch (AppArrayDataException e) {
             System.out.println("AppArrayDataException: "+e.getMessage());
         }
        catch (Exception e) {
            //неопознанное исключение
            System.out.println(e.getClass()+": "+e.getMessage());
        }

    }

    //максимальное количество элементов в массиве
    private static final int MAX_SIZE = 4;

    public static int sumArray(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        //если размерность массива не MAX_SIZE - бросаем исключение
        if(arr.length != MAX_SIZE) {
            throw  new AppArraySizeException("Неверный размер массива! Используйте массив строк 4*4!");
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != MAX_SIZE) {
                throw new AppArraySizeException("Неверный размер массива! Используйте массив строк 4*4!");
            }
            //обходим строки и суммируем
            for(int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new AppArrayDataException("Неверные данные в ячейке i="+i+", j="+j+"! В массиве должны содержаться только целые числа!");
                }

            }
        }

        return sum;
    }
}
