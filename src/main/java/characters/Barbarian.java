package characters;

import behaviours.IDefenceBonus;
import enums.Weapon;

public class Barbarian extends Fighter implements IDefenceBonus {

    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public void defenceBonus() {
        this.armor += 3;
    }
}
