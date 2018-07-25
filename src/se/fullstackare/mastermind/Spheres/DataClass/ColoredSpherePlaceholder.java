package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.ColoredSpherePlaceholderSkin;

public class ColoredSpherePlaceholder extends Sphere implements Skinnable {

    public ColoredSpherePlaceholder(Game game) {
        super(game);
        skin = new ColoredSpherePlaceholderSkin(this);
    }

    public void pressed() {
        System.out.println("Color in pressed: ");
    }

    public Node getSkin() {
        return skin;
    }
}
