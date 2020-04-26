package com.sda.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("resource/car.txt");

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println("is file: " + file.isFile());

        if (file.exists()) {

            System.out.println("File exists!");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null){
                System.out.println(fileLine);
        }
        }
    } else {
        System.out.println("File does not exist");

            }
        }
}
