package com.sda.generics;

public class Generic<T> {
    private T item;

    @Override
    public String toString() {
        return "Generic{" +
                "item=" + item +
                '}';
    }

    public Generic(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
