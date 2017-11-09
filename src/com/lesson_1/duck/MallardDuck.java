package com.lesson_1.duck;

import com.lesson_1.behavior.fly.FlyWithWings;
import com.lesson_1.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
