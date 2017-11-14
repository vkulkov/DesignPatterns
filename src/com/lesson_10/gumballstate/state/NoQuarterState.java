package com.lesson_10.gumballstate.state;

import com.lesson_10.gumballstate.GumballMachine;
import com.lesson_10.gumballstate.State;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void pullLever() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void giveGumball() {
        System.out.println("You have to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
