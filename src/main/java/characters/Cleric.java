package characters;

import behaviours.IHeal;
import enums.Buff;

public class Cleric extends Player implements IHeal {

    Buff buff;

    public Cleric(String name, int health, Buff buff) {
        super(name, health);
        this.buff = buff;
    }

    @Override
    public void heal() {

    }
}
