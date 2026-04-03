package org.TicTacToe.Entities;

import java.util.List;

public class Player {

    private String playerName;
    private List<Integer> positionsVisited;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<Integer> getPositionsVisited() {
        return positionsVisited;
    }

    public void setPositionsVisited(List<Integer> positionsVisited) {
        this.positionsVisited = positionsVisited;
    }
}
