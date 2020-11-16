package views;

import game.bangMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class StartViewController {
    private bangMain main;
    
    @FXML
    private Pane gameSetup_Pane;
    
    @FXML
    private Button enterSettings_Button;
    
    @FXML 
    private Pane theGame_Pane;
    
    @FXML 
    private TextArea messages_TextArea;
    
    @FXML
    //the gui opens with inputting the settings for the game, after pressing enter setting s the game pane is shown
    private void handleEnterSettings(ActionEvent event){
        gameSetup_Pane.setVisible(false);
        theGame_Pane.setVisible(true);
    }
    
    public void setMain(bangMain main) {
        this.main = main;
    }
}
