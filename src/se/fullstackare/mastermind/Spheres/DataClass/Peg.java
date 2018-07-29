package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class Peg extends Sphere implements Skinnable {

    public Peg(Game game, Color color, int radius) {
        super(game, color, radius);
        skin = new SphereSkin(this, color,"Peg");
        skin.ignoreDragging();
        this.game = game;
    }

    public void pressed() {

    }

    public Node getSkin() {
        return skin;
    }

}

