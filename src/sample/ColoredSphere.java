package sample;

import javafx.scene.Node;
import javafx.scene.paint.Color;

public class ColoredSphere {




    enum ColorState {
        TRANSPARENT,
        GREY,
        RED,
        GREEN,
        YELLOW,
        ORANGE,
        PINK,
        PURPLE,
        WHITE,
        BLACK
    }

    private Color color;

    private Game game;
    private ColorState colorState;

    private final ColoredSphereSkin skin;

    public ColoredSphere(Game game) {
        skin = new ColoredSphereSkin(this);
        this.game = game;
    }

    public void pressed(String color) {
        System.out.println("Color in pressed: " + color);
    }

    public ColorState getColorState() {
        return colorState;
    }

    public void setColorState(ColorState colorState) {
        this.colorState = colorState;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        skin.setColor(color);
    }

    public Node getSkin() {
        return skin;
    }
}
