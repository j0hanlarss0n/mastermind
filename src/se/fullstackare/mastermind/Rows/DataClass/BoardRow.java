package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.Node;
import se.fullstackare.mastermind.*;
import se.fullstackare.mastermind.Rows.SkinClass.BoardRowSkin;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;
import se.fullstackare.mastermind.Spheres.DataClass.MarkerSphere;
import se.fullstackare.mastermind.Spheres.DataClass.PegSquare;

import java.util.ArrayList;
import java.util.List;

public class BoardRow extends Row implements Skinnable {

    public BoardRow(Game game) {
        super(game);
        for(int i = 0; i < 4; i++) {
            rowItems.add(new ColoredSphere(game));
        }

        rowItems.add(new ColoredSpherePlaceholder());
        rowItems.add(new PegSquare(game));
        rowItems.add(new ColoredSpherePlaceholder());
        rowItems.add(new MarkerSphere(game));

        skin = new BoardRowSkin(this);
    }
}