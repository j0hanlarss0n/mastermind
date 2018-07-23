package sample;

import javafx.scene.layout.HBox;

public class RowSkin extends HBox {

    public RowSkin(Row row) {
        getStyleClass().add("Row");
        setSpacing(10.0);

        for (int i = 0; i < 4; i++) {
            getChildren().add(row.getSphere(i).getSkin());
        }
        getChildren().add(row.getEmptySphere().getSkin());

        getChildren().add(row.getPegSquare().getSkin());
    }

}
