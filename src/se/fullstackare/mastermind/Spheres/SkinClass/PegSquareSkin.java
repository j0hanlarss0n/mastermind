package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.layout.GridPane;
import se.fullstackare.mastermind.Spheres.DataClass.PegSquare;

public class PegSquareSkin extends GridPane {


    public PegSquareSkin(PegSquare pegSquare) {
        getStyleClass().add("PegSquare");

        gridLinesVisibleProperty();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add(pegSquare.getPeg(i, j).getSkin(), i, j);
                //setHgrow(pegSquare.getPeg(i, j), Priority.ALWAYS);
                //setVgrow(pegSquare.getPeg(i, j), Priority.ALWAYS);
            }
        }
    }
}
