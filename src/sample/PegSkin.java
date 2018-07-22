package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class PegSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(50);

    public PegSkin(final Peg peg) {
        getStyleClass().add("peg");

        material.setDiffuseColor(Color.WHITE);
        material.setSpecularColor(Color.BLACK);
        peg.setMaterial(material);
        getChildren().setAll(peg);
    }
}
