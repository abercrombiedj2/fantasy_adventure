package enemies;

import enums.Weapon;

public class Ogre extends Enemy{

    Weapon damage;

    public Ogre(int health, Weapon weapon) {
        super(health, weapon);
    }

}
