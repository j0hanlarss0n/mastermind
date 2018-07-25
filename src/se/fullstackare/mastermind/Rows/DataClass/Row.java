package se.fullstackare.mastermind.Rows.DataClass;

import javafx.scene.Node;
import se.fullstackare.mastermind.Game;
import se.fullstackare.mastermind.Rows.SkinClass.RowSkin;
import se.fullstackare.mastermind.Skinnable;

import java.util.ArrayList;
import java.util.List;

public abstract class Row implements Skinnable{

    protected Game game;

    protected List<Skinnable> rowItems = new ArrayList<>();

    protected RowSkin skin;

    public Row(Game game) {
        this.game = game;
    }

    public List<Skinnable> getSkinnableItems() {
        return rowItems;
    }

    public Node getSkin() {
        return skin;
    }
}
