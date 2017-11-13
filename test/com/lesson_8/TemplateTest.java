package com.lesson_8;

import com.lesson_8.starbuzz.CaffeineBeverage;
import com.lesson_8.starbuzz.Coffee;
import com.lesson_8.starbuzz.Tea;

public class TemplateTest {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
