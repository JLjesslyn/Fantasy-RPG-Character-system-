public class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, String weaponType, String armorType) {
        super(characterID, characterName, level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
    int effectiveness = (getLevel() > 5) ? 100 : 50;
    switch (getWeaponType()) {
        case "Sword":
            if (getLevel() > 5) {
                target.setHealth(target.getHealth() - 50);
            } else {
                target.setHealth(target.getHealth() - (int) (effectiveness * 0.5));
            }
            break;
        case "Dagger":
        case "Crossbow":
            target.setHealth(target.getHealth() - 20);
            break;
        case "Staff":
            target.setHealth(target.getHealth() - 10);
            break;
    }
}

public void shieldBlock() {
    switch (getArmorType()) {
        case "Shield":
            System.out.println(getCharacterName() + " is raising its shield.");
            break;
        case "Gauntlet":
            System.out.println(getCharacterName() + " is raising its gauntlets.");
            break;
        case "Helmet":
            System.out.println(getCharacterName() + "'s head is protected.");
            break;
        default:
            System.out.println(getCharacterName() + ", I hope you’re protected... somehow.");
    }
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeapon Type: " + weaponType + "\nArmor Type: " + armorType;
    }
}


   