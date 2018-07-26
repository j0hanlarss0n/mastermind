package se.fullstackare.mastermind;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameManager {
    private Pane gameScene;
    private Game  game;
    private Stage stage;
    public GameManager(Stage stage) {
        this.stage = stage;
        newGame();

        //TODO-Johan Add eventhandler select that clicks are on active row
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
