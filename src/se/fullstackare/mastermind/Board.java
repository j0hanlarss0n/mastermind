package se.fullstackare.mastermind;

import javafx.scene.Node;
import se.fullstackare.mastermind.Rows.DataClass.BoardRow;
import se.fullstackare.mastermind.Rows.DataClass.HiddenRow;
import se.fullstackare.mastermind.Rows.DataClass.SelectColorRow;
import se.fullstackare.mastermind.Spheres.DataClass.ColoredSpherePlaceholder;

import java.util.ArrayList;
import java.util.List;

public class Board implements Skinnable{

    protected List<Skinnable> rowItems = new ArrayList<>();

    private final BoardSkin skin;

    public Board(Game game) {

        rowItems.add(new HiddenRow(game));
        rowItems.add(new ColoredSpherePlaceholder(game));
        for (int i = 0; i < 10; i++) {
            rowItems.add(new BoardRow(game));
            if (i == 9) {
                game.setCurrentRow((BoardRow) rowItems.get(rowItems.size() - 1));
            }
        }
        rowItems.add(new ColoredSpherePlaceholder(game));
        rowItems.add(new SelectColorRow(game));

        skin = new BoardSkin(this);
    }

    public List<Skinnable> getSkinnableItems() {
        return rowItems;
    }

    public Node getSkin() {
        return skin;
    }
}
