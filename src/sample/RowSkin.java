package sample;

import javafx.scene.layout.VBox;

public class RowSkin extends VBox {

    public RowSkin(Row row) {

        getStyleClass().add("Row");

        for (int i = 0; i < 3; i++) {
            getChildren().add(row.getSphere(i).getSkin());
        }

        getChildren().add(row.getPegSquare().getSkin());
    }
}
