package se.fullstackare.mastermind.Spheres.DataClass;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Skinnable;
import se.fullstackare.mastermind.Spheres.SkinClass.PegSkin;

public class Peg implements Skinnable {

    //TODO-Johan Make class extend Sphere
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

