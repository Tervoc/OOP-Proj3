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
<<<<<<< Updated upstream
    private Group playerGroup;
    private Character myChar;
=======
    
<<<<<<< Updated upstream
    Character myChar;
=======
    private String Role = "";
    private String Character = "";
    private String ability = "";
    private String number = "";
    private boolean AI = true;
    private Character myChar;
>>>>>>> Stashed changes
    
    public void setUser(){
        AI = false;
    }
    
    public String getRole()
    {
        return Role;
    }
    
    public void setRole(String temp)
    {
        Role = temp;
    }
>>>>>>> Stashed changes
    
    public Player(Character myChar) {
        this.myChar = myChar;
    }
    
    public Character getMyCharacter(){
        return myChar;
    }
    
<<<<<<< Updated upstream
    //this is the player group set on the gui
    public void setPlayerGroup(Group playerGroup){
            this.playerGroup = playerGroup;
    }
    public Group getPlayerGroup(){
        return playerGroup;
    }
=======
    public String getAbility()
    {
        return ability;
    }
    
     public void setCharacterTraits(int num)
    {
       
        
    }

>>>>>>> Stashed changes
}
