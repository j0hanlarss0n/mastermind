package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class HiddenSphere extends Sphere implements Skinnable {

    public HiddenSphere(Game game, Color color, int radius) {
        super(game, color, radius);
        skin = new SphereSkin(this, color, "ColoredSphere");
        skin.ignoreDragging();
    }

    public void pressed() {
        System.out.println("Nope");

    }
}
