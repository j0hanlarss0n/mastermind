package sample;

import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public class BoardRow implements Skinnable{

    private final BoardRowSkin skin;
    private final List<Class<? extends Skinnable>> rowItems = new ArrayList<>();


    private final ColoredSphere[] spheres = new ColoredSphere[4];
    private final ColoredSpherePlaceholder[] emptySpheres = new ColoredSpherePlaceholder[2];
    private final MarkerSphere marker;
    private final PegSquare pegs;

    public BoardRow(Game game) {
        /*
        for(int i = 0; i < 4; i++) {
            ColoredSphere cs = new ColoredSphere(game);
            rowItems.add(cs);
        }
        */


        for(int i = 0; i < 4; i++) {
            spheres[i] = new ColoredSphere(game);
        }
        for(int i = 0; i < 2; i++) {
            emptySpheres[i] = new ColoredSpherePlaceholder();
        }
        marker = new MarkerSphere(game);
        pegs = new PegSquare(game);

        skin = new BoardRowSkin(this);
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
