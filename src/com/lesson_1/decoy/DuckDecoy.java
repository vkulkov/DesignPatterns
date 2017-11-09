package com.lesson_1.decoy;

import com.lesson_1.behavior.quack.Quack;
import com.lesson_1.behavior.quack.QuackBehavior;

public class DuckDecoy {
    private QuackBehavior quackBehavior;

    public DuckDecoy() {
        quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("This is duck decoy");
    }
}
