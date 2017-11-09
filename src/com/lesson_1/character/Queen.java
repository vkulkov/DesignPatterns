package com.lesson_1.character;

import com.lesson_1.behavior.weapon.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        name = "queen";
        health = 80;
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight(Character target) {
        weaponBehavior.attack(this, target);
    }
}
