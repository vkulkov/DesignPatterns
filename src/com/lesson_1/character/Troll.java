package com.lesson_1.character;

import com.lesson_1.behavior.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        name = "troll";
        health = 200;
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight(Character target) {
        weaponBehavior.attack(this, target);
    }
}
