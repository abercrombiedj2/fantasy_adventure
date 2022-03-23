package characters;

import behaviours.IAttackBonus;
import enums.Spell;

public class Warlock extends Mage implements IAttackBonus {

    public Warlock(String name, int health, Spell damage) {
        super(name, health, damage);
    }

    @Override
    public void attackBonus() {

    }
}
