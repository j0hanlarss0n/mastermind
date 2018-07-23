package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class SelectorSphere {
    private Color color;

    private final SelectorSphereSkin skin;

    public SelectorSphere(Color color) {
        this.color = color;
        skin = new SelectorSphereSkin(this, color);
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
