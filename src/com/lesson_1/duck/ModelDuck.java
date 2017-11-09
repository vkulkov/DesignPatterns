package com.lesson_1.duck;

import com.lesson_1.behavior.fly.FlyNoWay;
import com.lesson_1.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
