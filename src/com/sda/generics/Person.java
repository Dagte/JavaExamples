package com.sda.generics;

public class Person implements Comparable<Person> {

    private int height;

    public Person() {

    }

    public Person(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void compareTo(final Person otherPerson) {
        if (this.height < otherPerson.height) {
            System.out.println("He is tall indeed");
        } else if (this.height < otherPerson.height) {
            System.out.println("They seem to be equally tall");
        } else {
            System.out.println("The other person is shorter");
        }
    }
}
