package com.controller;

import com.module.BOX;
import com.module.BoardGame;
import com.module.Player;


import java.util.ArrayList;

public class GameController {
    ArrayList<BoardGame> mapGame = new ArrayList<>();
    ArrayList<Player> player = new ArrayList<>();
    ArrayList<BOX> boxes = new ArrayList<>();
    public GameController( ) {
        initBox();
    }

    public boolean initBoard(int col, int row, String name, boolean boardStatus, int boardID) {
        boolean add = mapGame.add(new BoardGame(col, row, name, boardStatus, boardID));
        if (add) return true;
        else return false;
    }

    public boolean initPlayer(String name, String id, String colorP, int turn) {
        boolean add = player.add(new Player(name, id, colorP,0,turn));
        if (add) return true;
        else return false;
    }

    public BoardGame getBoardByName(String boardName) {
        BoardGame boardData = new BoardGame();
        for (BoardGame boardGame : mapGame) {
            if (boardGame.getBoardName().equals(boardName)) {
                boardData = boardGame;
            }
        }
        return boardData;
    }

    public ArrayList<String> getAllBoardName() {
        ArrayList<String> boardsName = new ArrayList<>();
        for (int i = 0; i < mapGame.size(); i++) {
            boardsName.set(i, mapGame.get(i).getBoardName());
        }
        return boardsName;
    }

    public Player getPlayerByName(String name) {
        Player playerData = new Player();
        for (Player value : player) {
            if (value.getPlayerName().equals(name)) playerData = value;
        }
        return playerData;
    }

    public ArrayList<String> getAllPlayer() {
        ArrayList<String> players = new ArrayList<>();
        for (int i = 0; i < player.size(); i++) {
            players.set(i, player.get(i).getPlayerName());
        }
        return players;
    }

    public void addPlayerPoint (int getPoint , String playerName){
        for (Player value : player) {
            if (value.getPlayerName().equals(playerName)) {
                value.addPoint(getPoint);
            }
        }
    }
    public void initBox (){
        boxes.set(0,new BOX("RED",false));
        boxes.set(1,new BOX("BLUE",false));
        boxes.set(2,new BOX("GREEN",false));
        boxes.set(3,new BOX("YELLOW",false));
    }
    public ArrayList<BOX> getBoxes(){
        return boxes;
    }
    public BOX getBoxByColor (String color){
        BOX boxData = new BOX();
        for (int i = 0; i < boxes.size() ; i++) {
            if(boxes.get(i).getColor().equals(color)){
                boxData = boxes.get(i);
            }
        }
        return boxData;
    }
    public void setBoxStatusByColor (String color, boolean boxStatus){
        for (int i = 0; i < boxes.size() ; i++) {
            if(boxes.get(i).getColor().equals(color)){
                boxes.get(i).setBoxStatus(boxStatus);
            }
        }
    }
}
