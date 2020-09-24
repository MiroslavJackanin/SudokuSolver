package sk.it;

import sk.it.model.Board;

public class Game {
    private Board board;
    private boolean state;

    public Game(Board board) {
        this.board = board;
        this.state = false;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
