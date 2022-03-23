import characters.Barbarian;
import enemies.Bandit;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Bandit bandit;

    @Before
    public void setUp(){
        barbarian = new Barbarian("Conan", 18, Weapon.CLUB);
        bandit = new Bandit(7, Weapon.DAGGER);
    }

    @Test
    public void canAttack(){
        barbarian.attack(bandit);
        assertEquals(6, bandit.getHealth());
    }

    @Test
    public void canTakeDamage(){
        bandit.attack(barbarian);
        assertEquals(8, barbarian.getHealth());
    }

    @Test
    public void hasDefenceBonus(){
        barbarian.defenceBonus();
        bandit.attack(barbarian);
        assertEquals(11, barbarian.getHealth());
    }

}
