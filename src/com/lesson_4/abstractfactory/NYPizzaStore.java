package com.lesson_4.abstractfactory;

import com.lesson_4.abstractfactory.factory.NYPizzaIngredientFactory;
import com.lesson_4.abstractfactory.pizza.*;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (name.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            default:
                throw new NotInTheMenuException();
        }
        return pizza;
    }
}
