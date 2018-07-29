package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class ColoredSphere extends Sphere implements Skinnable {

    public ColoredSphere(Game game, Color color, int radius) {
        super(game, color, radius);
        skin = new SphereSkin(this, Color.GREY, "ColoredSphere");
        skin.ignoreDragging();
    }

    public void pressed() {
        if (game.getSelectedColor() != null) {
            if (game.getSelectedColor() == skin.getColor()) {
                System.out.println("removing color color");
                setColor(Color.GREY);
            } else {
                System.out.println("Changing color");
                setColor(game.getSelectedColor());
            }
        } else {
            System.out.println("Color is null");
        }
    }
}
