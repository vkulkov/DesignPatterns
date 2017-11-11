package com.lesson_4.fabricmethod;

import com.lesson_4.fabricmethod.pizza.Pizza;
import com.lesson_4.fabricmethod.pizza.chicago.ChicagoStyleCheesePizza;
import com.lesson_4.fabricmethod.pizza.chicago.ChicagoStyleClamPizza;
import com.lesson_4.fabricmethod.pizza.chicago.ChicagoStylePepperoniPizza;
import com.lesson_4.fabricmethod.pizza.chicago.ChicagoStyleVeggiePizza;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        switch (name.toLowerCase()) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                throw new NotInTheMenuException();
        }
    }
}
