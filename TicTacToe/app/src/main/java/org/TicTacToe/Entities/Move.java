package org.TicTacToe.Entities;

public class Move {
    private int row;
    private int col;

    public Move(int r, int c) {
        this.row = r;
        this.col = c;
    }

    public int getColumn() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(int c) {
        this.col = c;
    }

    public void setRow(int r) {
        this.row = r;
    }    
}
