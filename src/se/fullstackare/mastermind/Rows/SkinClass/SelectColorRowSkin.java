package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;

public class SelectColorRowSkin extends RowSkin {

    public SelectColorRowSkin(SelectColorRow selectColorRow) {
        super(selectColorRow);
        getStyleClass().add("SelectColorRow");
    }
}
