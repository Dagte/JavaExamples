package com.sda.oop;

import com.sda.oop.address.Address;
import com.sda.oop.address.City;
import com.sda.oop.address.Country;
import com.sda.oop.person.Person;
import com.sda.oop.product.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        City city = new City();
        city.setCityId(1234L);
        city.setCityName("Tallinn");

        Country country = new Country();
        country.setCountryCode("EE");
        country.setCountryName("Estonia");

        Address address = new Address();
        address.setStreetName("Hobujama 12");
        address.setPostalCode("10111");
        address.setCity(city);
        address.setCountry(country);

        Product product = new Product("Orange juice", 2.49, LocalDate.of(2020, Month.SEPTEMBER,10),20);
        Product product1 = new Product("Orange juice", 2.49, LocalDate.of(2020, Month.SEPTEMBER,10),20);

        Person person = new Person();
        Person person1 = new Person("Pepito", "Pérez", 30, address);
        person.setName("Isa");
        person.setSurname("Kalinsaz");
        person.setAge(30);
        person.setAddress(address);
//        person.buy(product, 1);
        System.out.println(product.getStock());
        System.out.println(product.toString());
        product.reduceStock(person.buy(product,5));
        System.out.println(product.getStock());
        product.reduceStock(person.buy(product,15));
        System.out.println(product.getStock());
        product.reduceStock(person.buy(product,1));
        System.out.println(product.getStock());
        System.out.println(product.toString());

//        person.setProductToBuy(product);
//        person1.setProductToBuy(product1);

        System.out.println("Country info:" + country.toString());
        System.out.println("Person Name:" + person.getName());
        System.out.println("Person info:" + person.toString());
        System.out.println("Person info:" + person1.toString());
    }
}
