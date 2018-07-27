package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public abstract class Sphere implements Skinnable {

    protected Game game;

    protected SphereSkin skin;

    protected Color color;

    protected int radius = 20;

    public Sphere(Game game) {
        this.game = game;
    }
    public Sphere(Game game, Color color) {
        this(game);
        this.color = color;
    }
    public Sphere(Game game, Color color, int radius) {
        this(game, color);
        this.setRadius(radius);

    }

    abstract public void pressed();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        skin.setColor(color);
    }

    public void addSelectedStyle() {
        getSkin().getStyleClass().add("Selected");
    }

    public Node getSkin() {
        return skin;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}