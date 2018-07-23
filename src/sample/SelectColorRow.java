package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class SelectColorRow {
    private final SelectColorRowSkin skin;
    private final SelectorSphere[] spheres = new SelectorSphere[8];

    public SelectColorRow() {

        spheres[0] = new SelectorSphere(Color.WHITE);
        spheres[1] = new SelectorSphere(Color.BLACK);
        spheres[2] = new SelectorSphere(Color.GREEN);
        spheres[3] = new SelectorSphere(Color.YELLOW);
        spheres[4] = new SelectorSphere(Color.ORANGE);
        spheres[5] = new SelectorSphere(Color.PURPLE);
        spheres[6] = new SelectorSphere(Color.PINK);
        spheres[7] = new SelectorSphere(Color.RED);
        skin = new SelectColorRowSkin(this);
    }

    public SelectorSphere getSphere(int i) {
        return spheres[i];
    }

    public Node getSkin() {
        return skin;
    }
}
