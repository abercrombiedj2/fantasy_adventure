package enums;

public enum Weapon {
    CLUB(1),
    HAMMER(2),
    SWORD(3),
    LOG(1),
    BREATH(5),
    DAGGER(10);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
