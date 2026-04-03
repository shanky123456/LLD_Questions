package org.TicTacToe.Services;

import org.TicTacToe.Entities.*;

import java.util.ArrayList;
import java.util.List;

public class InitializeGameService {

    private String player1Name;
    private String player2Name;
    private Integer sizeOfBoard;
    private Integer gameID;
    private Game initializedGame;

    public InitializeGameService(String player1Name, String player2Name, Integer sizeOfBoard, Integer gameID) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.sizeOfBoard = sizeOfBoard;
        this.gameID = gameID;
    }

    public Game initializeGame() {

        initializedGame = new Game();
        initializedGame.setGameID(this.gameID);
        Status status = Status.NOT_STARTED;
        initializedGame.setStatus(status);  // Initializing Status of Game


        List<Cell> cells = new ArrayList<Cell>();
        for (int i = 0; i < sizeOfBoard * sizeOfBoard; i++) {
            Cell tempCell = new Cell();
            tempCell.setVisited(Boolean.FALSE);
            cells.add(tempCell);
        }

        Board board = new Board();
        board.setBoardSize(sizeOfBoard);
        board.setCells(cells);

        initializedGame.setBoard(board);  // Initializing Board of Game

        List<Player> players = new ArrayList<Player>();

        Player playerOneObj = new Player();
        playerOneObj.setPlayerName(player1Name);
        playerOneObj.setPositionsVisited(new ArrayList<Integer>());

        Player playerTwoObj = new Player();
        playerTwoObj.setPlayerName(player2Name);
        playerTwoObj.setPositionsVisited(new ArrayList<Integer>());

        players.add(playerOneObj);
        players.add(playerTwoObj);

        initializedGame.setPlayers(players);  // Initializing Players in Game.

        return initializedGame;
    }

}
