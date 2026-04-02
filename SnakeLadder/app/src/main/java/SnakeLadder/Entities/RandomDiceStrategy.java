package SnakeLadder.Entities;

import java.util.Random;

public class RandomDiceStrategy implements DiceStrategy{

    private Integer diceCapacity;

    public RandomDiceStrategy(Integer diceCapacity) {
        this.diceCapacity = diceCapacity;
    }
    public Integer rollDice() {
        Random rand = new Random();
        return rand.nextInt(this.diceCapacity) + 1;
    }

    public Integer getDiceCapacity() {
        return diceCapacity;
    }

    public void setDiceCapacity(Integer diceCapacity) {
        this.diceCapacity = diceCapacity;
    }
}
