package com.lesson_1.character;

import com.lesson_1.behavior.weapon.KnifeBehavior;

public class King extends Character {

    public King() {
        name = "king";
        health = 100;
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight(Character target) {
        weaponBehavior.attack(this, target);
    }
}
