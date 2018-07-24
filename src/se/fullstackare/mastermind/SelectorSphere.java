package se.fullstackare.mastermind;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class SelectorSphere extends Sphere implements Skinnable{
    private Color color;
    private final SelectorSphereSkin skin;

    public SelectorSphere(Game game, Color color) {
        super(game);
        this.color = color;
        skin = new SelectorSphereSkin(this, color);
    }

    public void pressed() {
        System.out.println("Color in pressed: " + color);
    }

    public Node getSkin() {
        return skin;
    }
}
