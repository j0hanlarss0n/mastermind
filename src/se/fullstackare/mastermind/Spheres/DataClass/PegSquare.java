package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.PegSquareSkin;

public class PegSquare implements Skinnable {

    private final PegSquareSkin skin;

    private final Peg[][] pegs = new Peg[2][2];

    public PegSquare(Game game) {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                pegs[i][j] = new Peg(game, Color.GREY, 10);
            }
        }
        skin = new PegSquareSkin(this);
    }

    public Peg getPeg(int i, int j) {
        return pegs[i][j];
    }

    public Node getSkin() {
        return skin;
    }
}
