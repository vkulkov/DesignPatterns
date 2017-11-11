package com.lesson_4;

import com.lesson_4.abstractfactory.ChicagoPizzaStore;
import com.lesson_4.abstractfactory.NYPizzaStore;
import com.lesson_4.abstractfactory.PizzaStore;
import com.lesson_4.simplefactory.NotInTheMenuException;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore myPizzaStore = new NYPizzaStore();
        PizzaStore otherPizzaStore = new ChicagoPizzaStore();
        try {
            myPizzaStore.orderPizza("Cheese");
        } catch (NotInTheMenuException e) {
            System.out.println("Not in the menu");
        } try {
            otherPizzaStore.orderPizza("Veggie");
        } catch (NotInTheMenuException e) {
            System.out.println("Not in the menu");
        }
    }
}
