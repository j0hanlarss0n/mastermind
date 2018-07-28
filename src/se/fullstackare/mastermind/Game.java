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

    private String difficulty;

    private boolean uniqueColors;

    private Color selectedColor;

    private Board board;

    public Game(GameManager manager, String difficulty, boolean uniqueColors) {
        this.difficulty = difficulty;
        System.out.println("Setting Games 'UniqueColors' to: " + uniqueColors);
        this.uniqueColors = uniqueColors;
        System.out.println(" Games 'UniqueColors' is: " + this.uniqueColors);
        board = new Board(this);
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

    public String getDifficulty() {
        return difficulty;
    }

    public boolean getUniqueColors() {
        System.out.println(" Games is returning 'UniqueColors' as: " + uniqueColors);
        return uniqueColors;
    }

    public Board getBoard() {
        return board;
    }

    public Node getSkin() {
        return skin;
    }
}
