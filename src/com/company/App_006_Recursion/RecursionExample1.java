package com.company.App_006_Recursion;

/**
 * Created by Admin on 13.01.2016.
 */
public class RecursionExample1 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Progression = " + SumTo(num));
    }

    static int SumTo(int n) {

        if (n >= 2) {
            int s = n + SumTo(n - 1);
            return s;
        }
        return n;
    }
}
