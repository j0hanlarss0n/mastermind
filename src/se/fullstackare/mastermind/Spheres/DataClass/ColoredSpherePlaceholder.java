package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.ColoredSpherePlaceholderSkin;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class ColoredSpherePlaceholder extends Sphere implements Skinnable {

    public ColoredSpherePlaceholder(Game game) {
        super(game);
        skin = new SphereSkin(this, Color.TRANSPARENT, "PlaceholderSphere");
    }

    public void pressed() {
        System.out.println("Color in pressed: ");
    }

    public Node getSkin() {
        return skin;
    }
}
