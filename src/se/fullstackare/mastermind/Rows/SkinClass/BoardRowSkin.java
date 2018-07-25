package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;

public class BoardRowSkin extends RowSkin {

    public BoardRowSkin(BoardRow boardRow) {
        super(boardRow);
        getStyleClass().add("BoardRow");
    }
}
