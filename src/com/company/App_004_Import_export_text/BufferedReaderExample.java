package com.company.App_004_Import_export_text;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class BufferedReaderExample {

        public static void main(String[] args) {

            BufferedReader br = null;

            try {

                String sCurrentLine;

                br = new BufferedReader(new FileReader("C:\\text\\writeFile.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null)br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }
