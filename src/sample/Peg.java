package sample;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.Node;
import javafx.scene.shape.Sphere;

public class Peg {
    enum State {
        TRANSPARENT,
        GREY,
        WHITE,
        BLACK
    }

    private Game game;
    private final PegSkin skin;

    private ReadOnlyObjectWrapper<State> state = new ReadOnlyObjectWrapper<>(State.TRANSPARENT);
    public ReadOnlyObjectProperty<State> stateProperty() {
        return state.getReadOnlyProperty();
    }
    public Peg(Game game) {
        skin = new PegSkin(this);
        this.game = game;
    }

    public Node getSkin() {
        return skin;
    }

}

