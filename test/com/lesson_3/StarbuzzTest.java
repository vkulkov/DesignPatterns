package com.lesson_3;

import com.lesson_3.starbuzz.condiment.Mocha;
import com.lesson_3.starbuzz.condiment.Soy;
import com.lesson_3.starbuzz.condiment.Whip;
import com.lesson_3.starbuzz.drinks.Beverage;
import com.lesson_3.starbuzz.drinks.HouseBlend;

public class StarbuzzTest {
    public static void main(String[] args) {
        Beverage latte = new Whip(new Soy(new Mocha(new Mocha(new HouseBlend()))));
        System.out.println(latte.getDescription());
        System.out.println(latte.cost());
    }
}
