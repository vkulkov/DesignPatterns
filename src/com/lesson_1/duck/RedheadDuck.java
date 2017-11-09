package com.lesson_1.duck;

import com.lesson_1.behavior.fly.FlyWithWings;
import com.lesson_1.behavior.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real redhead duck");
    }
}
