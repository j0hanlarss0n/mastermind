package se.fullstackare.mastermind;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;
import se.fullstackare.mastermind.Rows.DataClass.HiddenRow;
import se.fullstackare.mastermind.Rows.DataClass.Row;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;
import se.fullstackare.mastermind.Spheres.DataClass.Sphere;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

import java.util.ArrayList;
import java.util.List;

public class Board implements Skinnable{

    private BoardRow currentRow;
    private BoardRow lastRow;

    protected List<Skinnable> rowItems = new ArrayList<>();

    private final BoardSkin skin;

    public Board(Game game) {

        rowItems.add(new HiddenRow(game));
        rowItems.add(new ColoredSpherePlaceholder(game));
        for (int i = 0; i < 10; i++) {
            rowItems.add(new BoardRow(game));
            if (i == 9) {
                setCurrentRow((BoardRow) rowItems.get(rowItems.size() - 1));
            }
        }
        rowItems.add(new ColoredSpherePlaceholder(game));
        rowItems.add(new SelectColorRow(game));


        ((Row) rowItems.get(rowItems.size() - 1)).getSkinnableItems().forEach(item -> {
            if (item.getSkin() instanceof SphereSkin) {
                ((SphereSkin) item.getSkin()).addEventHandler();
            }
        });
        /*
        ((RowSkin) rowItems.get(rowItems.size() - 1)).getRow().getSkinnableItems().forEach(item -> {
            if (item.getSkin() instanceof SphereSkin) {
                ((SphereSkin) item.getSkin()).addEventHandler();
            }
        });
        */

        skin = new BoardSkin(this);
    }

    public List<Skinnable> getSkinnableItems() {
        return rowItems;
    }

    public Node getSkin() {
        return skin;
    }

    public void changeToNextRow() {
        for (Skinnable row : rowItems) {
            if (row == currentRow) {
                System.out.println("Found match");
                break;
            } else {
                System.out.println("Didnt find match");
                if (row instanceof  BoardRow) {
                    lastRow = (BoardRow) row;
                }
            }
        }

        if (currentRow != null) {
            currentRow.deactivate();
            //currentRow.disableEventListener();
        }

        if (lastRow != null) {
            System.out.println("lastRow has a value");
            currentRow.deactivateMarker();
            setCurrentRow(lastRow);
        } else {
            System.out.println("Game ended");
        }
    }

    public void setCurrentRow(BoardRow row) {
        currentRow = row;
        currentRow.activate();
        //currentRow.activateEventListener();
        //currentRow.activateMarker();
    }

    public void removeSelected(Color color) {
        ((SelectColorRow) rowItems.get(rowItems.size() - 1)).removeSelectedStyle(color);
    }

    public void addSelected(Color color) {
        ((SelectColorRow) rowItems.get(rowItems.size() - 1)).addSelectedStyle(color);
    }

}
