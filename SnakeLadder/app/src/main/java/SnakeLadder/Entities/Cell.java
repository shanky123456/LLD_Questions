package SnakeLadder.Entities;

import java.util.List;

public class Cell {
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private List<Player> players;

    public Cell (List<Snake> snakes, List<Ladder> ladders, List<Player> players) {
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = players;
    }

    public List<Ladder> getLadder() {
        return ladders;
    }

    public void setLadder(List<Ladder> ladder) {
        this.ladders = ladder;
    }

    public List<Snake> getSnake() {
        return snakes;
    }

    public void setSnake(List<Snake> snake) {
        this.snakes = snake;
    }

    public List<Player> getPlayer() {
        return players;
    }

    public void setPlayer(List<Player> player) {
        this.players = player;
    }
}
