package enums;

public enum Spell {
    FIREBALL(2),
    BLIZZARD(4),
    BOLT(6);

    private final int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
