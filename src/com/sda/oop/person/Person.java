package com.sda.oop.person;

import com.sda.oop.address.Address;
import com.sda.oop.product.Product;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person() {
    }

    public Person(final String name, final String surname, final int age, final Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + " Surname:" + this.surname + " Age:" + this.age + " Address: " + address.toString();
    }

    public int buy(Product productToBuy, int numberOfItems) {
        if (productToBuy.getStock() < 1)  {
            System.out.println("Sorry, currently " + productToBuy.getProductName() + " is not available.");
        } else if (productToBuy.getStock() < numberOfItems) {
            System.out.println("Sorry, currently there is only  " + productToBuy.getStock() + " items of this product available.");
        }  else if (numberOfItems > 1) {
                System.out.println(getName() + " has bought " + numberOfItems + " units of " + productToBuy.getProductName());
            if (productToBuy.getExpirationDate().isBefore(LocalDate.now())) {
                System.out.println("This product has expired on: " + productToBuy.getExpirationDate());
            }
                return numberOfItems;
            } else if (numberOfItems == 1) {
                System.out.println(getName() + " has bought " + numberOfItems + " unit of " + productToBuy.getProductName());
            if (productToBuy.getExpirationDate().isBefore(LocalDate.now())) {
                System.out.println("This product has expired on: " + productToBuy.getExpirationDate());
            }
                return numberOfItems;
            }
        return 0;
    }

}
