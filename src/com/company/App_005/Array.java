package com.company.App_005;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 13.01.2016.
 */
public class Array {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 6, 8, 1, 24, 14, 29, 93, 74, 36));
        String s = "";
        IntToString(arr, "");

    }

    public static void IntToString(List<Integer> arr, String s) {
        for (Integer t : arr) {
            String str = Integer.toString(t);
            s += str;
        }
        System.out.println(s);
    }
}
