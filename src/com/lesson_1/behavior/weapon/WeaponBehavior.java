package com.lesson_1.behavior.weapon;

import com.lesson_1.character.Character;

public interface WeaponBehavior {
    void useWeapon();
    void attack(Character attacker, Character target);
}
