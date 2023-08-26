package ru.otus.vadim.ivanov.java.basic.lesson15;

import java.util.ArrayList;

public class MainApp15 {
    public static void main(String[] args) {
        System.out.println("----hw15----");

        System.out.println(getRange(2,10));

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(2);
        intList.add(0);
        intList.add(15);
        System.out.println(sumIntList(intList));

        intList.add(null);
        intList.add(25);

        //все элементы, кроме предпоследнего меняются на 8
        replaceListItem(8,intList);
        System.out.println(intList);

        //повсюду получим 16, в предпоследнем 8
        increaseListItem(8,intList);
        System.out.println(intList);

        //список сотрудников
        ArrayList<Employee>  employees = new ArrayList<>();
        employees.add(new Employee("Иван",41));
        employees.add(new Employee("Николай", 35));
        employees.add(new Employee("Даниил",27));

        System.out.println(getEmployeesNames(employees));

        //получим двух сотрудников старше 30
        ArrayList<Employee> employeesOlder30 = getEmployeesOlderThan(30,employees);
        System.out.println(employeesOlder30);

        //проверяем что средний возраст не превышает 35 лет
        System.out.println(checkAvgAgeMoreThan(35,employees));

        //проверяем что средний возраст превышает 30 лет
        System.out.println(checkAvgAgeMoreThan(30, employees));

        //получаем самого молодого сотрудника - Даниил
        System.out.println(getYoungestEmployee(employees));
    }

    //метод возвращает список последовательных значений
    public static ArrayList getRange(int min, int max) {

        ArrayList<Integer> resultRange = new ArrayList<>();

        // по хорошему такого быть не должно
        if(min >max) {
            return resultRange;
        }

        //разворачиваем диапазон и возвращаем результат
        for(int i=min;i<=max;i++) {
            resultRange.add(i);
        }
        return resultRange;
    }

    //метод суммирующий целые числа в списке, которые больше 5
    public static int sumIntList(ArrayList<Integer> intList) {
        int sum = 0;
        for(int listValue : intList) {
            if(listValue > 5) {
                sum += listValue;
            }
        }
        return sum;
    }

    //метод должен переписать каждую заполненную ячейку списка указанным числом
    public static void replaceListItem(int value, ArrayList<Integer> intList) {

        for(int i = 0; i < intList.size(); i++) {
            //исходим из того, что если ячейка не заполнена - там null
            if(intList.get(i) != null) {
                intList.set(i,value);
            }
        }
    }

    //метод увеличивающий каждый элемент списка на указанное число
    public static void increaseListItem(int value, ArrayList<Integer> intList) {

        for(int i = 0; i< intList.size(); i++) {
            Integer listItem = intList.get(i);
            // если в ячейке есть значение - увеличим его
            if(listItem != null) {
                intList.set(i,listItem + value);
            } else {
                // если в ячейке null, просто присваиваем значение
                intList.set(i,value);
            }
        }
    }

    //метод получает список сотрудников и возвращает список их имен
    public static ArrayList getEmployeesNames(ArrayList<Employee> employees) {
        ArrayList<String> employeesNames = new ArrayList<>();

        for(Employee employeeItem: employees) {
            employeesNames.add(employeeItem.getName());
        }

        return employeesNames;
    }

    //метод принимает минимальный возраст, список сотрудников и возвращает список сотрудников возраст которых больше или равен указанному
    public static ArrayList getEmployeesOlderThan(int minAge, ArrayList<Employee> employees) {
        ArrayList<Employee> employeesFiltered = new ArrayList<>();

        for(Employee employeeItem: employees) {
            if(employeeItem.getAge() >= minAge) {
                employeesFiltered.add(employeeItem);
            }
        }

        return  employeesFiltered;
    }

    //метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент
    public static boolean checkAvgAgeMoreThan(int minAvgAge, ArrayList<Employee> employees) {

        if(employees.size() == 0) {
            return false;
        }

        int sumEmployeesAge = 0;
        int countEmployees = 0;
        for(Employee employeeItem: employees) {
            sumEmployeesAge += employeeItem.getAge();
            countEmployees++;
        }

        double averageAge = sumEmployeesAge/countEmployees;
        if(averageAge > minAvgAge) {
            return true;
        }

        return false;
    }

    //метод возвращает самого молодого сотрудника
    public static Employee getYoungestEmployee(ArrayList<Employee> employees) {

        if(employees.size() == 0) {
            return  null;
        }

        Employee youngestEmployee = employees.get(0);
        for(int i=1; i < employees.size(); i++) {
            if(employees.get(i).getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employees.get(i);
            }
        }

        return youngestEmployee;
    }

}
