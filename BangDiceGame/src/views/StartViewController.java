package views;

import game.Game;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import models.DiceBase;
import models.Player;

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
    
    @FXML
    private ImageView die1_ImageView;
    
    @FXML
    private ImageView die2_ImageView;
    
    @FXML
    private ImageView die3_ImageView;
    
    @FXML
    private ImageView die4_ImageView;
    
    @FXML
    private ImageView die5_ImageView;
    
    @FXML
    private Rectangle playArea_Rectangle;
    
    @FXML
    private Label arrowPile_Label;
    private Game game;
    //int numPlayers = 7;
    //the distance in poxels that the player circles are from the center of
    //theGame_Pane
    double distance = 200; 
    @FXML
    //the gui opens with inputting the settings for the game, after pressing
    //enter settings the game pane is shown
    private void handleEnterSettings(ActionEvent event) throws IOException{
        
        //grab the number of players from the numPlayers_TextField and parse it
        //into an int
        
        int numPlayers = Integer.parseInt(numPlayers_TextField.getText()); 
        if(numPlayers > 3 && numPlayers < 9){
            //create the game
            game = new Game(numPlayers);
            arrowPile_Label.setText("Arrows: " + game.getArrowPile());
            //find the center of theGame_Pane
            double centerX = (playArea_Rectangle.getWidth() - theGame_Pane.getLayoutX())/2-50; 
            double centerY = (playArea_Rectangle.getHeight() - theGame_Pane.getLayoutY())/2;    

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
                
                //we assign each player a player_group
                game.getPlayers().get(i).setPlayerGroup(player_Group);
                 
                
                
                
            }
            updatePlayerGroups();
        }else{
            messages_TextArea.setText("Please enter a number between 4 and 8");                         
        }
    }
    public void updatePlayerGroups(){
        for(int i=0; i<game.getPlayers().size(); i++){
            Player player = game.getPlayers().get(i);
            Group playerGroup = player.getPlayerGroup();
            
            Label roleLabel = (Label) playerGroup.getChildren().get(2);
            roleLabel.setText("Role: " + player.getMyCharacter().getRole().getRoleAsString());
            
            Label charLabel = (Label) playerGroup.getChildren().get(3);
            charLabel.setText("Character: " + player.getMyCharacter().getCharType().getCharacterAsString());
            
            Label bulletsLabel = (Label) playerGroup.getChildren().get(4);
            bulletsLabel.setText("Bullets: " + player.getMyCharacter().getBullets());
            
            Label arrowLabel = (Label) playerGroup.getChildren().get(5);
            arrowLabel.setText("Arrows: " + player.getMyCharacter().getArrows());
            
            
            
            playerGroup.getChildren().get(2).equals(roleLabel);
            playerGroup.getChildren().get(3).equals(charLabel);
            playerGroup.getChildren().get(4).equals(bulletsLabel);
            playerGroup.getChildren().get(5).equals(arrowLabel);
            
            player.setPlayerGroup(playerGroup);
            
            arrowPile_Label.setText("Arrows: " + game.getArrowPile());
            
        }
    }
    
    @FXML
    private void handleRoll(){
        game.getGameDice().rerollAllDice();
        Image die1 = new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(0).getSideImageFL()));
        Image die2 = new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(1).getSideImageFL()));
        Image die3 = new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(2).getSideImageFL()));
        Image die4 = new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(3).getSideImageFL()));
        Image die5 = new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(4).getSideImageFL()));
        die1_ImageView.setImage(die1);
        die2_ImageView.setImage(die2);
        die3_ImageView.setImage(die3);
        die4_ImageView.setImage(die4);
        die5_ImageView.setImage(die5);
    }
    
    public void setMain(bangMain main) {
        this.main = main;
    }
    
    
}
