package sample;

import javafx.scene.layout.HBox;

public abstract class RowSkin extends HBox {

    public RowSkin (Class<? extends Row> Row) {
        setSpacing(10.0);
    }
}
