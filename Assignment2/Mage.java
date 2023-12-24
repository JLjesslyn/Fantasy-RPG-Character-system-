public class Mage extends Character {
    private String elementalAffinity;

    public Mage(String characterID, String characterName, int level, String elementalAffinity) {
        super(characterID, characterName, level);
        this.elementalAffinity = elementalAffinity;
    }

    public String getElementalAffinity() {
        return elementalAffinity;
    }

    public void setElementalAffinity(String elementalAffinity) {
        this.elementalAffinity = elementalAffinity;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nElemental Affinity: " + elementalAffinity;
    }

    public void castElementalSpell(String spellType) {
    int characterLevel = getLevel();

    if (characterLevel < 5) {
        System.out.println(characterName + " needs to reach level 5 before casting any spells.");
    } else {
        switch (spellType) {
            case "Teleportation":
                System.out.println("Teleporting " + characterName + " out of danger!");
                break;
            case "Illusion":
                System.out.println(characterName + " is creating illusions to confuse the enemy.");
                break;
            case "Detection":
                System.out.println(characterName + " is detecting the presence of magic nearby...");
                break;
            default:
                System.out.println("Invalid spell type!");
        }
    }
}
}