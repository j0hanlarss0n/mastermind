package sample;

import javafx.scene.Node;

public class PegSquare {

    private final PegSquareSkin skin;

    private final Peg[][] pegs = new Peg[2][2];

    public PegSquare(Game game) {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                pegs[i][j] = new Peg(game);
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
