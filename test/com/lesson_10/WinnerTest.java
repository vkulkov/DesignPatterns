package com.lesson_10;

import com.lesson_10.gumballstate.GumballMachine;

public class WinnerTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.pullLever();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.pullLever();
        gumballMachine.insertQuarter();
        gumballMachine.pullLever();

        System.out.println(gumballMachine);
    }
}
