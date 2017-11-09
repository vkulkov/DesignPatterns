package com.lesson_1.behavior.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SQUEAK!");
    }
}
