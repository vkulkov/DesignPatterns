package com.lesson_4.abstractfactory.factory;

import com.lesson_4.abstractfactory.PizzaIngredientFactory;
import com.lesson_4.abstractfactory.ingredient.*;
import com.lesson_4.abstractfactory.ingredient.cheese.ReggianoCheese;
import com.lesson_4.abstractfactory.ingredient.clams.FreshClams;
import com.lesson_4.abstractfactory.ingredient.dough.ThinCrustDough;
import com.lesson_4.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import com.lesson_4.abstractfactory.ingredient.sauce.MarinaraSauce;
import com.lesson_4.abstractfactory.ingredient.veggie.Garlic;
import com.lesson_4.abstractfactory.ingredient.veggie.Mushroom;
import com.lesson_4.abstractfactory.ingredient.veggie.Onion;
import com.lesson_4.abstractfactory.ingredient.veggie.RedPepper;

import java.util.HashSet;
import java.util.Set;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Set<Veggie> createVeggies() {
        Set<Veggie> veggies = new HashSet<>();
        veggies.add(new Garlic());
        veggies.add(new Onion());
        veggies.add(new Mushroom());
        veggies.add(new RedPepper());
        return veggies;
    }
}
