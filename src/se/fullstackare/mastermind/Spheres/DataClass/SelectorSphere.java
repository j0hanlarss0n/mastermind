package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SelectorSphereSkin;

public class SelectorSphere extends Sphere implements Skinnable {
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
