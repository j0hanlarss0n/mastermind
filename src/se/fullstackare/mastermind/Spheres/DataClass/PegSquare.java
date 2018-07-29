package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.PegSquareSkin;

import java.util.List;
import java.util.stream.Collectors;

public class PegSquare implements Skinnable {

    private final PegSquareSkin skin;

    private final Peg[][] pegs = new Peg[2][2];

    private Game game;

    public PegSquare(Game game) {
        this.game = game;
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

    public void setScore(List<Color> score) {
        int intScore = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                pegs[j][i].setColor(score.get(intScore));
                intScore++;
            }
        }
        List<Color> matches = score.stream().filter(color -> Color.NAVY.equals(color)).collect(Collectors.toList());
        if (matches.size() == 4) {
            game.setGameWon(true);
            System.out.println("Game WON!");
        }

    }

    public Node getSkin() {
        return skin;
    }
}
