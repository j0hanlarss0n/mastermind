package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.ColoredSpherePlaceholderSkin;

public class ColoredSpherePlaceholder implements Skinnable {

    private final ColoredSpherePlaceholderSkin skin;

    public ColoredSpherePlaceholder() {
        skin = new ColoredSpherePlaceholderSkin(this);
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
