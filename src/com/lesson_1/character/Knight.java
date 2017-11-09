package com.lesson_1.character;

import com.lesson_1.behavior.weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        name = "knight";
        health = 150;
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight(Character target) {
        weaponBehavior.attack(this, target);
    }
}
