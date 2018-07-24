package sample;

import javafx.scene.Node;
import javafx.scene.layout.HBox;

public class BoardRowSkin extends HBox {

    public BoardRowSkin(BoardRow boardRow) {
        getStyleClass().add("BoardRow");
        setSpacing(10.0);

        boardRow.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));

        /*
        for (Skinnable skin : boardRow.getSkinnableItems()) {
            getChildren().add(skin.getSkin());
        }
        */
    }
}
