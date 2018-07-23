package sample;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class ColoredSpherePlaceholderSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(20);

    public ColoredSpherePlaceholderSkin(final ColoredSpherePlaceholder coloredSpherePlaceholder) {
       getStyleClass().add("SpherePlaceholder");
       material.setDiffuseColor(Color.TRANSPARENT);
       material.setSpecularColor(Color.BLACK);
       sphere.setMaterial(material);
       sphere.setTranslateX(sphere.getRadius());
       sphere.setTranslateY(sphere.getRadius());
       getChildren().setAll(sphere);

       //setOnMousePressed((MouseEvent event) -> event.consume());

   }
}
