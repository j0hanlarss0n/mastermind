package se.fullstackare.mastermind;

import javafx.scene.layout.VBox;

public class BoardSkin extends VBox {

    public BoardSkin(Board board) {
        getStyleClass().add("Board");
        setSpacing(10.0);
        board.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));
        setTranslateX(50);
        setTranslateY(30);
    }
}
