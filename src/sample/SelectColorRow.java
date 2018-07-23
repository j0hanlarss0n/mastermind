package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class SelectColorRow {
    private final SelectColorRowSkin skin;
    private final SelectorSphere[] spheres = new SelectorSphere[8];

    public SelectColorRow(Game game) {

        spheres[0] = new SelectorSphere(game, Color.WHITE);
        spheres[1] = new SelectorSphere(game, Color.DARKSEAGREEN);
        spheres[2] = new SelectorSphere(game, Color.GREEN);
        spheres[3] = new SelectorSphere(game, Color.YELLOW);
        spheres[4] = new SelectorSphere(game, Color.ORANGE);
        spheres[5] = new SelectorSphere(game, Color.PURPLE);
        spheres[6] = new SelectorSphere(game, Color.ROYALBLUE);
        spheres[7] = new SelectorSphere(game, Color.RED);
        skin = new SelectColorRowSkin(this);
    }

    public SelectorSphere getSphere(int i) {
        return spheres[i];
    }

    public Node getSkin() {
        return skin;
    }
}
