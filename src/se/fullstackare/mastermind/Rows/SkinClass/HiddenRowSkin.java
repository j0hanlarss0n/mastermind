package se.fullstackare.mastermind.Rows.SkinClass;

import javafx.scene.layout.HBox;
import se.fullstackare.mastermind.Rows.DataClass.HiddenRow;

public class HiddenRowSkin extends RowSkin {

    public HiddenRowSkin(HiddenRow hiddenRow, String styleClass) {
        super(hiddenRow, styleClass);
        getStyleClass().add("HiddenRow");
    }
}
