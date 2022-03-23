package characters;

import behaviours.IDefenceBonus;
import enums.Spell;

public class Wizard extends Mage implements IDefenceBonus {

    public Wizard(String name, int health, Spell damage) {
        super(name, health, damage);
    }

    @Override
    public void defenceBonus() {

    }
}
