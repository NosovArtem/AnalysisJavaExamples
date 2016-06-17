package com.company.App_007_ReadFilesInDifrentFolders;

import java.io.*;

/**
 * Created by Admin on 14.01.2016.
 */
public class ReadFilesInFolders {
    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("C:\\text\\writeFile.txt", "UTF-8");
        File directory = new File("C:\\text\\");
        fileMen(directory, writer);
        writer.close();
    }

    public static File fileMen(File directory, PrintWriter writer) throws IOException {
        File[] myarray;
        myarray = directory.listFiles();

        for (int j = 0; j < myarray.length; j++) {
            File file = myarray[j];
            boolean trueFile = file.isFile();
            if (trueFile == true) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String s = "";
                while (br.ready()) {
                    s += br.readLine() ;
                    // s += br.readLine()+ "\n" ;
                }
                writer.println(s);
                System.out.println(s);
            } else {
                fileMen(file, writer);
            }
        }
        return directory;
    }
}

