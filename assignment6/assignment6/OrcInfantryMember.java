package assignment6;

/**
 * Implementation of orc infantary member class
 * This class extends monster class and is used to create this specific monster
 * @author Danilo Nakai
 */
public class OrcInfantryMember extends Monster {
    /** Warlord **/
    private OrcWarlord warlord;

    /**
     * Constructor method
     * @param clan The monster's clan
     * @param ferocity The monster's ferocity points
     * @param defense The monster's defense points
     * @param magic The monster's magic points
     * @param treasure The monster's treasure amount
     * @param health The monster's health value
     * @param warlord The orc's warlord
     **/
    public OrcInfantryMember(String clan, double ferocity, double defense, double magic, double treasure, double health, OrcWarlord warlord) {
        super(clan, ferocity, defense, magic, treasure, health);

        this.warlord = warlord;
    }
}
