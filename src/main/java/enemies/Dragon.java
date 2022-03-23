package enemies;

import enums.Weapon;

public class Dragon extends Enemy {

    Weapon weapon;

    public Dragon(int health, Weapon weapon) {
        super(health, weapon);
    }
}
