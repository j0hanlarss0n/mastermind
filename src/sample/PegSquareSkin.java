package sample;

import javafx.scene.layout.GridPane;

public class PegSquareSkin extends GridPane {


    public PegSquareSkin(PegSquare pegSquare) {
        getStyleClass().add("PegSquare");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add(pegSquare.getPeg(i, j).getSkin(), i, j);
            }
        }
    }
}
