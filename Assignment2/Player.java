public class Player {
    private String playerID;
    private String playerName;

    public Player(String playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }
}