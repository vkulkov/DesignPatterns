package com.lesson_7;

import com.lesson_7.legacy.IteratorAdapter;

import java.util.ArrayList;
import java.util.List;

public class IteratorEnumerationTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Foo");
        list.add("Bar");

        IteratorAdapter iterator = new IteratorAdapter(list.iterator());
        while (iterator.hasMoreElements()) {
            System.out.println(iterator.nextElement());
        }
    }
}
