package sample;

import javafx.scene.Node;
import javafx.scene.Parent;

public class Game {
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
