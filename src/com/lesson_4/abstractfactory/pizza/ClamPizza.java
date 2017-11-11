package com.lesson_4.abstractfactory.pizza;

import com.lesson_4.abstractfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        super.prepare();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clams = ingredientFactory.createClams();
    }
}
