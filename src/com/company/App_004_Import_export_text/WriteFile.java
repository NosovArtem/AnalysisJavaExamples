package com.company.App_004_Import_export_text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Admin on 13.01.2016.
 */
public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("C:\\text\\writeFile.txt", "UTF-8");
        writer.println("Hello World");
        writer.println("Hello World");
        writer.println("Hello World");
        writer.println("Hello World");
        writer.close();
    }
}
