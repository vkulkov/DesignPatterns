package com.lesson_1.behavior.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK!");
    }
}
