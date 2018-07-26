package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import se.fullstackare.mastermind.Spheres.DataClass.Peg;

public class PegSkin extends SphereSkin {

    //TODO-Johan Make class extend SphereSkin

    public PegSkin(final Peg peg, Color color, String styleClass) {
        super(peg, color, styleClass);
    }
}
