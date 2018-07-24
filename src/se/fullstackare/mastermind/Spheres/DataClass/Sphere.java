package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.SphereSkin;

public abstract class Sphere implements Skinnable {

    private Game game;
    private Class<? extends SphereSkin> skin;

    public Sphere(Game game) {
        this.game = game;
    }

    abstract public void pressed();
    abstract public Node getSkin();

}