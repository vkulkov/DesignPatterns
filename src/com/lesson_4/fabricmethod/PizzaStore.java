package com.lesson_4.fabricmethod;

import com.lesson_4.fabricmethod.pizza.Pizza;
import com.lesson_4.simplefactory.NotInTheMenuException;

public abstract class PizzaStore {

    public final Pizza orderPizza(String name) throws NotInTheMenuException {
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String name) throws NotInTheMenuException;
}
