package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class SelectorSphere extends Sphere implements Skinnable {

    public SelectorSphere(Game game, Color color) {
        super(game);
        this.color = color;
        skin = new SphereSkin(this, color, "SelectorSphere");
    }
    public void pressed() {
        System.out.println("Color in pressed: " + getColor() + ". Sphere's colorVar is: " + color);
        game.setSelectedColor(color);
    }
}
