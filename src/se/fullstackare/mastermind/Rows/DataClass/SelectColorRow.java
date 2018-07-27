package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.SelectorSphere;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;


public class SelectColorRow extends Row{

    public SelectColorRow(Game game) {
        super(game);

        rowItems.add(new SelectorSphere(game, Color.WHITE));
        rowItems.add(new SelectorSphere(game, Color.DARKSEAGREEN));
        rowItems.add(new SelectorSphere(game, Color.GREEN));
        rowItems.add(new SelectorSphere(game, Color.YELLOW));
        rowItems.add(new SelectorSphere(game, Color.ORANGE));
        rowItems.add(new SelectorSphere(game, Color.PURPLE));
        rowItems.add(new SelectorSphere(game, Color.ROYALBLUE));
        rowItems.add(new SelectorSphere(game, Color.RED));

        skin = new RowSkin(this, "SelectColorRow");

    }

}
