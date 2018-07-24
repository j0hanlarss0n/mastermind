package se.fullstackare.mastermind;

import javafx.scene.Node;

public class Game implements Skinnable{
    private GameSkin skin;
    private Board board = new Board(this);

    public Game(GameManager manager) {
        skin = new GameSkin(this);
    }



    public Board getBoard() {
        return board;
    }

    public Node getSkin() {
        return skin;
    }
}
