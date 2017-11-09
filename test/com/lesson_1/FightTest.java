package com.lesson_1;

import com.lesson_1.character.Character;
import com.lesson_1.character.*;

public class FightTest {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.fight(troll);
        queen.fight(troll);
        knight.fight(troll);
        troll.fight(knight);
    }
}
