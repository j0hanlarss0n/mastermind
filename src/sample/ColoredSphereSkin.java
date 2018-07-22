package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.input.MouseEvent;

public class ColoredSphereSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(10);

    public ColoredSphereSkin(final ColoredSphere coloredSphere) {
        getStyleClass().add("sphere");

        material.setDiffuseColor(Color.WHITE);
        material.setSpecularColor(Color.RED);
        sphere.setMaterial(material);
        getChildren().setAll(sphere);


        setOnMousePressed((MouseEvent event) -> coloredSphere.pressed("red"));

    }


}
