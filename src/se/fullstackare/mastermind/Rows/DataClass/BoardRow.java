package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.*;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Spheres.DataClass.*;

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

    public void activateMarker() {
        ((Sphere) rowItems.get(rowItems.size() - 1)).setColor(Color.GOLD);
    }

    public void deactivateMarker() {
        ((Sphere) rowItems.get(rowItems.size() - 1)).setColor(Color.TRANSPARENT);
    }

    public void activate() {
        rowItems.forEach(item -> {
            if (item instanceof ColoredSphere) {
                item.getSkin().getStyleClass().add("Selected");
            }
        });
        activateEventListener();
        activateMarker();
    }

    public void deactivate() {
        rowItems.forEach(item -> item.getSkin().getStyleClass().removeIf(style -> style.equals("Selected")));
        disableEventListener();
        deactivateMarker();
    }
}
