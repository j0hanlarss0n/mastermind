package se.fullstackare.mastermind;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameManager {
    private Pane gameScene;
    private Game  game;
    private Stage stage;
    public GameManager(Stage stage, String difficulty, boolean uniqueColors) {
        this.stage = stage;
        newGame(difficulty, uniqueColors);
    }

    public void newGame(String difficulty, boolean uniqueColors) {
        game = new Game(this, difficulty, uniqueColors);

        if (gameScene == null) {
            gameScene = new Pane();
            gameScene.setPrefSize(500, 750);
            gameScene.getChildren().addAll(game.getSkin());
        } else {
            gameScene.setPrefSize(500, 750);
            gameScene.getChildren().addAll(game.getSkin());
        }
    }

    public void deleteGame() {
        gameScene.getChildren().clear();
    }

    public Game getGame() {
        return game;
    }

    public Pane getGameScene() {
        return gameScene;
    }


}
