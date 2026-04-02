package SnakeLadder.Entities;

public class Ladder {
    private Integer ladderHead;
    private Integer ladderTail;

    public Ladder(Integer ladderHead, Integer ladderTail) {
        this.ladderHead = ladderHead;
        this.ladderTail = ladderTail;
    }

    public Integer getLadderHead() {
        return ladderHead;
    }

    public void setLadderHead(Integer ladderHead) {
        this.ladderHead = ladderHead;
    }

    public Integer getLadderTail() {
        return ladderTail;
    }

    public void setLadderTail(Integer ladderTail) {
        this.ladderTail = ladderTail;
    }
}
