package sample;

import javafx.scene.Node;

public class Row {

    private final RowSkin skin;
    private final ColoredSphere[] spheres = new ColoredSphere[4];
    private final ColoredSpherePlaceholder[] emptySpheres = new ColoredSpherePlaceholder[2];
    private final MarkerSphere marker;
    private final PegSquare pegs;

    public Row(Game game) {
        for(int i = 0; i < 4; i++) {
            spheres[i] = new ColoredSphere(game);
        }
        for(int i = 0; i < 2; i++) {
            emptySpheres[i] = new ColoredSpherePlaceholder();
        }
        marker = new MarkerSphere(game);
        pegs = new PegSquare(game);
        skin = new RowSkin(this);
    }


    public ColoredSphere getSphere(int i) {
        return spheres[i];
    }
    public ColoredSpherePlaceholder getEmptySphere(int i) {
        return emptySpheres[i];
    }
    public MarkerSphere getMarker() {
        return marker;
    }
    public PegSquare getPegSquare() {
        return pegs;
    }

    public Node getSkin() {
        return skin;
    }

}
