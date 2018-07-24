package sample;

import javafx.scene.Node;

public abstract class Sphere implements Skinnable {

    private Game game;
    private Class<? extends SphereSkin> skin;

    public Sphere(Game game) {
        this.game = game;
    }

    abstract public void pressed();
    abstract public Node getSkin();

}