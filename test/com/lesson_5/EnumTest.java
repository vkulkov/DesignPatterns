package com.lesson_5;

import com.lesson_5.enumeration.EnumSingleton;

public class EnumTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println(singleton.getValue());

        singleton.setValue(10);
        System.out.println(singleton.getValue());
    }
}
