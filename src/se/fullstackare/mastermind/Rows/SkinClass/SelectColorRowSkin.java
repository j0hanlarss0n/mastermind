package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;

public class SelectColorRowSkin extends HBox {

    public SelectColorRowSkin(SelectColorRow selectColorRow) {
        getStyleClass().add("SelectColorRow");
        setSpacing(10.0);

        selectColorRow.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));
        /*
        for (int i = 0; i < 8; i++) {
            getChildren().add(selectColorRow.getSphere(i).getSkin());
        }
        */
    }
}
