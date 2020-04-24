package com.sda.generics;

public interface Comparable<T extends Object> {
     void compareTo(T o);
}
