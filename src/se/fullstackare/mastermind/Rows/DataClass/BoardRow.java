package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.*;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;
import se.fullstackare.mastermind.Spheres.DataClass.MarkerSphere;
import se.fullstackare.mastermind.Spheres.DataClass.PegSquare;

public class BoardRow extends Row implements Skinnable {

    public BoardRow(Game game) {
        super(game);
        for(int i = 0; i < 4; i++) {
            rowItems.add(new ColoredSphere(game, Color.GREY, 20));
        }

        rowItems.add(new ColoredSpherePlaceholder(game));
        rowItems.add(new PegSquare(game));
        rowItems.add(new ColoredSpherePlaceholder(game));
        rowItems.add(new MarkerSphere(game));

        skin = new RowSkin(this, "BoardRow");
    }
}
