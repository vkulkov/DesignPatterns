package com.lesson_4.abstractfactory;

import com.lesson_4.abstractfactory.ingredient.*;

import java.util.Set;

public interface PizzaIngredientFactory {
    Cheese createCheese();
    Clams createClams();
    Dough createDough();
    Pepperoni createPepperoni();
    Sauce createSauce();
    Set<Veggie> createVeggies();
}
