package seng202.group8.gui;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import seng202.group8.user.User;


public class GUI extends Application {

    private User user;

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/views/Splash.fxml"));
        Parent root = loader.load();
        SplashController splashController = loader.getController();
        splashController.setStage(stage);
        stage.setTitle("WINded");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        splashController.setHostServices(getHostServices());
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}




