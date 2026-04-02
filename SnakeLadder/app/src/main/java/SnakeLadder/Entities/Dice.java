package SnakeLadder.Entities;

public class Dice {
    private DiceStrategy diceStrategy;
    public Dice(DiceStrategy diceStrategy) {
        this.diceStrategy = diceStrategy;
    }

    public DiceStrategy getDiceStrategy() {
        return diceStrategy;
    }

    public void setDiceStrategy(DiceStrategy diceStrategy) {
        this.diceStrategy = diceStrategy;
    }

    public Integer rollDice() {
        return this.diceStrategy.rollDice();
    }
}
