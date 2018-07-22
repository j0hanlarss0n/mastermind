package sample;

import javafx.scene.Node;

public class ColoredSphere {
    enum State {
        NONE,
        RED,
        GREEN,
        YELLOW,
        ORANGE,
        PINK,
        PURPLE,
        WHITE,
        BLACK
    }

    private final ColoredSphereSkin skin;

    public ColoredSphere() {
        skin = new ColoredSphereSkin(this);
    }

    public void pressed(String color) {

    }

    public Node getSkin() {
        return skin;
    }
}
