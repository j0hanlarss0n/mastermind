package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.input.MouseEvent;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSphere;

public class ColoredSphereSkin extends Pane {

    public PhongMaterial material = new PhongMaterial();
    private final Sphere sphere = new Sphere(20);

    public ColoredSphereSkin(final ColoredSphere coloredSphere) {
        getStyleClass().add("Sphere");
        material.setDiffuseColor(Color.GREY);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());
        getChildren().setAll(sphere);
        //this.setMaxWidth(Double.MAX_VALUE);
        //this.setMaxHeight(Double.MAX_VALUE);


        setOnMousePressed((MouseEvent event) -> coloredSphere.pressed("red"));

    }

    public void setColor(Color color) {
        Material mat = sphere.getMaterial();
        PhongMaterial PhongMat = (PhongMaterial)mat;
        PhongMat.setDiffuseColor(color);
        PhongMat.setSpecularColor(Color.BLACK);
        sphere.setMaterial(PhongMat);
    }


}
