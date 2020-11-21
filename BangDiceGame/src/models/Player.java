/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package models;
import javafx.scene.Group;
/**
 *
 * @author Darrel
 */
public class Player {
    private Group playerGroup;
    private Character myChar;
    
    public Player(Character myChar) {
        this.myChar = myChar;
    }
    
    public Character getMyCharacter(){
        return myChar;
    }
    
    //this is the player group set on the gui
    public void setPlayerGroup(Group playerGroup){
            this.playerGroup = playerGroup;
    }
    public Group getPlayerGroup(){
        return playerGroup;
    }
}
