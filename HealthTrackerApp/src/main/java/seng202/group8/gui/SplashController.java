package seng202.group8.gui;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import seng202.group8.gui.user_info_gui.GetUserInfoController;
import seng202.group8.user.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashController implements Initializable {

    @FXML
    private StackPane parent;

    private User user;
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        new splashScreen().start();
        FadeTransition fadeIn = new FadeTransition(javafx.util.Duration.seconds(1.5), parent);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(1.5), parent);
        fadeIn.setFromValue(1);
        fadeIn.setToValue(0);
        fadeIn.setCycleCount(1);

        fadeIn.play();


        fadeIn.setOnFinished((e) -> {
            fadeOut.play();
        });
        //1280
        //720

        fadeOut.setOnFinished((e) -> {
            try {
                // This is where we call the database and try to retrieve the user
                if (user != null) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFrame.fxml"));
                    Parent root = loader.load();
                    GUIController guiController = loader.getController();
                    guiController.setStage(stage);
                    guiController.setUser(user);
                    stage.setTitle("WINded");
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    guiController.setToHome();
                    stage.show();
                } else {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("user_info_gui/GetUserInfo.fxml"));
                    Parent root = loader.load();
                    GetUserInfoController getUserInfoController = loader.getController();
                    getUserInfoController.setStage(stage);
                    stage.setTitle("WINded");
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            } catch (IOException ex) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

//    class splashScreen extends Thread {
//
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(3000);
//
//                Platform.runLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        Parent root = null;
//                        try {
//                            root = FXMLLoader.load(getClass().getResource("mainFrame.fxml"));
//                         mainFrame   System.out.println("Done");
//                        } catch (IOException ex) {
//                            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                        Scene scene = new Scene(root);
//                        Stage stage = new Stage();
//                        stage.setScene(scene);
//                        stage.setTitle("WINded");
//                        stage.show();
//                        parent.getScene().getWindow().hide();
//
//                    }
//                });
//            } catch (InterruptedException ex) {
//                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
