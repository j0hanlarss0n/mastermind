package se.fullstackare.mastermind;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;

public class Game implements Skinnable{

    private GameSkin skin;

    private BoardRow currentRow;

    private String difficulty;

    private boolean uniqueColors;

    private Color selectedColor;

    private Board board;

    private boolean gameWon = false;

    private boolean gameOver = false;


    public Game(GameManager manager, String difficulty, boolean uniqueColors) {
        this.difficulty = difficulty;
        this.uniqueColors = uniqueColors;
        board = new Board(this);
        skin = new GameSkin(this);
    }

    public void setCurrentRow(BoardRow row) {
        board.setCurrentRow(row);
    }

    public void changeToNextRow() {
        board.calculateScore();
        if (gameWon) {
            board.victory();
        }
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
        return uniqueColors;
    }

    public void setGameWon(boolean bool) {
        gameWon = bool;
    }

    public void setGameOver(boolean bool) {
        gameWon = bool;
    }

    public boolean getGameWon() {
        return gameWon;
    }

    public boolean getGameOver() {
        return gameWon;
    }

    public Board getBoard() {
        return board;
    }

    public Node getSkin() {
        return skin;
    }
}
