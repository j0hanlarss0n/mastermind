
package sample;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class MarkerSphereSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(20);

    public MarkerSphereSkin(final MarkerSphere markerSphere) {
        getStyleClass().add("MarkerSphere");
        material.setDiffuseColor(Color.GOLD);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());
        getChildren().setAll(sphere);

        setOnMousePressed((MouseEvent event) -> markerSphere.pressed("red"));

    }
}
