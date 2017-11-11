package com.lesson_4.fabricmethod.pizza.california;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        super("california Style Veggie Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Californian Veggie pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Californian Veggie pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Californian Veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Californian Veggie pizza boxed");
    }
}
