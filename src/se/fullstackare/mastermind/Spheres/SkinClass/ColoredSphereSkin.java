package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.input.MouseEvent;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;

public class ColoredSphereSkin extends SphereSkin {

    public ColoredSphereSkin(final ColoredSphere coloredSphere) {
        super(coloredSphere);
        getStyleClass().add("Sphere");
        setColor(Color.GREY);
    }

}
