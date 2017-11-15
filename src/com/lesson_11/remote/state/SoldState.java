package com.lesson_11.remote.state;

import com.lesson_11.remote.GumballMachine;
import com.lesson_11.remote.State;

public class SoldState implements State {
    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void pullLever() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void giveGumball() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, gumball machine is sold out");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }
}
