package org.TicTacToe.Entities;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private ArrayList<Move> positionsVisited;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<Move> getPositionsVisited() {
        return positionsVisited;
    }

    public void setPositionsVisited(ArrayList<Move> positionsVisited) {
        this.positionsVisited = positionsVisited;
    }
}

