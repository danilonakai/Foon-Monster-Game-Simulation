package assignment6;

/**
 * Implementation of monster class
 * This class creates a monster and can be used to create a specific monster
 * @author Danilo Nakai
 */
public class Monster {
    /** Clan **/
    String clan;
    /** Ferocity **/
    private double ferocity;
    /** Defense **/
    private double defense;
    /** Magic **/
    private double magic;
    /** Treasure **/
    private double treasure;
    /** Health **/
    private double health;

    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     **/
    public Monster(String clan, double ferocity, double defense, double magic, double treasure, double health) {
        this.clan = clan;
        this.ferocity = ((ferocity > 20) ? 20 : ((ferocity < 0) ? 0 : ferocity));
        this.defense = ((defense > 20) ? 20 : ((defense < 0) ? 0 : defense));
        ;
        this.magic = ((magic > 20) ? 20 : ((magic < 0) ? 0 : magic));
        this.treasure = treasure;
        this.health = ((magic > 20) ? 20 : ((magic < 0) ? 0 : magic));
        ;
    }

    /**
     * Get the clan
     * @return The clan name
     **/
    public String getClan() {
        return clan;
    }

    /**
     * Get the ferocity point
     * @return The ferocity point
     **/
    public double getFerocity() {
        return ferocity;
    }

    /**
     * Add ferocity points
     * @param ferocity The value to increase/decrease
     **/
    public void setFerocity(double ferocity) {
        if (ferocity > 0 && this.ferocity < 20) {
            this.ferocity = this.ferocity + 1;
        } else if (ferocity < 0 && this.ferocity > 0) {
            this.ferocity = this.ferocity - 1;
        }
    }

    /**
     * Get the defense point
     * @return The defense point
     **/
    public double getDefense() {
        return defense;
    }

    /**
     * Add defense points
     * @param defense The value to increase/decrease
     **/
    public void setDefense(double defense) {
        if (defense > 0 && this.defense < 20) {
            this.defense = this.defense + 1;
        } else if (defense < 0 && this.defense > 0) {
            this.defense = this.defense - 1;
        }
    }

    /**
     * Get the magic point
     * @return The magic point
     **/
    public double getMagic() {
        return magic;
    }

    /**
     * Add magic points
     * @param magic The value to increase/decrease
     **/
    public void setMagic(double magic) {
        if (magic > 0 && this.magic < 20) {
            this.magic = this.magic + 1;
        } else if (magic < 0 && this.magic > 0) {
            this.magic = this.magic - 1;
        }
    }

    /**
     * Get the treasure amount
     * @return The treasure amount
     **/
    public double getTreasure() {
        return treasure;
    }

    /**
     * Add treasure amount
     * @param treasure The value to increase/decrease
     **/
    public void setTreasure(double treasure) {
        this.treasure = this.treasure + treasure;
    }

    /**
     * Get the health value
     * @return The health value
     **/
    public double getHealth() {
        return health;
    }

    /**
     * Add health value
     * @param health The value to increase/decrease
     **/
    public void setHealth(double health) {
        this.health = this.health + health;
    }

    /**
     * Check if the monster is alive
     * @return The true/false value
     **/
    public boolean isAlive() {
        boolean alive = false;

        if (this.health > 0) {
            alive = true;
        }

        return alive;
    }

    /**
     * Attack another monster
     * @param target Monster to be attacked
     **/
    public void attack(Monster target) {
        if (isAlive() && target.isAlive()) {
            double attackScore = (getFerocity() + getDefense() + getMagic()) / 3;
            double enemyAttackScore = ((target.getFerocity() + target.getDefense() + target.getMagic()) / 3);

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

    /**
     * Convert monster's information to string
     **/
    @Override
    public String toString() {
        return "Monster{" +
                "clan='" + clan + '\'' +
                ", ferocity=" + ferocity +
                ", defense=" + defense +
                ", magic=" + magic +
                ", treasure=" + treasure +
                ", health=" + health +
                '}';
    }
}
