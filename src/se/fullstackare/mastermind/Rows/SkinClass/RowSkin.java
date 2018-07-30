package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.Row;

public class RowSkin extends HBox {

    public RowSkin (Row row, String styleClass) {
        getStyleClass().add("HiddenRow");
        setSpacing(10.0);
        row.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));
    }
}
