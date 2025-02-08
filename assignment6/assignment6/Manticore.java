package assignment6;

/**
 * Implementation of manticore class
 * This class extends monster class and is used to create this specific monster
 * @author Danilo Nakai
 */
public class Manticore extends Monster {
    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     **/
    public Manticore(String clan, double ferocity, double defense, double magic, double treasure, double health) {
        super(clan, ferocity, defense, magic, treasure, health);
    }

    /**
     * Set the new clan
     * @param clan The value to increase
     **/
    public void setClan(String clan) {
        super.clan = clan;
    }

    /**
     * Attack another monster
     * @param target Monster to be attacked
     **/
    public void attack(Monster target) {
        if (isAlive() && target.isAlive()) {
            double attackScore = ((getFerocity() + getDefense() + getMagic()) / 3) * 1.5;
            double enemyAttackScore = (target.getFerocity() + target.getDefense() + target.getMagic()) / 3;

            if (attackScore > enemyAttackScore) {
                target.setHealth(-(attackScore - enemyAttackScore));
                setTreasure((attackScore - enemyAttackScore));
            } else {
                setHealth(-(enemyAttackScore - attackScore));
                target.setTreasure((enemyAttackScore - attackScore));
            }
        } else {
            System.out.println("Cannot attack!");
        }
    }
}
