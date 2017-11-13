package com.lesson_8;

import com.lesson_8.hook.CaffeineBeverage;
import com.lesson_8.hook.Coffee;
import com.lesson_8.hook.Tea;

public class HookTest {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
