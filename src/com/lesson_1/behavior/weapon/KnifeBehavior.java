package com.lesson_1.behavior.weapon;

import com.lesson_1.character.Character;

public class KnifeBehavior implements WeaponBehavior {
    private int damage = 20;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void useWeapon() {
        System.out.println("stab");
    }

    @Override
    public void attack(Character attacker, Character target) {
        System.out.printf("%s is attacked with a knife by %s%n", target.getName(), attacker.getName());
        target.decreaseHealth(damage);
        System.out.printf("%s has %d health now%n", target.getName(), target.getHealth());
    }
}
