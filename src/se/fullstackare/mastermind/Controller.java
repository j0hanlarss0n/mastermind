package se.fullstackare.mastermind;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Stage myStage;

    @FXML
    private ImageView btnUp, btnDown, btnSettings, btnPower;

    @FXML
    private AnchorPane paneDown, paneSettings;

    @FXML
    private Pane paneUp;

    @FXML
    private ChoiceBox<String> choiceBoxDifficulty;

    @FXML
    private Slider sliderOpacity;

    @FXML
    private CheckBox checkBoxUniqueColors;

    private GameManager manager = new GameManager(myStage, "none", false);

    @FXML
    private void handleButtonAction(MouseEvent event) {
        if ( event.getTarget() == btnUp) {
            System.out.println("mouse click detected! " + event.getSource().getClass());
            manager.deleteGame();
            paneUp.setVisible(true);
            manager = new GameManager(myStage, choiceBoxDifficulty.getValue(), checkBoxUniqueColors.isSelected());
            paneUp.getChildren().addAll(manager.getGameScene());
            paneDown.setVisible(false);
            paneSettings.setVisible(false);
        } else if ( event.getTarget() == btnDown) {
            System.out.println("mouse click detected! " + event.getSource().getClass());
            manager.deleteGame();
            paneUp.getChildren().remove(manager.getGameScene());
            paneUp.setVisible(false);
            paneDown.setVisible(true);
            paneSettings.setVisible(false);

        } else if ( event.getTarget() == btnSettings) {
            System.out.println("mouse click detected! " + event.getSource().getClass());
            manager.deleteGame();
            paneUp.getChildren().removeAll(manager.getGameScene());
            paneUp.setVisible(false);
            paneDown.setVisible(false);
            paneSettings.setVisible(true);
        } else if ( event.getTarget() == btnPower) {
            System.out.println("mouse click detected! " + event.getSource().getClass());
            if (!(paneUp.isVisible() || paneDown.isVisible() || paneSettings.isVisible())) {
                Platform.exit();
            } else {
                manager.deleteGame();
                paneUp.setVisible(false);
                paneDown.setVisible(false);
                paneSettings.setVisible(false);
            }
        }

    }

    public void setStage(Stage stage) {
        myStage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> availableChoices = FXCollections.observableArrayList("Normal", "Show correct", "Show all");
        choiceBoxDifficulty.setItems(availableChoices);
        choiceBoxDifficulty.getSelectionModel().select("Normal");

        sliderOpacity.setValue(0.85);
        sliderOpacity.valueProperty().addListener((observable, oldValue, newValue) -> myStage.setOpacity(newValue.doubleValue()));

        sliderOpacity.addEventFilter(MouseEvent.ANY, (MouseEvent event) -> {
            if (!(event.getEventType().getName() == "MOUSE_MOVED" || event.getEventType().getName() == "MOUSE_DRAGGED")) {
                System.out.println(event.getEventType().getName());
            }
        });


    }
}