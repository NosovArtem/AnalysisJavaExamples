package com.company.App_006_Recursion;

/**
 * Created by Admin on 13.01.2016.
 */
public class factorialis {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(" = " + fact(n));
    }
    static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }

}
