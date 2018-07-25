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

    public Sphere(Game game) {
        this.game = game;
    }

    abstract public void pressed();

    public Color getColor() {
        return skin.getColor();
    }

    public void setColor(Color color) {
        skin.setColor(color);
    }

    public Node getSkin() {
        return skin;
    }
}