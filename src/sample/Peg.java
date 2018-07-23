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

    private final PegSkin skin;

    private ReadOnlyObjectWrapper<State> state = new ReadOnlyObjectWrapper<>(State.TRANSPARENT);
    public ReadOnlyObjectProperty<State> stateProperty() {
        return state.getReadOnlyProperty();
    }
    public Peg() {

        skin = new PegSkin(this);
    }

    public Node getSkin() {
        return skin;
    }

}

