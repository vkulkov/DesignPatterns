package com.lesson_4.fabricmethod;

import com.lesson_4.fabricmethod.pizza.Pizza;
import com.lesson_4.fabricmethod.pizza.ny.NYStyleCheesePizza;
import com.lesson_4.fabricmethod.pizza.ny.NYStyleClamPizza;
import com.lesson_4.fabricmethod.pizza.ny.NYStylePepperoniPizza;
import com.lesson_4.fabricmethod.pizza.ny.NYStyleVeggiePizza;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        switch (name.toLowerCase()) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                throw new NotInTheMenuException();
        }
    }
}
