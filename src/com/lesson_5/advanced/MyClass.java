package com.lesson_5.advanced;

import java.util.Random;

public class MyClass {
    private static volatile MyClass instance;
    private int id;

    private MyClass(int id) {
        this.id = id;
    }

    public static MyClass getInstance() {
        if (instance == null) {
            synchronized (MyClass.class) {
                if (instance == null) {
                    instance = new MyClass(new Random().nextInt(100));
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
