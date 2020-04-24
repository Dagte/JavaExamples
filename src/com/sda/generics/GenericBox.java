package com.sda.generics;

import com.sda.inheritance.Car;

public class GenericBox<T> {

    private T item;

    GenericBox(T car) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
