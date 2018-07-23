package sample;

import javafx.scene.Node;

public class Board {

    private final BoardSkin skin;
    private final HiddenRow hiddenRow = new HiddenRow();
    private final Row[] rows = new Row[10];
    private final ColoredSpherePlaceholder emptyRow = new ColoredSpherePlaceholder();
    private final SelectColorRow selectRow = new SelectColorRow();

    public Board() {
        for (int i = 0; i < 10; i++) {
            rows[i] = new Row();
        }
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
    public ColoredSpherePlaceholder getEmptyRow() {
        return emptyRow;
    }
    public Node getSkin() {
        return skin;
    }
}
