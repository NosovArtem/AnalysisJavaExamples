package com.company.App_006_Recursion;

/**
 * Created by Admin on 13.01.2016.
 */
public class RecursionExample2 {
    public static void main(String[] args) {
        int r = 4;
        System.out.println("resultat = " + sumTo(r));
    }
    static int sumTo(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = n + sumTo(n - 1);
        return result;
    }
}
