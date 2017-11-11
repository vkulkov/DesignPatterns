package com.lesson_4;

import com.lesson_4.fabricmethod.ChicagoPizzaStore;
import com.lesson_4.fabricmethod.NYPizzaStore;
import com.lesson_4.fabricmethod.PizzaStore;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore ourPizzaStore = new NYPizzaStore();
        try {
            ourPizzaStore.orderPizza("Pepperoni");
            ourPizzaStore.orderPizza("Veggie");
        } catch (NotInTheMenuException e) {
            System.out.println("Not in the menu");
        }

        PizzaStore otherPizzaStore = new ChicagoPizzaStore();
        try {
            otherPizzaStore.orderPizza("Cheese");
        } catch (NotInTheMenuException e) {
            System.out.println("Not in the menu");
        }
    }
}
