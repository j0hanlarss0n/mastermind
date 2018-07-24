package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;

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
