package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class SelectorSphere {
    private Color color;
    private Game game;
    private final SelectorSphereSkin skin;

    public SelectorSphere(Game game, Color color) {
        this.color = color;
        this.game = game;
        skin = new SelectorSphereSkin(this, color);
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
