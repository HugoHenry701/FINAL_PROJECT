package com.module;

public class BoardGame {
    private int COLS;
    private int ROWS;
    private String boardName;
    private int boardID;
    private boolean boardStatus;

    public BoardGame(int col, int row, String bName, boolean boardBool, int bID) {
        COLS = col;
        ROWS = row;
        boardName = bName;
        boardStatus = boardBool;
        boardID = bID;
    }

    public BoardGame() {
        this(0, 0, "", false, 0);
    }

    public int getCOLS() {
        return COLS;
    }

    public int getROWS() {
        return ROWS;
    }

    public String getBoardName() {
        return boardName;
    }

    public boolean getBoardStatus() {
        return boardStatus;
    }

    public void setCOLS(int col) {
        COLS = col;
    }

    public void setROWS(int row) {
        ROWS = row;
    }

    public void setBoardName(String bName) {
        boardName = bName;
    }

    public boolean initBoard() {
        boardStatus = true;
        return true;
    }

    public boolean clearBoard() {
        COLS = 0;
        ROWS = 0;
        boardStatus = false;
        return false;
    }

    public boolean fillBoard(int col, int row) {
        COLS = col;
        ROWS = row;
        boardStatus = true;
        return true;
    }

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }
}
