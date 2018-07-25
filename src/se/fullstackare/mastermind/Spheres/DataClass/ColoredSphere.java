package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.ColoredSphereSkin;

public class ColoredSphere extends Sphere implements Skinnable {

    public ColoredSphere(Game game) {
        super(game);
        skin = new ColoredSphereSkin(this);
    }

    public void pressed() {
        System.out.println("Color in pressed: " + getColor().toString());
    }
}
