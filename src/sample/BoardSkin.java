package sample;

import javafx.scene.layout.VBox;

public class BoardSkin extends VBox {

    public BoardSkin(Board board) {
        getStyleClass().add("Board");
        setSpacing(10.0);

        getChildren().add(board.getHiddenRow().getSkin());
        for (int i = 0; i < 10; i++) {
            getChildren().add(board.getRow(i).getSkin());
        }
        getChildren().add(board.getEmptyRow().getSkin());
        getChildren().add(board.getSelectRow().getSkin());

        setTranslateX(50);
        setTranslateY(40);
    }
}
