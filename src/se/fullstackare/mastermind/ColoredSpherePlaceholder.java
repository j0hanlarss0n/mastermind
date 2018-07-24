package se.fullstackare.mastermind;

import javafx.scene.Node;

public class ColoredSpherePlaceholder implements Skinnable{

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
