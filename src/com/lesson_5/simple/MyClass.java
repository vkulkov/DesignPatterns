package com.lesson_5.simple;

import java.util.Random;

public class MyClass {
    private static MyClass instance;
    private int id;

    private MyClass(int id) {
        this.id = id;
    }

    public static synchronized MyClass getInstance() {
        if (instance == null) {
            instance = new MyClass(new Random().nextInt(100));
        }
        return instance;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
