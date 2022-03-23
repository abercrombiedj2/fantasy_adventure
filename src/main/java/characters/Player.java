package characters;

public abstract class Player {

    String name;
    int health;
    int armor;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.armor = 0;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
