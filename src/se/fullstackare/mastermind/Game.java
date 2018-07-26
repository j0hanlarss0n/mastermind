package se.fullstackare.mastermind;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;
import se.fullstackare.mastermind.Rows.DataClass.Row;

public class Game implements Skinnable{

    private GameSkin skin;

    private Row currentRow;


    private Color selectedColor;

    private Board board = new Board(this);

    public Game(GameManager manager) {
        skin = new GameSkin(this);
    }

    public void setCurrentRow(BoardRow row) {
        currentRow = row;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
        System.out.println("Selected color changed to: " + selectedColor);
    }







    public Board getBoard() {
        return board;
    }

    public Node getSkin() {
        return skin;
    }
}
