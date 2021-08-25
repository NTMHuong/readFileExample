package com.codegym;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
//        writeFileText("demo.txt", "");

        readFileText("demo.txt");

    }

    private static void readFileText(String path) {
        try {
            FileReader fileReader = new FileReader(path);


            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong = " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   private static void writeFileText(String path, String content) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
