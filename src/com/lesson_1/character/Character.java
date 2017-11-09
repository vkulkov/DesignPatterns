package com.lesson_1.character;

import com.lesson_1.behavior.weapon.WeaponBehavior;

public abstract class Character {
    String name;
    int health;
    WeaponBehavior weaponBehavior;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int value) {
        health += value;
    }

    public void decreaseHealth(int value) {
        health -= value;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    abstract public void fight(Character target);
}
