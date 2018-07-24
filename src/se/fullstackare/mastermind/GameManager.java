package se.fullstackare.mastermind;

import javafx.scene.layout.Pane;

public class GameManager {
    private Pane gameScene;
    private Game  game;

    public GameManager() {
        newGame();
    }

    public void newGame() {
        game = new Game(this);

        if (gameScene == null) {
            gameScene = new Pane();
            gameScene.setPrefSize(500, 750);
            gameScene.getChildren().addAll(game.getSkin());
        } else {
            gameScene.setPrefSize(500, 750);
            gameScene.getChildren().addAll(game.getSkin());
        }
    }

    public Game getGame() {
        return game;
    }

    public Pane getGameScene() {
        return gameScene;
    }
}
