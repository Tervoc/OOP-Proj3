package views;

import game.Game;
import game.bangMain;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.*;

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
    private Pane theGame_Pane;
    @FXML
    private Button enterSettings_Button;
    @FXML
    private TextArea messages_TextArea;
    @FXML
    private TextField numPlayers_TextField;
    @FXML
    private Label arrowPile_Label;
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
    private CheckBox die1_CheckBox;
    @FXML
    private CheckBox die2_CheckBox;
    @FXML
    private CheckBox die3_CheckBox;
    @FXML
    private CheckBox die4_CheckBox;
    @FXML
    private CheckBox die5_CheckBox;
    @FXML
    private ChoiceBox die1_ChoiceBox;
    @FXML
    private ChoiceBox die2_ChoiceBox;
    @FXML
    private ChoiceBox die3_ChoiceBox;
    @FXML
    private ChoiceBox die4_ChoiceBox;
    @FXML
    private ChoiceBox die5_ChoiceBox;
         
    @FXML
    private Rectangle playArea_Rectangle;
    
    private ArrayList<CheckBox> dice_CheckBoxes = new ArrayList<CheckBox>();
    private ArrayList<ImageView> dice_ImageViews = new ArrayList<ImageView>();
    private ArrayList<ChoiceBox> dice_ChoiceBoxes = new ArrayList<>();
    
    
    private Game game;
    private boolean isFirstRoll = true;
    //int numPlayers = 7;
    //the distance in poxels that the player circles are from the center of
    //theGame_Pane
    double distance = 200;

    @FXML
    //the gui opens with inputting the settings for the game, after pressing
    //enter settings the game pane is shown
    private void handleEnterSettings(ActionEvent event) throws IOException {

        //grab the number of players from the numPlayers_TextField and parse it
        //into an int
        int numPlayers = Integer.parseInt(numPlayers_TextField.getText());
        if (numPlayers > 3 && numPlayers < 9) {
            //create the game
            game = new Game(numPlayers);
            arrowPile_Label.setText("Arrows: " + game.getArrowPile());
            //find the center of theGame_Pane
            double centerX = (playArea_Rectangle.getWidth() - theGame_Pane.getLayoutX()) / 2 - 50;
            double centerY = (playArea_Rectangle.getHeight() - theGame_Pane.getLayoutY()) / 2 + 25;

            //Swithc from gameSetup_Pane to theGame_Pane
            gameSetup_Pane.setVisible(false);
            theGame_Pane.setVisible(true);

            //create player circles
            for (int i = 0; i < numPlayers; i++) {

                //The player circles are loaded from a seperate fxml so that we can 
                //create mulptiple instances
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(bangMain.class.getResource("/views/PlayerView.fxml"));
                Group player_Group = (Group) loader.load();

                //we do some trig to that they are placed in a circle around the
                //center of theGame_Pane
                player_Group.setLayoutX(centerX + distance * Math.cos(3 * Math.PI / 2 + 2 * Math.PI * (i) / (numPlayers)));
                player_Group.setLayoutY(centerY + distance * Math.sin(3 * Math.PI / 2 + 2 * Math.PI * (i) / (numPlayers)));

                //get the player label and add the player number. The player label
                //is a child of the group. When getting the children we cant
                //determine what its index is easily so it is hard coded in as the
                //second child
                Label label = (Label) player_Group.getChildren().get(1);
                label.setText(label.getText() + " " + (i + 1));
                player_Group.getChildren().get(1).equals(label);

                //add the group to theGame_Pane
                theGame_Pane.getChildren().add(player_Group);

                //we assign each player a player_group
                game.getPlayers().get(i).setPlayerGroup(player_Group);

            }
            updateGamePane();
        } else {
            messages_TextArea.setText("Please enter a number between 4 and 8");
        }
    }

    public void updateGamePane() {
        for (int i = 0; i < game.getPlayers().size(); i++) {
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

            

        }
        messages_TextArea.setText("CurrentPlayer: Player " + (game.getCurrentPlayerNumber() + 1));
        arrowPile_Label.setText("Arrows: " + game.getArrowPile());
    }

    @FXML
    //Handles what heappens when the roll button is clicked
    private void handleRoll_Button(ActionEvent event) {
        //reroll tells us if the dice is to be re reolled or not. true meaning reroll
        boolean[] reroll = {true, true, true, true, true};
        for(Integer i=0; i<5; i++){
            if((!dice_CheckBoxes.get(i).isSelected() && game.getGameDice().getDice().get(i).getSide() != models.WhiteDie.Sides.dynamite)){
                game.getGameDice().rollDice(i);
                dice_ImageViews.get(i).setImage(new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(i).getSideImageFL())));
                
            }
        }
    }
    
    @FXML
    //rerolls all dice 
    private void handleNextTurn_Button(ActionEvent event){
        for(Integer i=0; i<5; i++){
            game.getGameDice().rollDice(i);
            dice_ImageViews.get(i).setImage(new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(i).getSideImageFL())));
            dice_ChoiceBoxes.get(i).setDisable(true);
            dice_CheckBoxes.get(i).setSelected(false);
            
            
        }
        
        game.nextTurn();
        updateGamePane();
        
    }
    
    @FXML
    private void handleConfirmDice_Button(ActionEvent event){
        
    }
    @FXML
    private void handleDie1_CheckBox(){
        handleDice_CheckBoxes(0);
       
    }
    @FXML
    private void handleDie2_CheckBox(){
        handleDice_CheckBoxes(1);

    }
    @FXML
    private void handleDie3_CheckBox(){
        handleDice_CheckBoxes(2);
}
    @FXML
    private void handleDie4_CheckBox(){
        handleDice_CheckBoxes(3);

    }
    @FXML
    private void handleDie5_CheckBox(){
        handleDice_CheckBoxes(4);
    }
    
    private void handleDice_CheckBoxes(int dieNum){
        int playerLeftNumber= -1;
        int playerRightNumber= -1;
        int player2LeftNumber = -1;
        int player2RightNumber = -1;
        int currPlayerNum = game.getCurrentPlayerNumber();
        int numPlayers = game.getNumPlayers()-1;
        if(currPlayerNum > 1 && currPlayerNum < numPlayers - 1){
            playerLeftNumber = currPlayerNum - 1;
            playerRightNumber = currPlayerNum + 1;
            player2LeftNumber = currPlayerNum - 2;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == 1){
            playerLeftNumber = currPlayerNum - 1;
            playerRightNumber = currPlayerNum + 1;
            player2LeftNumber = numPlayers;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == 0){
            playerLeftNumber = numPlayers;
            playerRightNumber = currPlayerNum + 1;
            player2LeftNumber = numPlayers - 1;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == numPlayers-1){
            playerLeftNumber = currPlayerNum - 1;
            playerRightNumber = currPlayerNum + 1;
            player2LeftNumber = currPlayerNum - 2;
            player2RightNumber = 0;
        }else if(currPlayerNum == numPlayers){
            playerLeftNumber = currPlayerNum - 1;
            playerRightNumber = 0;
            player2LeftNumber = currPlayerNum - 2;
            player2RightNumber = 1;
        }
        
        
        models.WhiteDie.Sides currSide = game.getGameDice().getDice().get(dieNum).getSide();
        if(dice_CheckBoxes.get(dieNum).isSelected() && (currSide == models.WhiteDie.Sides.one_shot || currSide == models.WhiteDie.Sides.two_shot||currSide == models.WhiteDie.Sides.beer)){
            dice_ChoiceBoxes.get(dieNum).setDisable(false);
            if(currSide == models.WhiteDie.Sides.one_shot){
                dice_ChoiceBoxes.get(dieNum).getItems().clear();
                ObservableList<String> list = dice_ChoiceBoxes.get(dieNum).getItems();
                list.add("Player " + (playerRightNumber+1));
                list.add("Player " + (playerLeftNumber+1));
            }
            if(currSide == models.WhiteDie.Sides.two_shot){
                dice_ChoiceBoxes.get(dieNum).getItems().clear();
                ObservableList<String> list = dice_ChoiceBoxes.get(dieNum).getItems();
                list.add("Player " + (player2RightNumber+1));
                list.add("Player " + (player2LeftNumber+1));
            }
        }else{
            dice_ChoiceBoxes.get(dieNum).setDisable(true);
        }
    }

    public void setMain(bangMain main) {
        gameSetup_Pane.setVisible(true);
        theGame_Pane.setVisible(false);
        
        dice_CheckBoxes.add(die1_CheckBox);
        dice_CheckBoxes.add(die2_CheckBox);
        dice_CheckBoxes.add(die3_CheckBox);
        dice_CheckBoxes.add(die4_CheckBox);
        dice_CheckBoxes.add(die5_CheckBox);
        
        dice_ImageViews.add(die1_ImageView);
        dice_ImageViews.add(die2_ImageView);
        dice_ImageViews.add(die3_ImageView);
        dice_ImageViews.add(die4_ImageView);
        dice_ImageViews.add(die5_ImageView);
        
        dice_ChoiceBoxes.add(die1_ChoiceBox);
        dice_ChoiceBoxes.add(die2_ChoiceBox);
        dice_ChoiceBoxes.add(die3_ChoiceBox);
        dice_ChoiceBoxes.add(die4_ChoiceBox);
        dice_ChoiceBoxes.add(die5_ChoiceBox);
        
        
        this.main = main;
    }

}
