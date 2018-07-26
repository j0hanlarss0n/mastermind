package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Spheres.DataClass.HiddenSphere;

public class HiddenRow extends Row{

    public HiddenRow(Game game) {
        super(game);
        for(int i = 0; i < 4; i++) {
            rowItems.add(new HiddenSphere(game, Color.ANTIQUEWHITE, 20));
        }
        skin = new RowSkin(this, "HiddenRow");
    }
}
