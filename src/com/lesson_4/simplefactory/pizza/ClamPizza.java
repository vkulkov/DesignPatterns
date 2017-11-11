package com.lesson_4.simplefactory.pizza;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Clam pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Clam pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Clam pizza boxed");
    }
}
