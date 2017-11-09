package com.lesson_1.duck;

import com.lesson_1.behavior.fly.FlyNoWay;
import com.lesson_1.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
