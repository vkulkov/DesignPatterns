package com.lesson_4.fabricmethod.pizza.chicago;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super("Chicago Style Veggie Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Veggie pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Veggie pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Veggie pizza boxed");
    }
}
