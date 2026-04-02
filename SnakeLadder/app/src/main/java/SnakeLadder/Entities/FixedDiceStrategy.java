package SnakeLadder.Entities;

import java.util.Random;

public class FixedDiceStrategy implements DiceStrategy{

    private Integer diceCapacity;

    public FixedDiceStrategy(Integer diceCapacity) {
        this.diceCapacity = diceCapacity;
    }
    public Integer rollDice() {
        return 3;
    }

    public Integer getDiceCapacity() {
        return diceCapacity;
    }

    public void setDiceCapacity(Integer diceCapacity) {
        this.diceCapacity = diceCapacity;
    }
}
