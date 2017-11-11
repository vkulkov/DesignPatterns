package com.lesson_4.simplefactory;

import com.lesson_4.simplefactory.pizza.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String name) throws NotInTheMenuException {
        switch (name.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                throw new NotInTheMenuException();
        }
    }
}
