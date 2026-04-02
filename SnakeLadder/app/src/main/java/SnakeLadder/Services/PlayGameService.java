package SnakeLadder.Services;

import SnakeLadder.Entities.Player;

import java.util.Objects;

public class PlayGameService {
    private GameData gameData;
    private Player winner;
    public PlayGameService(GameData gamedata) {
        this.gameData = gamedata;
    }

    public Player playGame() {

        Boolean gameFinished = Boolean.FALSE;

        while(!gameFinished) {
            System.out.println("\nRolling the dices one by one....");
            for(int i=0;i<this.gameData.getPlayers().size();i++) {
                Player tempPlayer = this.gameData.getPlayers().get(i);
                Integer tempCurrentCellNo = tempPlayer.getCurrentCellNo();
                Integer tempCurrentPlayerId = tempPlayer.getPlayerId();
                String tempCurrentPlayerName = tempPlayer.getPlayerName();
                Integer diceValue = this.gameData.getDice().rollDice();
                System.out.println("Rolled Dice value for " + tempCurrentPlayerName + "is " + diceValue);
                System.out.println("The current position of " + tempCurrentPlayerName + "is " + tempCurrentCellNo);
                Integer nextPosition = tempCurrentCellNo + diceValue;
                System.out.println("The next position before of " + tempCurrentPlayerName + "is " + nextPosition);

                if(nextPosition > this.gameData.getBoard().getBoardCapacity()) {
                    continue;
                }

                if(this.gameData.getBoard().getCells().get(nextPosition).getSnake().size()!= 0) {
                    System.out.println("exec snake");
                    nextPosition = this.gameData.getBoard().getCells().get(nextPosition).getSnake().get(0).getSnakeTail();
                }
                else if(this.gameData.getBoard().getCells().get(nextPosition).getLadder().size()!= 0) {
                    System.out.println("exec ladder");
                    nextPosition = this.gameData.getBoard().getCells().get(nextPosition).getLadder().get(0).getLadderHead();
                }
                System.out.println("The next position after of " + tempCurrentPlayerName + "is " + nextPosition);
                this.gameData.getPlayers().get(i).setCurrentCellNo(nextPosition);
                System.out.println("The current position of " + tempCurrentPlayerName + " is " + this.gameData.getPlayers().get(i).getCurrentCellNo());
                if(Objects.equals(nextPosition, this.gameData.getBoard().getBoardCapacity())) {
                    this.winner = tempPlayer;
                    gameFinished = Boolean.TRUE;

                    return this.winner;
                }
            }
        }
        return this.winner;
    }
    public void announceWinner() {
        System.out.println("The winner of the Game is " + this.winner.getPlayerName());
    }
    public void endGame() {
        System.out.println("\nThanks for playing the Snake and Ladder Game!!");
    }
}
