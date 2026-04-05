package org.TicTacToe.Services;

import org.TicTacToe.Entities.Game;
import org.TicTacToe.Entities.ScoreBoard;

import java.util.List;

public class PrintScoreBoardService {


    public void printScoreBoard(ScoreBoard scoreBoard) {
        System.out.println("===== SCOREBOARD =====");

        List<Game> games = scoreBoard.getGames();
        if (games == null || games.isEmpty()) {
            System.out.println("No games found.");
            return;
        }

        for (Game game : games) {
            System.out.println("Game ID: " + game.getGameID());
            System.out.println("Status : " + game.getStatus());

            if (game.getPlayers() != null && game.getPlayers().size() >= 2) {
                System.out.println("Players: "
                        + game.getPlayers().get(0).getPlayerName()
                        + " vs "
                        + game.getPlayers().get(1).getPlayerName());
            }

            System.out.println("Winner : "
                    + (game.getWinner() != null ? game.getWinner().getPlayerName() : "NA"));
            System.out.println("----------------------");
        }
        System.out.println("\n");
    }


}
