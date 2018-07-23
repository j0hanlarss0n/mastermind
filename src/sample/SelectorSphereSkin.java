package sample;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class SelectorSphereSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(20);

    public SelectorSphereSkin(final SelectorSphere selectorSphere, Color color) {
        getStyleClass().add("SelectorSphere");
        material.setDiffuseColor(color);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());
        getChildren().setAll(sphere);

        setOnMousePressed((MouseEvent event) -> selectorSphere.pressed("red"));

    }
}
