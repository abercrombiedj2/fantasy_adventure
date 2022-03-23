package characters;

import behaviours.IDefenceBonus;
import behaviours.IHeal;
import enums.Weapon;

public class Paladin extends Fighter implements IHeal, IDefenceBonus {

    public Paladin(String name, int health, Weapon weapon) {
        super(name, health, weapon);
        this.weapon = weapon;
    }

    @Override
    public void defenceBonus() {

    }

    @Override
    public void heal() {

    }
}
