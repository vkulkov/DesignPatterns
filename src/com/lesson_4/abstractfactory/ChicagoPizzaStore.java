package com.lesson_4.abstractfactory;

import com.lesson_4.abstractfactory.factory.ChicagoPizzaIngredientFactory;
import com.lesson_4.abstractfactory.pizza.*;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (name.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            default:
                throw new NotInTheMenuException();
        }
        return pizza;
    }
}
