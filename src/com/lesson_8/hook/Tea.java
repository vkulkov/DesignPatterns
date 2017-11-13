package com.lesson_8.hook;

import java.util.Scanner;

public class Tea extends CaffeineBeverage {

    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected boolean consumerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.print("Would you like lemon in your tea (y/n)? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
