package com.lesson_4.fabricmethod.pizza.chicago;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        super("Chicago Style Clam Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago Clam pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Clam pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Clam pizza boxed");
    }
}
