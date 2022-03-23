package enemies;

import enums.Spell;
import enums.Weapon;

public class Goblin extends Enemy {

    Weapon weapon;

    public Goblin(int health, Weapon weapon) {
        super(health, weapon);
    }
}
