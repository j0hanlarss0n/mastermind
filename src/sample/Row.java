package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class Row {

    private final RowSkin skin;
    private final ColoredSphere[] spheres = new ColoredSphere[4];
    private final ColoredSpherePlaceholder emptySphere = new ColoredSpherePlaceholder();
    private final PegSquare pegs = new PegSquare();

    public Row() {
        for(int i = 0; i < 4; i++) {
            spheres[i] = new ColoredSphere();
        }
        skin = new RowSkin(this);
    }


    public ColoredSphere getSphere(int i) {
        return spheres[i];
    }
    public ColoredSpherePlaceholder getEmptySphere() {
        return emptySphere;
    }
    public PegSquare getPegSquare() {
        return pegs;
    }

    public Node getSkin() {
        return skin;
    }

}
