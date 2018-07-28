package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public class HiddenSphere extends Sphere implements Skinnable {

    private Color hiddenColor;
    public HiddenSphere(Game game, Color color, Color hiddenColor, int radius) {
        super(game, color, radius);
        this.hiddenColor = hiddenColor;
        skin = new SphereSkin(this, hiddenColor, "ColoredSphere");
        skin.ignoreDragging();
    }

    //TODO-Johan add function that sets skin color to hiddenCOlor when checkbox is toggled
    public void pressed() {
        System.out.println("Nope");

    }
}
