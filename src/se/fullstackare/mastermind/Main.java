package se.fullstackare.mastermind;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    //offsets defined
    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private Slider sliderOpacity;

    @FXML
    private Label paneSettingsLabel;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mastermind.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();

        System.out.println(controller.getPaneUpLabel().getText());
        primaryStage.setTitle("Hello World");
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        //grab
        root.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        //move
        root.setOnMouseDragged(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("mouse click detected! " + event.getSource().getClass());
                event.getSource();
            }
        });

        root.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("mouse click detected! " + mouseEvent.getSource().getClass().getName());
            }
        });

        //root.addEventFilter();


        /*
        root.addEventFilter( {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("mouse click detected! " + mouseEvent.getSource().getClass().getName());
            }
        });


        sliderOpacity.valueProperty().addListener(new ChangeListener() {

            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
                paneUpLabel.textProperty().setValue( String.valueOf((int) sliderOpacity.getValue()));

            }
        });
        */



        Scene scene = new Scene (root);
        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add(getClass().getResource("..\\..\\..\\CSS\\Sample.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setOpacity(0.85);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
        controller.setStage(primaryStage);


    }

}
