package com.lesson_5;

import com.lesson_5.simple.MyClass;

public class SingleInstanceTest {
    public static void main(String[] args) {
        MyClass myClass = MyClass.getInstance();
        System.out.println(myClass);

        myClass = MyClass.getInstance();
        System.out.println(myClass);
    }
}
