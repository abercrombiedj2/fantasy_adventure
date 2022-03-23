package enemies;

import enums.Spell;
import enums.Weapon;

public class Witch extends Enemy{

    Weapon weapon;

    public Witch(int health, Weapon weapon) {
        super(health, weapon);
    }
}
