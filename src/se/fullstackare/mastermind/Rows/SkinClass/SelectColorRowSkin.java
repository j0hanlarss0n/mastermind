package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;

public class SelectColorRowSkin extends RowSkin {

    public SelectColorRowSkin(SelectColorRow selectColorRow, String styleClass) {
        super(selectColorRow, styleClass);
        getStyleClass().add("SelectColorRow");
    }
}
