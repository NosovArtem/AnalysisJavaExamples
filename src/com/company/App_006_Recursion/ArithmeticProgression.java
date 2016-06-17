package com.company.App_006_Recursion;

/**
 * Created by Admin on 13.01.2016.
 */
public class ArithmeticProgression {
    public static void main(String[] args) {
        int t = 100;
        int result =0;
        for (int i = 0; i < t; i++) {
            result = result + (t-i);
        }
        System.out.println(result);
    }
}

