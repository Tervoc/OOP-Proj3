package views;

import game.bangMain;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class StartViewController {
    private bangMain main;
    
    @FXML 
    private AnchorPane root;
    @FXML
    private Pane gameSetup_Pane;
    
    @FXML
    private Button enterSettings_Button;
    
    @FXML 
    private Pane theGame_Pane;
    
    @FXML 
    private TextArea messages_TextArea;
    
    @FXML
    private TextField numPlayers_TextField;
    
    //int numPlayers = 7;
    //the distance in poxels that the player circles are from the center of
    //theGame_Pane
    double distance = 115; 
    @FXML
    //the gui opens with inputting the settings for the game, after pressing
    //enter settings the game pane is shown
    private void handleEnterSettings(ActionEvent event) throws IOException{
        
        //grab the number of players from the numPlayers_TextField and parse it
        //into an int
        int numPlayers = Integer.parseInt(numPlayers_TextField.getText()); 
        
        //find the center of theGame_Pane
        double centerX = (theGame_Pane.getWidth() - theGame_Pane.getLayoutX())/2; 
        double centerY = (theGame_Pane.getHeight() - theGame_Pane.getLayoutY())/2;    
       
        //Swithc from gameSetup_Pane to theGame_Pane
        gameSetup_Pane.setVisible(false); 
        theGame_Pane.setVisible(true);
        
        //create player circles
        for(int i=0; i<numPlayers; i++){ 
            //The player circles are loaded from a seperate fxml so that we can 
            //create mulptiple instances
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(bangMain.class.getResource("/views/PlayerView.fxml"));
            Group player_Group = (Group) loader.load();
            
            //we do some trig to that they are placed in a circle around the
            //center of theGame_Pane
            player_Group.setLayoutX(centerX + distance * Math.cos(3*Math.PI / 2 + 2 * Math.PI * (i)/(numPlayers)));
            player_Group.setLayoutY(centerY + distance * Math.sin(3*Math.PI / 2 + 2 * Math.PI * (i)/(numPlayers)));
            
            //get the player label and add the player number. The player label
            //is a child of the group. When getting the children we cant
            //determine what its index is easily so it is hard coded in as the
            //second child
            Label label = (Label) player_Group.getChildren().get(1);
            label.setText(label.getText() + " " + (i+1));
            player_Group.getChildren().get(1).equals(label);
            
            //add the group to theGame_Pane
            theGame_Pane.getChildren().add(player_Group); 
        }
        
        
        
        
    }
    
    public void setMain(bangMain main) {
        this.main = main;
    }
}
