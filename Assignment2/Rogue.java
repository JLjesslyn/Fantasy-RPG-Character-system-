import java.util.ArrayList;
public class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, String daggerType) {
        super(characterID, characterName, level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public String getDaggerType() {
        return daggerType;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    public void setDaggerType(String daggerType) {
        this.daggerType = daggerType;
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nStealth Level: " + stealthLevel + "\nDagger Type: " + daggerType;
    }

    public void stab(Character target) {
    int targetHealth = target.getHealth();
    int targetLevel = target.getLevel();

    if (targetLevel >= 1 && targetLevel <= 3) {
        target.setHealth(targetHealth - 10);
    } else if (targetLevel >= 4 && targetLevel <= 5) {
        target.setHealth(targetHealth - 15);
    } else {
        target.setHealth(targetHealth - 20);
    }
}

public void evasion() {
    if (stealthLevel < 5) {
        System.out.println(getCharacterName() + "'s stealth level must reach level 5 before evading attacks.");
    } else {
        System.out.println(getCharacterName() + " successfully evaded the incoming attack.");
    }
}
}