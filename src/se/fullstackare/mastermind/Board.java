package se.fullstackare.mastermind;

import javafx.scene.Node;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;
import se.fullstackare.mastermind.Rows.DataClass.HiddenRow;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;

public class Board implements Skinnable{

    private final BoardSkin skin;
    private final HiddenRow hiddenRow;
    private final BoardRow[] boardRows = new BoardRow[10];
    private final ColoredSpherePlaceholder[] emptyRow = new ColoredSpherePlaceholder[2];
    private final SelectColorRow selectRow;

    public Board(Game game) {
        for (int i = 0; i < 10; i++) {
            boardRows[i] = new BoardRow(game);
        }
        for (int i = 0; i < 2; i++) {
            emptyRow[i] = new ColoredSpherePlaceholder(game);
        }
        hiddenRow = new HiddenRow(game);
        selectRow = new SelectColorRow(game);
        skin = new BoardSkin(this);
    }

    public BoardRow getRow(int i) {
        return boardRows[i];
    }
    public HiddenRow getHiddenRow() {
        return hiddenRow;
    }
    public SelectColorRow getSelectRow() {
        return selectRow;
    }
    public ColoredSpherePlaceholder getEmptyRow(int i) {
        return emptyRow[i];
    }
    public Node getSkin() {
        return skin;
    }
}
