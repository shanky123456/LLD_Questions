package SnakeLadder.Entities;

public class Snake {
    private Integer snakeHead;
    private Integer snakeTail;

     public Snake(Integer snakeHead, Integer snakeTail) {
         this.snakeHead = snakeHead;
         this.snakeTail = snakeTail;
     }

    public Integer getSnakeHead() {
        return snakeHead;
    }

    public void setSnakeHead(Integer snakeHead) {
        this.snakeHead = snakeHead;
    }

    public Integer getSnakeTail() {
        return snakeTail;
    }

    public void setSnakeTail(Integer snakeTail) {
        this.snakeTail = snakeTail;
    }
}
