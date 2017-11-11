package com.lesson_4.fabricmethod;

import com.lesson_4.fabricmethod.pizza.Pizza;
import com.lesson_4.fabricmethod.pizza.california.CaliforniaStyleCheesePizza;
import com.lesson_4.fabricmethod.pizza.california.CaliforniaStyleClamPizza;
import com.lesson_4.fabricmethod.pizza.california.CaliforniaStylePepperoniPizza;
import com.lesson_4.fabricmethod.pizza.california.CaliforniaStyleVeggiePizza;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        switch (name.toLowerCase()) {
            case "cheese":
                return new CaliforniaStyleCheesePizza();
            case "pepperoni":
                return new CaliforniaStylePepperoniPizza();
            case "clam":
                return new CaliforniaStyleClamPizza();
            case "veggie":
                return new CaliforniaStyleVeggiePizza();
            default:
                throw new NotInTheMenuException();
        }
    }
}
