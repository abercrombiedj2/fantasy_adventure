package characters;

import behaviours.IDefend;
import behaviours.ISpell;
import enums.Spell;

public abstract class Mage extends Player implements ISpell, IDefend {

    Spell damage;

    public Mage(String name, int health, Spell damage) {
        super(name, health);
        this.damage = damage;
    }

    @Override
    public void cast() {

    }

    @Override
    public void defend() {

    }
}
