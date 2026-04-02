package SnakeLadder.Entities;

public class Player {
    private Integer playerId;
    private String playerName;
    private Integer currentCellNo;

    public Player() {

    }
    public Player(Integer playerId, String playerName, Integer currentCellNo) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.currentCellNo = currentCellNo;
    }
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Integer getCurrentCellNo() {
        return currentCellNo;
    }

    public void setCurrentCellNo(Integer currentCellNo) {
        this.currentCellNo = currentCellNo;
    }
}
