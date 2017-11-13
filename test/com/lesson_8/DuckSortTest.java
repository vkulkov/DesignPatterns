package com.lesson_8;

import com.lesson_8.sort.Duck;

import java.util.Arrays;

public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("First", 10),
                new Duck("Second", 15),
                new Duck("Third", 5),
                new Duck("Forth", 25),
                new Duck("Fifth", 20)};

        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(ducks));

        Arrays.sort(ducks);
        System.out.println("\nAfter sorting...");
        System.out.println(Arrays.toString(ducks));
    }
}
