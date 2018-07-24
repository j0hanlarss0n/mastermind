package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class ColoredSphere implements Skinnable{

    private Color color;

    private final ColoredSphereSkin skin;

    public ColoredSphere(Game game) {
        skin = new ColoredSphereSkin(this);
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        skin.setColor(color);
    }

    public Node getSkin() {
        return skin;
    }
}
