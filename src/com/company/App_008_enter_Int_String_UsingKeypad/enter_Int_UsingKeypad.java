package com.company.App_008_enter_Int_String_UsingKeypad;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Admin on 23.01.2016.
 */
public class enter_Int_UsingKeypad {
    public static void main(String[] args) throws IOException {

//        Scanner s = new Scanner(System.in);
//        System.out.println("Введите строку " );
//        String str = s.next();
//        System.out.println(str);
//        System.out.println("Введите число а" );
//        int a = s.nextInt();
//        System.out.println("Введите число b" );
//        int b = s.nextInt();
//        System.out.println("Введите число c" );
//        int c = s.nextInt();
//        System.out.println("a + b + c = " + a + b + c);
     String a = String.valueOf(JOptionPane.showInputDialog("Введите строку. А"));
        int b = Integer.valueOf(JOptionPane.showInputDialog("Введите коэф. B"));
        int c = Integer.valueOf(JOptionPane.showInputDialog("Введите коэф. C"));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
