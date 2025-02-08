package assignment6;

import java.util.ArrayList;

/**
 * Implementation of orc warlord class
 * This class extends monster class and is used to create this specific monster
 * @author Danilo Nakai
 */
public class OrcWarlord extends Monster {
    /** Leadership **/
    private int leadership;
    /** Infantry List **/
    private ArrayList<OrcInfantryMember> infantry = new ArrayList();

    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     * @param leadership The monster's leadership value
     **/
    public OrcWarlord(String clan, double ferocity, double defense, double magic, double treasure, double health, int leadership) {
        super(clan, ferocity, defense, magic, treasure, health);

        if (leadership >= 5) {
            this.leadership = 5;
        } else if (leadership <= 1) {
            this.leadership = 1;
        } else {
            this.leadership = leadership;
        }

        for (int i = 0; i < 5; i++) {
            OrcInfantryMember orc = new OrcInfantryMember(clan, ferocity, defense, magic, treasure, health, this);

            infantry.add(orc);
        }
    }

    /**
     * Get the leadership value
     * @return The leadership value
     **/
    public int getLeadership() {
        return leadership;
    }

    /**
     * Set the leadership value
     * @param leadership The value to increase
     **/
    public void setLeadership(int leadership) {
        if (leadership > 0 && this.leadership < 5) {
            this.leadership = this.leadership + 1;
        } else if (leadership < 0 && this.leadership > 0) {
            this.leadership = this.leadership - 1;
        }
    }

    /**
     * Get the infantary list
     * @return The infantary list value
     **/
    public ArrayList<OrcInfantryMember> getInfantry() {
        return infantry;
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
                double attackDifference = (attackScore - enemyAttackScore);

                target.setHealth(-attackDifference);
                setTreasure(attackDifference);
                setLeadership((int) (attackDifference / 10));
            } else {
                setHealth(-(enemyAttackScore - attackScore));
                target.setTreasure((enemyAttackScore - attackScore));
            }
        } else {
            System.out.println("Cannot attack!");
        }
    }

    /**
     * Sound the battle cry to heal infantary
     **/
    public void battleCry() {
        if (isAlive()) {
            double healthBoost = leadership * 5;

            for (int i = 0; i < infantry.size(); i++) {
                if (infantry.get(i).isAlive()) {
                    infantry.get(i).setHealth(healthBoost);
                } else {
                    System.out.println("Cannot be healed!");
                }
            }
        } else {
            System.out.println("Cannot heal!");
        }
    }
}
