package com.company.App_006_Recursion;

/**
 * Created by Admin on 13.01.2016.
 */
public class Fibonachi {
    public static void main(String[] args) {

        int t = 7;
        fib(t);
        System.out.println("rersult = " + fib(t));
    }

    static int fib(int n) {
        int result;
        if (n==1) {
            return 1;
        }
        else if (n==0) {
            return 0;
        }
        result = fib(n - 1) + fib(n - 2);
        return result;
    }
}
