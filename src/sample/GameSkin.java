package sample;

import javafx.scene.layout.Pane;

public class GameSkin extends Pane {
    public GameSkin(Game game) {
        getChildren().addAll(game.getBoard().getSkin());
    }
}
