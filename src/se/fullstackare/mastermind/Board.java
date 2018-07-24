package se.fullstackare.mastermind;

import javafx.scene.Node;

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
            emptyRow[i] = new ColoredSpherePlaceholder();
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
