package characters;

import behaviours.IWeapon;
import enemies.Enemy;
import enums.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    Weapon weapon;

    public Fighter(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    @Override
    public void attack(Enemy enemy) {
//        int randomNumber = (int) ((Math.random() * (10 - 1)) + 1);
        int enemyHealth = enemy.getHealth();
        int newHealth = enemyHealth - this.weapon.getDamage();
        enemy.setHealth(newHealth);
    }
}
