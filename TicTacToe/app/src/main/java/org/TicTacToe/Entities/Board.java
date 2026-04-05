package org.TicTacToe.Entities;

import java.util.List;

public class Board {
    private Integer boardSize;
    private List<List<Cell>> cells;

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Integer getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }

    public boolean checkBoardForWin(Player player) {

        //check Horizontal

        for (int i = 0; i < cells.size(); i++) {
            boolean horizontalWin = true;
            for (int j = 0; j < cells.get(i).size(); j++) {
                if (!cells.get(i).get(j).isVisited()) {
                    horizontalWin = false;
                    break;
                }
                if(cells.get(i).get(j).getPlayer() != player) {
                    horizontalWin = false;
                    break;
                }
            }
            if (horizontalWin) {
                return true;
            }
        }

        //Check Vertical
        for (int i = 0; i < cells.get(0).size(); i++) {
            boolean verticalWin = true;
            for (List<Cell> cell : cells) {
                if (!cell.get(i).isVisited()) {
                    verticalWin = false;
                    break;
                }
                if(cell.get(i).getPlayer() != player) {
                    verticalWin = false;
                    break;
                }
            }
            if (verticalWin) {
                return true;
            }
        }


        //Check Diagonal

        // check Main Diagonal (top-left to bottom-right)
        boolean mainDiagonalWin = true;
        for (int i = 0; i < cells.size(); i++) {
            if (!cells.get(i).get(i).isVisited()) {
                mainDiagonalWin = false;
                break;
            }
            if(cells.get(i).get(i).getPlayer() != player) {
                mainDiagonalWin = false;
                break;
            }
        }
        if (mainDiagonalWin) return true;

        // check Anti-Diagonal (top-right to bottom-left)
        boolean antiDiagonalWin = true;
        int n = cells.size();
        for (int i = 0; i < n; i++) {
            if (!cells.get(i).get(n - 1 - i).isVisited()) {
                antiDiagonalWin = false;
                break;
            }
            if(cells.get(i).get(n - 1 - i).getPlayer() != player) {
                antiDiagonalWin = false;
                break;
            }
        }


        return antiDiagonalWin;
    }

    public boolean checkGameDraw() {

        for (List<Cell> cellRow : cells) {
            for (Cell cell : cellRow) {
                if (!cell.isVisited()) {
                    return false;
                }
            }
        }
        return true;
    }
}
