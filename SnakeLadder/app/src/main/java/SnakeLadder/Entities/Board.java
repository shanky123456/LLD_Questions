package SnakeLadder.Entities;

import java.util.List;

public class Board {

    private Integer boardCapacity;
    private List<Cell> cells;


    public Board (Integer boardCapacity, List<Cell> cells) {
        this.boardCapacity = boardCapacity;
        this.cells = cells;
    }

    public Integer getBoardCapacity() {
        return boardCapacity;
    }

    public void setBoardCapacity(Integer boardCapacity) {
        this.boardCapacity = boardCapacity;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
