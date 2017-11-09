package com.lesson_1.duck;

import com.lesson_1.behavior.fly.FlyNoWay;
import com.lesson_1.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
