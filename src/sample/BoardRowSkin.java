package sample;

import javafx.scene.layout.HBox;

public class BoardRowSkin extends HBox {

    public BoardRowSkin(BoardRow boardRow) {
        getStyleClass().add("BoardRow");
        setSpacing(10.0);

        for (int i = 0; i < 4; i++) {
            getChildren().add(boardRow.getSphere(i).getSkin());
        }
        getChildren().add(boardRow.getEmptySphere(0).getSkin());
        getChildren().add(boardRow.getPegSquare().getSkin());
        getChildren().add(boardRow.getEmptySphere(1).getSkin());
        getChildren().add(boardRow.getMarker().getSkin());
    }

}
