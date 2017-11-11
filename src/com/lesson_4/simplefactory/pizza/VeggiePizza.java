package com.lesson_4.simplefactory.pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Veggie pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Veggie pizza boxed");
    }
}
