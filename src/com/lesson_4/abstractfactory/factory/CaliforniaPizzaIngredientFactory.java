package com.lesson_4.abstractfactory.factory;

import com.lesson_4.abstractfactory.PizzaIngredientFactory;
import com.lesson_4.abstractfactory.ingredient.*;
import com.lesson_4.abstractfactory.ingredient.cheese.ParmesanCheese;
import com.lesson_4.abstractfactory.ingredient.clams.Calamari;
import com.lesson_4.abstractfactory.ingredient.clams.FreshClams;
import com.lesson_4.abstractfactory.ingredient.dough.ThinCrustDough;
import com.lesson_4.abstractfactory.ingredient.dough.VeryThinCrust;
import com.lesson_4.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import com.lesson_4.abstractfactory.ingredient.sauce.BruschettaSauce;
import com.lesson_4.abstractfactory.ingredient.veggie.BlackOlives;
import com.lesson_4.abstractfactory.ingredient.veggie.Garlic;
import com.lesson_4.abstractfactory.ingredient.veggie.Mushroom;

import java.util.HashSet;
import java.util.Set;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Clams createClams() {
        return new Calamari();
    }

    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Set<Veggie> createVeggies() {
        Set<Veggie> veggies = new HashSet<>();
        veggies.add(new BlackOlives());
        veggies.add(new Mushroom());
        veggies.add(new Garlic());
        return veggies;
    }
}
