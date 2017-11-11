package com.lesson_4.abstractfactory;

import com.lesson_4.abstractfactory.factory.CaliforniaPizzaIngredientFactory;
import com.lesson_4.abstractfactory.pizza.*;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) throws NotInTheMenuException {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        switch (name.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("California Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
            default:
                throw new NotInTheMenuException();
        }
        return pizza;
    }
}
