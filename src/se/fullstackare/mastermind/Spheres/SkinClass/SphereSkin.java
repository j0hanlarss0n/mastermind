package se.fullstackare.mastermind.Spheres.SkinClass;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import se.fullstackare.mastermind.Spheres.DataClass.Sphere;

public class SphereSkin extends Pane {


    //TODO-Johan Make all SphereSkins into just one, this.
    protected PhongMaterial material = new PhongMaterial();
    protected javafx.scene.shape.Sphere sphere;
    protected Color color;
    protected Sphere mySphere;


    public SphereSkin (final Sphere mySphere) {
        getStyleClass().add("DefaultSphere");
        this.mySphere = mySphere;
        sphere = new javafx.scene.shape.Sphere();
        sphere.setRadius(mySphere.getRadius());
        sphere.setTranslateX(sphere.getRadius());
        sphere.setTranslateY(sphere.getRadius());

        setColor(Color.GREY);

        getChildren().setAll(sphere);

        setOnMousePressed((MouseEvent event) -> System.out.println("Sphere is ignoring clicks"));
    }

    public SphereSkin (final Sphere mySphere, Color color) {
        this(mySphere);
        setColor(color);
    }

    public SphereSkin (final Sphere mySphere, String styleClass) {
        this(mySphere);
        getStyleClass().add(styleClass);
    }

    public SphereSkin (final Sphere mySphere, Color color, String styleClass) {
        this(mySphere, color);
        getStyleClass().add(styleClass);
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

    public void addEventHandler(){
        setOnMousePressed((MouseEvent event) -> mySphere.pressed());
    }

    public void removeEventHandler(){
        setOnMousePressed((MouseEvent event) -> System.out.println("Sphere is ignoring clicks"));
    }

}
