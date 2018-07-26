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
        if (currentRow != null) {
            currentRow.disableEventListener();
        }
        currentRow = row;
        currentRow.activateEventListener();
        currentRow.activateMarker();
    }

    public void changeToNextRow() {
        BoardRow lastRow = null;
        List<Skinnable> rowItems = board.getSkinnableItems();
        for (int i = 0; i < rowItems.size(); i++) {
            if (rowItems.get(i) == currentRow) {
               System.out.println("Found match");
               break;
            } else {
                System.out.println("Didnt find match");
                if (rowItems.get(i) instanceof  BoardRow) {
                    lastRow = (BoardRow) rowItems.get(i);
                }
            }
        }

        if (lastRow != null) {
            System.out.println("lastRow has a value");
            setCurrentRow(lastRow);
        }
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
