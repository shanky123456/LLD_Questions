package org.TicTacToe.Services;

import org.TicTacToe.Entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayGameService {
    private Game game;
    Scanner sc;

    public PlayGameService(Game game, Scanner sc) {
        this.game = game;
        this.sc = sc;
    }

    public Game playGame() {

        Board board = this.game.getBoard();
        int sizeOfBoard = board.getBoardSize();
        List<Player> players = this.game.getPlayers();
        List<List<Cell>> cells = board.getCells();

        this.game.setStatus(Status.ON_GOING); // Setting the status of game as ongoing.

        boolean gameNotFinished = true;

        while (gameNotFinished) {
            for (Player tempPlayer : players) {
                boolean tempIsVisited = true;
                while (tempIsVisited) {
                    System.out.println("Enter the row number of block you have to mark");
                    int selectedBlockRow = sc.nextInt();
                    System.out.println("Enter the column number of block you have to mark");
                    int selectedBlockCol = sc.nextInt();
                    if (selectedBlockRow < 0 || selectedBlockCol < 0 || selectedBlockRow >= sizeOfBoard || selectedBlockCol >= sizeOfBoard || cells.get(selectedBlockRow).get(selectedBlockCol).isVisited()) {
                        System.out.println("Enter the block number which is not visited");
                        continue;
                    } else {
                        tempIsVisited = false;

                        Move positionData = new Move(selectedBlockRow, selectedBlockCol);

                        tempPlayer.getPositionsVisited().add(positionData);
                        board.makeMove(tempPlayer, selectedBlockRow, selectedBlockCol);
                    }
                }
                if (board.checkGameDraw()) {
                    this.game.setStatus(Status.DRAW);
                    System.out.println("The Game is draw");
                    gameNotFinished = false;
                }
                boolean isWin = board.checkBoardForWin(tempPlayer);
                if (isWin) {
                    System.out.println("The winner of the game is: " + tempPlayer.getPlayerName());
                    this.game.setWinner(tempPlayer);
                    this.game.setStatus(Status.FINISHED);
                    gameNotFinished = false;
                    break;
                }
            }
        }
        return this.game;
    }
}

