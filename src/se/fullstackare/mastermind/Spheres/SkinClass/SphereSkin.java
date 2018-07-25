package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import se.fullstackare.mastermind.Spheres.DataClass.Sphere;

public abstract class SphereSkin extends Pane {

    protected PhongMaterial material = new PhongMaterial();
    protected final javafx.scene.shape.Sphere sphere = new javafx.scene.shape.Sphere(20);
    protected Color color;

    public SphereSkin (final Sphere mySphere) {
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());
        getChildren().setAll(sphere);

        setOnMousePressed((MouseEvent event) -> mySphere.pressed());
    }

    public void setColor(Color color) {
        material.setDiffuseColor(color);
        material.setSpecularColor(Color.BLACK);
        sphere.setMaterial(material);
        this.color = color;
    }

    public Color getColor() {
        PhongMaterial mat = (PhongMaterial) sphere.getMaterial();
        System.out.println("Specular color is: " + mat.getSpecularColor() + ". Skins colorVar is: " + color);
        return color;
    }

}
