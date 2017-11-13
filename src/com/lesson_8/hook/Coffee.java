package com.lesson_8.hook;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected boolean consumerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.print("Would you like milk and sugar in your coffee (y/n)? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
