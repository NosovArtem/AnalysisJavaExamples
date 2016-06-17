package com.company.App_003;

import java.util.List;

/**
 * Created by Admin on 13.01.2016.
 */
public class Members {
    public static void main(String[] args) {


    Person father = new Person();
    Person mother = new Person();

    Person artem = new Person();
    artem.setName("Artem");
    artem.setAge(23);
    artem.setMother(mother);
    artem.setFather(father);

    Person serg = new Person();
    serg.setName("Serg");
    serg.setAge(25);
    serg.setMother(mother);
    serg.setFather(father);

    mother.setName("Elena");
    mother.setAge(52);
    mother.setSon(serg);
    mother.setSon(artem);

    father.setName("Oleg");
    father.setAge(56);
    father.setSon(serg);
    father.setSon(artem);

    Family nosovFamily = new Family();
    artem.setFamily(nosovFamily);
    serg.setFamily(nosovFamily);
    mother.setFamily(nosovFamily);
    father.setFamily(nosovFamily);

    nosovFamily.getListFamily().add(artem);
    nosovFamily.getListFamily().add(serg);
    nosovFamily.getListFamily().add(mother);
    nosovFamily.getListFamily().add(father);

    List<Person> sortList = nosovFamily.getListFamily();
    sortName(sortList);


}
    // сортировка пузырьком, граница движется от конца к началу
//    public static void sort(List<Person> sortList) {
//        for (int i = sortList.size() - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (sortList.get(j).getAge() > sortList.get(j + 1).getAge()) {
//                    Person tmp = sortList.get(j);
//                    sortList.set(j, sortList.get(j + 1));
//                    sortList.set((j + 1), tmp);
//                }
//            }
//        }
//
//        for (int j = 0; j < sortList.size(); j++) {
//            System.out.print(sortList.get(j).getAge());
//            System.out.print("  ");
//        }
//    }
//Sort String, Name
//сортировка пузырьком
    public static void sortName(List<Person> sortList) {

        System.out.println("Unsorted");
        for (Person s : sortList) {
            System.out.print(s.getName() + " ");
            System.out.println(s.getAge() + ";");
        }
        System.out.println("");
        System.out.println("Sorted");
        for (int j = 0; j < sortList.size(); j++) {
            for (int i = j + 1; i < sortList.size(); i++) {
                if (sortList.get(i).getName().compareTo(sortList.get(j).getName()) < 0) {
                    Person temp = sortList.get(j);
                    sortList.set(j, sortList.get(i));
                    sortList.set(i, temp);
                }
            }
            System.out.print(sortList.get(j).getName() + " ");
            System.out.println(sortList.get(j).getAge() + ";");
        }
    }
}