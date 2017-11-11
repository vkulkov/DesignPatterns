package com.lesson_4;

import com.lesson_4.simplefactory.NotInTheMenuException;
import com.lesson_4.simplefactory.PizzaStore;
import com.lesson_4.simplefactory.SimplePizzaFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        try {
            pizzaStore.orderPizza("cheese");
            pizzaStore.orderPizza("veggie");
        } catch (NotInTheMenuException e) {
            System.out.println("Not in the menu");
        }
    }
}
