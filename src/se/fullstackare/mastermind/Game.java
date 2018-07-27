package se.fullstackare.mastermind;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;
import se.fullstackare.mastermind.Rows.DataClass.Row;

import java.util.List;

public class Game implements Skinnable{

    private GameSkin skin;

    private BoardRow currentRow;


    private Color selectedColor;

    private Board board = new Board(this);

    public Game(GameManager manager) {
        skin = new GameSkin(this);
    }

    public void setCurrentRow(BoardRow row) {
        board.setCurrentRow(row);
    }

    public void changeToNextRow() {
        board.changeToNextRow();
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color newSelectedColor) {
        if (selectedColor != null) {
            board.removeSelected(selectedColor);
        }
        board.addSelected(newSelectedColor);
        selectedColor = newSelectedColor;
        System.out.println("Selected color changed to: " + selectedColor);
    }


    public Board getBoard() {
        return board;
    }

    public Node getSkin() {
        return skin;
    }
}
