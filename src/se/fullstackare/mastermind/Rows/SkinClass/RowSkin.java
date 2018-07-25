package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.Row;

public abstract class RowSkin extends HBox {

    //TODO-Johan Make all RowSkins into just one RowSkin
    public RowSkin (Row row) {
        setSpacing(10.0);
        row.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));
    }
}
