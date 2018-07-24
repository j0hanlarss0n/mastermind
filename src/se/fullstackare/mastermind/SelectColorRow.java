package se.fullstackare.mastermind;

import javafx.scene.Node;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class SelectColorRow {
    private final SelectColorRowSkin skin;
    private List<Skinnable> rowItems = new ArrayList<>();
    private final SelectorSphere[] spheres = new SelectorSphere[8];

    public SelectColorRow(Game game) {

        rowItems.add(new SelectorSphere(game, Color.WHITE));
        rowItems.add(new SelectorSphere(game, Color.DARKSEAGREEN));
        rowItems.add(new SelectorSphere(game, Color.GREEN));
        rowItems.add(new SelectorSphere(game, Color.YELLOW));
        rowItems.add(new SelectorSphere(game, Color.ORANGE));
        rowItems.add(new SelectorSphere(game, Color.PURPLE));
        rowItems.add(new SelectorSphere(game, Color.ROYALBLUE));
        rowItems.add(new SelectorSphere(game, Color.RED));
        skin = new SelectColorRowSkin(this);
    }

    public List<Skinnable> getSkinnableItems() {
        return rowItems;
    }

    public Node getSkin() {
        return skin;
    }
}
