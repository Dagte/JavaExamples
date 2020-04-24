package com.sda.exception;

public class Main {
    public static void main(String[] args) {

        ExceptionHandler exceptionHandler = new ExceptionHandler();

        exceptionHandler.divide(6,3);
        exceptionHandler.divide(65,0);

        exceptionHandler.convertToUppercase("Miguel Cruz");
        exceptionHandler.convertToUppercase(null);

        exceptionHandler.toSubstring("Java Training 11");
        exceptionHandler.toSubstring("something");

        exceptionHandler.openFileWithFileCatch("C:\\Users\\David\\Desktop\\SDA Java\\Shortcuts.txt");
        exceptionHandler.openFileWithFileCatch("C:\\Users\\David\\Desktop\\ file que no existe");


    }
    private static void exceptionHandling() {
        try {

            int number = 5 / 0;
            System.out.println("number: " + number);
            String name = null;
            System.out.println("Your name: " +  name.toUpperCase());
        } catch (ArithmeticException exceptional) {
            System.out.println("Exception is handled: " + exceptional.getMessage());
        } catch (NullPointerException exceptional) {
            System.out.println("NullPointerException is handled: " + exceptional.getMessage()); exceptional.printStackTrace();
        }
        System.out.println("After, it continues compiling the rest of the application");
    }
}
