/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import views.StartViewController;

public class bangMain extends Application {
    private Stage primaryStage;
    
    private StartViewController startViewController;
    
    public void showStartView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(bangMain.class.getResource("/views/StartView.fxml"));
            AnchorPane anchorPane = (AnchorPane) loader.load();
            this.primaryStage.setScene(new Scene(anchorPane));
            this.primaryStage.show();
            this.primaryStage.centerOnScreen();
            
            this.startViewController = loader.getController();
            this.startViewController.setMain(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Bang! The Dice Game");
        this.primaryStage.getIcons().add(new Image(bangMain.class.getResourceAsStream("GameLogo.png")));
        
        showStartView();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
