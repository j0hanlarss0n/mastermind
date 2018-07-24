package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.HiddenRow;

public class HiddenRowSkin extends HBox {

    public HiddenRowSkin(HiddenRow hiddenRow) {
        getStyleClass().add("HiddenRow");
        setSpacing(10.0);

        hiddenRow.getSkinnableItems().forEach(item -> getChildren().add(item.getSkin()));
        /*
        for (int i = 0; i < 4; i++) {
            getChildren().add(hiddenRow.getSphere(i).getSkin());
        }
        */
    }

}
