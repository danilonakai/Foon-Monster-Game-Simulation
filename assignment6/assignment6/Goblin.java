package assignment6;

/**
 * Implementation of goblin class
 * This class extends monster class and is used to create this specific monster
 * @author Danilo Nakai
 */
public class Goblin extends Monster {
    /** Goblin **/
    private Goblin enemy;

    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     **/
    public Goblin(String clan, double ferocity, double defense, double magic, double treasure, double health) {
        super(clan, ferocity, defense, magic, treasure, health);

        this.enemy = new Goblin(clan, ferocity, defense, magic, treasure, health, this);
    }

    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     * @param enemy The monster's enemy
     **/
    public Goblin(String clan, double ferocity, double defense, double magic, double treasure, double health, Goblin enemy) {
        super(clan, ferocity, defense, magic, treasure, health);

        this.enemy = enemy;
    }

    /**
     * Attack another monster
     **/
    public void attack() {
        super.attack(enemy);
    }

    /**
     * Get the enemy
     * @return The enemy's object
     **/
    public Goblin getEnemy() {
        return enemy;
    }
}
