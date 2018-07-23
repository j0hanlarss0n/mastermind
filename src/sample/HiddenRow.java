package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class HiddenRow {

    private final HiddenRowSkin skin;
    private final ColoredSphere[] spheres = new ColoredSphere[4];

    public HiddenRow(Game game) {
        for(int i = 0; i < 4; i++) {
            spheres[i] = new ColoredSphere(game);
            spheres[i].setColor(Color.IVORY);

        }
        skin = new HiddenRowSkin(this);
    }


    public ColoredSphere getSphere(int i) {
        return spheres[i];
    }

    public Node getSkin() {
        return skin;
    }

}
