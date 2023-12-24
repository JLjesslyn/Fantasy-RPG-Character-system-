public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("P001", "PlayerOne");
        Player player2 = new Player("P002", "PlayerTwo");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A powerful swirling attack.");
        Skill dualWielding = new Skill("Dual Wielding", "Mastering the art of wielding two weapons at once.");
        Skill frostNova = new Skill("Frost Nova", "Freezing enemies in an area.");
        Skill lockpicking = new Skill("Lockpicking", "Unlocking without a key.");

        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);

        System.out.println("Character Information:");
        System.out.println(gideon.toString());
        gideon.displaySkills();
        System.out.println(elara.toString());
        elara.displaySkills();
        System.out.println(darian.toString());
        darian.displaySkills();
    }
}
