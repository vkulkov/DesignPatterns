package com.lesson_4.abstractfactory.factory;

import com.lesson_4.abstractfactory.PizzaIngredientFactory;
import com.lesson_4.abstractfactory.ingredient.*;
import com.lesson_4.abstractfactory.ingredient.cheese.MozzarellaCheese;
import com.lesson_4.abstractfactory.ingredient.clams.FrozenClams;
import com.lesson_4.abstractfactory.ingredient.dough.ThickCrustDough;
import com.lesson_4.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import com.lesson_4.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import com.lesson_4.abstractfactory.ingredient.veggie.BlackOlives;
import com.lesson_4.abstractfactory.ingredient.veggie.Eggplant;
import com.lesson_4.abstractfactory.ingredient.veggie.Spinach;

import java.util.HashSet;
import java.util.Set;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Set<Veggie> createVeggies() {
        Set<Veggie> veggies = new HashSet<>();
        veggies.add(new BlackOlives());
        veggies.add(new Spinach());
        veggies.add(new Eggplant());
        return veggies;
    }
}
