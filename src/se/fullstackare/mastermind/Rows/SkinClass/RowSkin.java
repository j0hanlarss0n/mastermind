package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.Row;

public abstract class RowSkin extends HBox {

    public RowSkin (Class<? extends Row> Row) {
        setSpacing(10.0);
    }
}
