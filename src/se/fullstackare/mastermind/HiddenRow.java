package se.fullstackare.mastermind;

import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public class HiddenRow {

    private final HiddenRowSkin skin;
    private final List<Skinnable> rowItems = new ArrayList<>();
    //private final ColoredSphere[] spheres = new ColoredSphere[4];

    public HiddenRow(Game game) {
        for(int i = 0; i < 4; i++) {
            rowItems.add(new ColoredSphere(game));

            //spheres[i] = new ColoredSphere(game);
            //spheres[i].setColor(Color.IVORY);

        }
        skin = new HiddenRowSkin(this);
    }

    public List<Skinnable> getSkinnableItems() {
        return rowItems;
    }

    //public ColoredSphere getSphere(int i) {
    //    return spheres[i];
    //}

    public Node getSkin() {
        return skin;
    }

}
