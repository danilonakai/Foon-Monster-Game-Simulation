package assignment6;

public class Main {
    /**
     * A method to test the object
     * @param args unused
     **/
    public static void main(String[] args) {
        OrcWarlord warlord = new OrcWarlord("Clan 1", 21, 20, 10, 10, 10, 2);
        Goblin goblin = new Goblin("Clan 2", 10, 10, 10, 10, 10);
        Manticore manticore = new Manticore("Clan 2", 10, 10, 10, 10, 10);

        //TESTING ALL FEATURES
        System.out.println(warlord.getFerocity());

        System.out.println(warlord.getLeadership());

        warlord.setDefense(1);

        System.out.println(warlord.getDefense());

        // warlord.setClan(); IT DOESN'T WORK BECAUSE ONLY MANTICORE CAN CHANGE THE CLAN

        manticore.setClan("Clan 3");

        System.out.println(manticore.getClan());

        System.out.println(goblin.getEnemy());

        goblin.attack();

        System.out.println(goblin.getEnemy().getHealth());

        System.out.println(warlord.getLeadership());

        warlord.setLeadership(-2);

        System.out.println(warlord.getLeadership());

        System.out.println(warlord.getInfantry());

        System.out.println(warlord.getHealth());
        System.out.println(goblin.getHealth());

        System.out.println(warlord.getLeadership());
        System.out.println(warlord.getTreasure());

        warlord.attack(goblin);

        System.out.println(warlord.getLeadership());
        System.out.println(warlord.getTreasure());

        System.out.println(warlord.getHealth());

        System.out.println(goblin.getHealth());

        System.out.println(goblin.isAlive());

        warlord.attack(goblin);

        System.out.println(warlord.getInfantry().get(1).getHealth());

        warlord.battleCry();

        System.out.println(warlord.getInfantry().get(1).getHealth());

        System.out.println(warlord.toString()); // Printing warlord information
        System.out.println(goblin.toString()); // Printing goblin information
        System.out.println(manticore.toString()); // Printing manticore information
    }
}