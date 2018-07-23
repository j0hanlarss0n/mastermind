package sample;

import javafx.scene.layout.HBox;

public class SelectColorRowSkin extends HBox {

    public SelectColorRowSkin(SelectColorRow selectColorRow) {
        getStyleClass().add("SelectColorRow");
        setSpacing(10.0);
        for (int i = 0; i < 8; i++) {
            getChildren().add(selectColorRow.getSphere(i).getSkin());
        }
    }
}
