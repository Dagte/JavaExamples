package com.sda.generics;

public class Box<T> {
    private T t;

    public Box() {
    }

    public void put() {
        this.t = t;
    }
    public T get() {
        return this.t;
    }

}
