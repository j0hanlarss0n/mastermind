package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class ColoredSphere extends Sphere implements Skinnable {

    public ColoredSphere(Game game, Color color, int radius) {
        super(game, color, radius);
        skin = new SphereSkin(this, Color.GREY, "ColoredSphere");
    }

    public void pressed() {
        System.out.println("Changing color");
        setColor(game.getSelectedColor());
    }
}
