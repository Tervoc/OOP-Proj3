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
import models.Dice;
import models.Die;
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
    private Button confirmDice_Button;
    @FXML
    private Button roll_Button;
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
    private  Label rollsLeft_Label;
    @FXML
    private CheckBox isExpansionSelected_CheckBox;
    @FXML
    private CheckBox coward_CheckBox;
    @FXML
    private CheckBox loudMouth_CheckBox;
    @FXML
    private CheckBox normal_CheckBox;
    @FXML
    private Group expansionDice_Group;
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
    double distance = 300;

    @FXML
    //the gui opens with inputting the settings for the game, after pressing
    //enter settings the game pane is shown
    private void handleEnterSettings(ActionEvent event) throws IOException {

        //grab the number of players from the numPlayers_TextField and parse it
        //into an int
        int numPlayers = Integer.parseInt(numPlayers_TextField.getText());
        if (numPlayers > 3 && numPlayers < 9) {
            //create the game
            
            game = new Game(numPlayers, isExpansionSelected_CheckBox.isSelected());
           if(isExpansionSelected_CheckBox.isSelected()){
               expansionDice_Group.setVisible(true);
           }else{
               expansionDice_Group.setVisible(false);
           }
            arrowPile_Label.setText("Arrows: " + game.getArrowPile());
            //find the center of theGame_Pane
            double centerX = (playArea_Rectangle.getWidth() - theGame_Pane.getLayoutX()) / 2 - 50;
            double centerY = (playArea_Rectangle.getHeight() - theGame_Pane.getLayoutY()) / 2 - 100;

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
                player_Group.setLayoutX(centerX + (distance+50) * Math.cos(3 * Math.PI / 2 + 2 * Math.PI * (i) / (numPlayers)));
                player_Group.setLayoutY(centerY + (distance - 50) * Math.sin(3 * Math.PI / 2 + 2 * Math.PI * (i) / (numPlayers)));

                //get the player label and add the player number. The player label
                //is a child of the group. When getting the children we cant
                //determine what its index is easily so it is hard coded in as the
                //second child
                Label label = (Label) player_Group.getChildren().get(2);
                label.setText(label.getText() + " " + (i + 1));
                player_Group.getChildren().get(2).equals(label);

                //add the group to theGame_Pane
                theGame_Pane.getChildren().add(player_Group);

                //we assign each player a player_group
                game.getPlayers().get(i).setPlayerGroup(player_Group);

            }
            
            updateGamePane();
        } else {
            messages_TextArea.setText("Please enter a number between 4 and 8");
        }
         for(Integer i=0; i<5; i++){
            game.getGameDice().rollDice(i);
            dice_ImageViews.get(i).setImage(new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(i).getSideImageFL())));

        }
    }

    public void updateGamePane() {
        for (int i = 0; i < game.getPlayers().size(); i++) {
            Player player = game.getPlayers().get(i);
            Group playerGroup = player.getPlayerGroup();
            
            
            ImageView skullImage = (ImageView) playerGroup.getChildren().get(3);
            skullImage.setVisible(true);
            if(player.amIDead()){
                skullImage.setImage(new Image(StartViewController.class.getResourceAsStream("skull.png")));
            }else{
                skullImage.setImage(new Image(StartViewController.class.getResourceAsStream(player.getMyCharacter().getCharType().getCharImageFL())));
            }

            Label roleLabel = (Label) playerGroup.getChildren().get(4);
            roleLabel.setText("Role: " + player.getMyCharacter().getRole().getRoleAsString());

            Label charLabel = (Label) playerGroup.getChildren().get(5);
            charLabel.setText("Character: " + player.getMyCharacter().getCharType().getCharacterAsString());

            Label bulletsLabel = (Label) playerGroup.getChildren().get(6);
            bulletsLabel.setText("Bullets: " + player.getBullets());

            Label arrowLabel = (Label) playerGroup.getChildren().get(7);
            arrowLabel.setText("Arrows: " + player.getArrows());
            
            Circle currentPlayerCirlce = (Circle)  playerGroup.getChildren().get(8);
            if(game.getCurrentPlayer() == player){
                 currentPlayerCirlce.setVisible(true);
            }else{
                currentPlayerCirlce.setVisible(false);
            }        

            
            playerGroup.getChildren().get(4).equals(roleLabel);
            playerGroup.getChildren().get(5).equals(charLabel);
            playerGroup.getChildren().get(6).equals(bulletsLabel);
            playerGroup.getChildren().get(7).equals(arrowLabel);
            playerGroup.getChildren().get(8).equals(currentPlayerCirlce);
            player.setPlayerGroup(playerGroup);
            
            rollsLeft_Label.setText("Rolls Left: " + (3-game.getTurnRolls()));
            if(game.getTurnRolls() >= 3){
                roll_Button.setDisable(true);
            }else{
                roll_Button.setDisable(false);
            }

        }
        messages_TextArea.setText("CurrentPlayer: Player " + (game.getCurrentPlayerNumber() + 1));
        arrowPile_Label.setText("Arrows: " + game.getArrowPile());
    }

    @FXML
    //Handles what heappens when the roll button is clicked
    private void handleRoll_Button(ActionEvent event) {
        //reroll tells us if the dice is to be re reolled or not. true meaning reroll
        coward_CheckBox.setDisable(true);
        loudMouth_CheckBox.setDisable(true);
        normal_CheckBox.setDisable(true);
        if(!(game.getTurnRolls() >= 3)){
           
            for(Integer i=0; i<5; i++){
                if(!game.getGameDice().getDice().get(i).isLocked()){
                    game.getGameDice().rollDice(i);
                    dice_ImageViews.get(i).setImage(new Image(StartViewController.class.getResourceAsStream(game.getGameDice().getDice().get(i).getSideImageFL())));
                } 
            }
            game.interpretRoll();
            this.updateGamePane();
        }else{
            messages_TextArea.setText("You are out of rolls, bitch");
        }
        for(int i=0; i<5; i++){
            dice_ImageViews.get(i).setVisible(true);
        }
    }
    
    @FXML
    //rerolls all dice 
    private void handleNextTurn_Button(ActionEvent event){
        game.getCurrentPlayer().setHasConfirmedDice(false);
        coward_CheckBox.setDisable(false);
        loudMouth_CheckBox.setDisable(false);
        normal_CheckBox.setDisable(false);
        //confirmDice_Button.setDisable(false);
        for(Integer i=0; i<5; i++){
            
            dice_ImageViews.get(i).setVisible(false);
            dice_ChoiceBoxes.get(i).setDisable(true);
            dice_CheckBoxes.get(i).setSelected(false);   
        }      
        game.nextTurn();
        updateGamePane();
    }
    
    @FXML
    private void handleConfirmDice_Button(ActionEvent event){
        
        
           // confirmDice_Button.setDisable(true);
        game.setTurnRolls(3);
            game.getCurrentPlayer().setHasConfirmedDice(true);
            for(int i=0; i<5; i++){
                 models.Die.Sides currSide = game.getGameDice().getDice().get(i).getSide();
                if(dice_CheckBoxes.get(i).isSelected()){
                    game.getGameDice().getDice().get(i).lockDie();
                    if((currSide == models.Die.Sides.one_shot || currSide == models.Die.Sides.two_shot) && dice_ChoiceBoxes.get(i).getValue()!=null){
                       
                        
                        game.getGameDice().getDice().get(i).setWhosGettingShot(Integer.parseInt(dice_ChoiceBoxes.get(i).getValue().toString().substring(dice_ChoiceBoxes.get(i).getValue().toString().length()-1))-1);
                         System.out.println("Whos getting shot: "+game.getGameDice().getDice().get(i).getWhosGettingShot());
                    }
                    else if((currSide == models.Die.Sides.beer) && dice_ChoiceBoxes.get(i).getValue()!=null){
                        game.getGameDice().getDice().get(i).setWhosGettingABeer(Integer.parseInt(dice_ChoiceBoxes.get(i).getValue().toString().substring(dice_ChoiceBoxes.get(i).getValue().toString().length()-1))-1);
                    }
                }

            }
           game.useRoll();
        
       updateGamePane();
    }
    @FXML
    private void handleDie1_CheckBox(ActionEvent event){
        handleDice_CheckBoxes(0);
       
    }
    @FXML
    private void handleDie2_CheckBox(ActionEvent event){
        handleDice_CheckBoxes(1);

    }
    @FXML
    private void handleDie3_CheckBox(ActionEvent event){
        handleDice_CheckBoxes(2);
}
    @FXML
    private void handleDie4_CheckBox(ActionEvent event){
        handleDice_CheckBoxes(3);

    }
    @FXML
    private void handleDie5_CheckBox(ActionEvent event){
        handleDice_CheckBoxes(4);
    }
    
    private void handleDice_CheckBoxes(int dieNum){
        int playerLeftNumber= -1;
        int playerRightNumber= -1;
        int player2LeftNumber = -1;
        int player2RightNumber = -1;
        
        
        int currPlayerNum = game.getCurrentPlayerNumber();
        int numPlayers = game.getNumPlayers() -1;
        if(currPlayerNum > 1 && currPlayerNum < numPlayers - 1){
            playerLeftNumber = currPlayerNum - 1;
            player2LeftNumber = currPlayerNum - 2;
            playerRightNumber = currPlayerNum + 1;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == 1){
            playerLeftNumber = currPlayerNum - 1;
            player2LeftNumber = numPlayers;
            playerRightNumber = currPlayerNum + 1;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == 0){
            playerLeftNumber = numPlayers;
            player2LeftNumber = numPlayers - 1;
            playerRightNumber = currPlayerNum + 1;
            player2RightNumber = currPlayerNum + 2;
        }else if(currPlayerNum == numPlayers-1){
            playerLeftNumber = currPlayerNum - 1;
            player2LeftNumber = currPlayerNum - 2;
            playerRightNumber = currPlayerNum + 1;
            player2RightNumber = 0;
        }else if(currPlayerNum == numPlayers){
            playerLeftNumber = currPlayerNum - 1;
            player2LeftNumber = currPlayerNum - 2;
            playerRightNumber = 0;
            player2RightNumber = 1;
        }
        if(!dice_CheckBoxes.get(dieNum).isSelected() && game.getGameDice().getDice().get(dieNum).getSide() != Die.Sides.dynamite){
            game.getGameDice().getDice().get(dieNum).unlockDie();
        }
        if(dice_CheckBoxes.get(dieNum).isSelected()){
            game.getGameDice().getDice().get(dieNum).lockDie();
        }
        
        
        models.Die.Sides currSide = game.getGameDice().getDice().get(dieNum).getSide();
        if(dice_CheckBoxes.get(dieNum).isSelected() && (currSide == models.Die.Sides.one_shot || currSide == models.Die.Sides.two_shot||currSide == models.Die.Sides.beer)){
            dice_ChoiceBoxes.get(dieNum).setDisable(false);
            if(currSide == models.Die.Sides.one_shot){
                dice_ChoiceBoxes.get(dieNum).getItems().clear();
                ObservableList<String> list = dice_ChoiceBoxes.get(dieNum).getItems();
                list.add("Player " + (playerRightNumber+1));
                list.add("Player " + (playerLeftNumber+1));
            }
            if(currSide == models.Die.Sides.two_shot){
                dice_ChoiceBoxes.get(dieNum).getItems().clear();
                ObservableList<String> list = dice_ChoiceBoxes.get(dieNum).getItems();
                list.add("Player " + (player2RightNumber+1));
                list.add("Player " + (player2LeftNumber+1));
            }
            if(currSide == models.Die.Sides.beer){
                dice_ChoiceBoxes.get(dieNum).getItems().clear();
                ObservableList<String> list = dice_ChoiceBoxes.get(dieNum).getItems();
                for(int i=0; i<game.getNumPlayers(); i++){
                    list.add("Player " + (i+1));
                }
            }
        }else{
            dice_ChoiceBoxes.get(dieNum).setDisable(true);
        }
    }
    @FXML
    private void handleCoward_CheckBox(ActionEvent event){
        if(coward_CheckBox.isSelected()){
            loudMouth_CheckBox.setSelected(false);
            normal_CheckBox.setSelected(false);
        }
        
    }
    @FXML
    private void handleLoudMouth_CheckBox(ActionEvent event){
        if(loudMouth_CheckBox.isSelected()){
            coward_CheckBox.setSelected(false);
            normal_CheckBox.setSelected(false);
        }
    }
    @FXML
    private void handleNormal_CheckBox(ActionEvent event){
        if(normal_CheckBox.isSelected()){
            loudMouth_CheckBox.setSelected(false);
            coward_CheckBox.setSelected(false);
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
        
       for(int i=0; i<5; i++){
           dice_ImageViews.get(i).setVisible(false);
       }
        
        this.main = main;
    }

}
