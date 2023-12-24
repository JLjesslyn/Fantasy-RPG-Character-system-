import java.util.ArrayList;
public class Character extends Player {
    private String characterID;
    public String characterName;
    private int level;
    private int health;
    private ArrayList<Skill> skills;

    public Character(String characterID, String characterName, int level) {
        super(characterID, characterName); 
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = level;
        this.health = 100;
        this.skills = new ArrayList<>();
    }

    public String getCharacterID() {
        return characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void levelUp() {
        this.level++;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void displaySkills() {
        for (Skill skill : skills) {
            System.out.println("Skill: " + skill.getSkillName() + ", Description: " + skill.getSkillDescription());
        }
    }

    @Override
    public String toString() {
        return "Character ID: " + characterID + ", Name: " + characterName + ", Level: " + level + ", Health: " + health + ", Skills: " + skills.size();
    }
}
