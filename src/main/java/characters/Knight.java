package characters;

import behaviours.IAttackBonus;
import enums.Weapon;

public class Knight extends Fighter implements IAttackBonus {

    public Knight(String name, int health, Weapon weapon) {
        super(name, health, weapon);
        this.weapon = weapon;
    }

    @Override
    public void attackBonus() {

    }
}
