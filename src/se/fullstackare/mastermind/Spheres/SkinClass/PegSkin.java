package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import se.fullstackare.mastermind.Spheres.DataClass.Peg;

public class PegSkin extends Pane {

    //TODO-Johan Make class extend SphereSkin

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(10);

    public PegSkin(final Peg peg) {
        getStyleClass().add("Peg");

        material.setDiffuseColor(Color.GREY);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());
        getChildren().setAll(sphere);
    }
}
