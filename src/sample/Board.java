package sample;

import javafx.scene.Node;

public class Board {

    private final BoardSkin skin;
    private final HiddenRow hiddenRow;
    private final Row[] rows = new Row[10];
    private final ColoredSpherePlaceholder[] emptyRow = new ColoredSpherePlaceholder[2];
    private final SelectColorRow selectRow;

    public Board(Game game) {
        for (int i = 0; i < 10; i++) {
            rows[i] = new Row(game);
        }
        for (int i = 0; i < 2; i++) {
            emptyRow[i] = new ColoredSpherePlaceholder();
        }
        hiddenRow = new HiddenRow(game);
        selectRow = new SelectColorRow(game);
        skin = new BoardSkin(this);
    }

    public Row getRow(int i) {
        return rows[i];
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
