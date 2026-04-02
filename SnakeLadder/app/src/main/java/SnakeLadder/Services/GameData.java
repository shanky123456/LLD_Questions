package SnakeLadder.Services;

import SnakeLadder.Entities.Board;
import SnakeLadder.Entities.Dice;
import SnakeLadder.Entities.RandomDiceStrategy;
import SnakeLadder.Entities.Player;

import java.util.List;

public class GameData {
    private Board board;
    private Dice dice;
    private List<Player> players;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
