package se.fullstackare.mastermind;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
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
        /*
        gameScene.visibleProperty().addListener((final ObservableValue<? extends Boolean> observableValue, final Boolean aBoolean, final Boolean aBoolean2) -> {
                System.out.println("####");
        });
        */
    }

    public void deleteGame() {
        gameScene.getChildren().clear();
    }

    /*
    ChangeListener<Boolean> visibilityListener = new ChangeListener<Boolean>() {

        @Override
        public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldValue, Boolean newValue) {
            System.out.println("####");
        }
    };
    */

    public Game getGame() {
        return game;
    }

    public Pane getGameScene() {
        return gameScene;
    }


}
