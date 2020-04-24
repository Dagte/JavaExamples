package com.sda.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionHandler {
    public void  divide(int a, int b){
        try {
            if (b == 0) {
                throw new ArithmeticException("You cannot provide a divider with value = 0");
            }
            double result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException is thrown: " + exception.getMessage()); exception.printStackTrace();
        }
    }

    public void convertToUppercase(String name){
        if (name != null) {
            System.out.println("Your name: " + name.toUpperCase());
        } else {
            System.out.println("NullPointerException will be thrown");
        }
       /* try {
            System.out.println("Your name "+ name.toUpperCase());
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException is thrown: " + exception.getMessage()); exception.printStackTrace();

        }*/
        }
       public void openFileWithFileCatch(String filePath) {
            final File file = new File(filePath);
            try {
                File.createTempFile("prefix", "suffix", file);
            } catch (IOException e) {
                System.out.println("The provided file is not opened: " +  filePath);
                e.printStackTrace();
            }

    }

    public void toSubstring(String name) {
        try {
            System.out.println("We are cutting on the 10th char: "+ name.substring(10));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("NullPointerException is thrown: " + exception.getMessage()); exception.printStackTrace();

        }
    }
}
