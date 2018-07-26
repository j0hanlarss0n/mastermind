
package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import se.fullstackare.mastermind.Spheres.DataClass.MarkerSphere;

public class MarkerSphereSkin extends SphereSkin {

    public MarkerSphereSkin(final MarkerSphere markerSphere, Color color, String styleClass) {
        super(markerSphere, Color.GOLD, styleClass);
    }
}
