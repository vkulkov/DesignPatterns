package com.lesson_10;

import com.lesson_10.gumball.GumballMachine;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.pullLever();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.pullLever();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.pullLever();
        gumballMachine.insertQuarter();
        gumballMachine.pullLever();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.pullLever();
        gumballMachine.insertQuarter();
        gumballMachine.pullLever();
        gumballMachine.insertQuarter();
        gumballMachine.pullLever();

        System.out.println(gumballMachine);
    }
}
