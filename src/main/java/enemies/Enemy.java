package enemies;

import behaviours.IDefend;
import behaviours.IEnemyWeapon;
import behaviours.IWeapon;
import characters.Fighter;
import characters.Player;
import enums.Weapon;

public abstract class Enemy implements IDefend, IEnemyWeapon {

    int health;
    Weapon weapon;

    public Enemy(int health, Weapon weapon) {
        this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void defend() {

    }

    @Override
    public void attack(Player player) {
        int playerHealth = player.getHealth();
        int damage = this.weapon.getDamage() - player.getArmor();
        int newHealth = playerHealth - damage;
        player.setHealth(newHealth);
    }
}
