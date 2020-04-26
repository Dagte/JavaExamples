package com.sda.generics;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setHeight(2000);

//        person.compareTo(new Person(1080));

        Generic<String > str = new Generic<String>("Hola");
        Generic inte = new Generic(16);
        Generic doubl = new Generic(6.0);

        Generic[] jumble = new Generic[] {str, inte, doubl};
        for (int i = 0; i < jumble.length; i++) {
            System.out.println(jumble[i].toString());
        }
    }
}
