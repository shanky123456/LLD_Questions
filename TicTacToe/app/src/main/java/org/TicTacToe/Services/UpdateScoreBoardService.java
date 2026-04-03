package org.TicTacToe.Services;

import org.TicTacToe.Entities.Game;
import org.TicTacToe.Entities.ScoreBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UpdateScoreBoardService {
    public ScoreBoard updateScoreBoard(ScoreBoard scoreboard, Game game) {
        Integer gameID = game.getGameID();

        List<Game> games = scoreboard.getGames();
        if(games.isEmpty()) {
            games.add(game);
            scoreboard.setGames(games);
        }

        for(int i=0;i<games.size();i++) {
            Game tempGame = games.get(i);
            if(Objects.equals(tempGame.getGameID(), gameID)) {
                games.set(i, game);
                scoreboard.setGames(games);
                break;
            }
        }

        return scoreboard;

    }
}
