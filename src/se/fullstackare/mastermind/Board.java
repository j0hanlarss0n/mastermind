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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Board implements Skinnable{

    private BoardRow currentRow;
    private BoardRow lastRow;
    private Game game;

    protected List<Skinnable> rowItems = new ArrayList<>();

    private final BoardSkin skin;

    public Board(Game game) {
        this.game = game;
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

        //TODO-Johan Needs to check with hidden row and determin scores

        if (currentRow != null) {
            currentRow.deactivate();
        }


        if (currentRow != lastRow && !game.getGameOver() && !game.getGameWon()) {

            if (lastRow != null) {
                System.out.println("lastRow has a value");
                currentRow.deactivateMarker();
                setCurrentRow(lastRow);
            } else {
                System.out.println("lastRow = null");
            }
        } else {
            System.out.println("Curr = last = Game ended");
            game.setGameOver(true);
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

    public void victory() {
        currentRow.correctRow();
    }

    public HiddenRow getHiddenRow () {
        return (HiddenRow) rowItems.get(0);
    }

    public void calculateScore () {
        List<Color> hiddenRowColors = getHiddenRow().getSphereColors();
        List<Color> boardRowColors = currentRow.getSphereColors();
        List<Integer> blackPeg = new ArrayList<>();
        List<Color> whitePeg = new ArrayList<>();
        List<Color> score = new ArrayList<>();

        for (int i = 0; i < hiddenRowColors.size(); i++) {
            if (hiddenRowColors.get(i) == boardRowColors.get(i)) {
                blackPeg.add(i);
                System.out.println("Calculate Score: MATCH!");
            }
        }

        if (game.getDifficulty() == "Show correct") {
            ((HiddenRow) rowItems.get(0)).showColors(blackPeg);
        }

        int shift = 0;
        for (Integer peg : blackPeg) {
            hiddenRowColors.remove((int) peg - shift);
            boardRowColors.remove((int) peg - shift);
            shift++;
            System.out.println("Calculate Score: Removing " + peg);
        }

        for (Color color : boardRowColors) {
            if ( ! whitePeg.contains(color)) {
                if (hiddenRowColors.contains(color)) {
                    whitePeg.add(color);
                    System.out.println("Calculate Score: color added to whitePeg");
                } else {
                    System.out.println("Calculate Score: Color not present in hidden row");
                }
            } else {
                System.out.println("Calculate Score: color already in whitePeg");
            }
        }

        blackPeg.forEach(peg -> score.add(Color.NAVY));
        whitePeg.forEach(peg -> score.add(Color.WHITE));
        while(score.size() < 4) {
            score.add(Color.GREY);
        }

        currentRow.setScore(score);

    }

}
