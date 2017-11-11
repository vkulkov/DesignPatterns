package com.lesson_4.fabricmethod.pizza.california;

import com.lesson_4.fabricmethod.pizza.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        super("California Style Clam Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Californian Clam pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Californian Clam pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Californian Clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Californian Clam pizza boxed");
    }
}
