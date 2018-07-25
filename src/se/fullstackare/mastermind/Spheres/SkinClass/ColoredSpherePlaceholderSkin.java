package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;

public class ColoredSpherePlaceholderSkin extends SphereSkin {

    public ColoredSpherePlaceholderSkin(final ColoredSpherePlaceholder coloredSpherePlaceholder) {
        super(coloredSpherePlaceholder);
       getStyleClass().add("SpherePlaceholder");
       setColor(Color.TRANSPARENT);
   }
}
