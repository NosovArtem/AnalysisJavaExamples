package com.company.TEST;

import java.util.Scanner;

/**
 * Created by Admin on 17.01.2016.
 */
public class TEST2 {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        System.out.println("detected a");
        int a = reader.nextInt();
        System.out.println("detected b");
        int b = reader.nextInt();
        if (a < b){
            System.out.println("a < b; a = " + a + " b = " + b);
        }
        else{
            System.out.println("a > b; a = " + a + " b = " + b);
        }
    }
}
