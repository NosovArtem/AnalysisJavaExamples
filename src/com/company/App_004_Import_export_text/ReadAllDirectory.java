package com.company.App_004_Import_export_text;

import java.io.*;

/**
 * Created by Admin on 13.01.2016.
 */
public class ReadAllDirectory {
    public static void main(String[] args) throws IOException {

        File[] myarray;
        File directory = new File("C:\\text\\");
        // myarray = new File[0];
        myarray = directory.listFiles();

        for (int j = 0; j < myarray.length; j++) {

            File file = myarray[j];
//            !file.isFile();
              //      file.getAbsolutePath()


            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = "";

            while (br.ready()) {
                s += br.readLine() + "\n";
            }

            System.out.println(s);
        }

    }
}

//    public static void main(String[] args) {
//        File folder = new File("C:\\text\\writeFile.txt");
//        File[] listOfFiles = folder.listFiles();
//
//        for (File file : listOfFiles) {
//            if (file.isFile()) {
//                System.out.println(file.getName());
//            }
//        }
//    }


