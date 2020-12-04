/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import game.Game;

/**
 *
 * @author chris
 */
public class pedroRamirez extends Character {
    
    protected boolean discard = true;
    
    public pedroRamirez(EnumRoles thisRole) {
        super(8, thisRole);
        this.charType = EnumCharacters.pedroRamirez;
    }
    
    public void pedroAbility(Player myPlayer, Game theGame) {
        if(myPlayer.getArrows() != 0 && discard){
            myPlayer.removeArrows(1, theGame); 
        }
    }
    
}
