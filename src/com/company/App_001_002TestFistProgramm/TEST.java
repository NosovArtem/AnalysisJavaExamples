
package com.company.App_001_002TestFistProgramm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 09.01.2016.
 * package com.example.function.example;
 * Created by Admin on 11.01.2016, 11.42 фильтр листа(оставить только четные).
 **/
public class TEST {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 100, 9, 77, 15, 6, 56, 3, 32, 41, 25, 89));
        sort(numbers);
        System.out.println(numbers);
    }
//сортировка пузырьком с конца
   /* public static void sort(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int tmp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set((j + 1), tmp);
                }
            }
        }
    }*/

    static void sort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int tmp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set((j + 1), tmp);
                }
            }
        }
    }

// метод сортировка пузырьком массив
    /*public static void bubbleSort(Integer[] sortArr) {

        for (Integer i = sortArr.length - 1; i > 0; i--) {

            for (Integer j = 0; j < i; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    Integer tmp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = tmp;
                }
            }
    }
    }
    */


//фильтр листа(оставить только четные).
/*
1)
{
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 15, 25, 56, 32, 41, 89));
        System.out.println(numbers);
        Filtr(numbers);

        System.out.println("numbers = " + numbers);
}
    public static void Filtr(List<Integer> filtrList) {

        List<Integer> toRemove = new ArrayList();
        for(Integer a: filtrList){
            if(a % 2 != 0) {
                toRemove.add(a);
            }
        }
        filtrList.removeAll(toRemove);

        System.out.println("filtrList = " + filtrList);
    }
}*/



    /*
    public static List<Integer> filtr(List<Integer> a) {
        for (Integer item : a) {
            if (item % 2 == 0) {
                Integer b = item;
                a.add(item);
            }
        }
        return a;
    }

    //четные элементы списка копируются в новый список.
    public static ArrayList<Integer> filtr(List<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (Integer item : a) {
            if (item % 2 == 0) {
                b.add(item);
            }
        }
        return b;
    }

//функция суммы
    /*public static Integer sum(Integer a1, Integer a2) {
        return a1 + a2;
    }

// метод
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 15, 25, 56, 32, 41, 89));

        List<Integer> toRemove = new ArrayList();
        for (Integer a : numbers) {
            if (a % 2 != 0) {
                toRemove.add(a);
            }
        }
        numbers.removeAll(toRemove);
    }
*/


}






