package enums;

public enum Buff {
    ATTACK(2),
    SPELL(2),
    SHIELD(2);

    private final int value;

    Buff(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
