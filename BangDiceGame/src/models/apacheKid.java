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
public class apacheKid extends Character{
    
    boolean takeChiefArrow = true;
    
    public apacheKid (EnumRoles thisRole) {
        super (9, thisRole);
        this.charType = EnumCharacters.apacheKid;
    }
    
    public void apacheKidAbility (int arrows, Player playerIn, Game theGame) {
        if (takeChiefArrow) {
            for (int i = 0; i < theGame.getNumPlayers(); i++) {
                if (theGame.getPlayers().get(i).getChiefArrow() > 0 ) {
                    theGame.getPlayers().get(i).removeChiefArrow(theGame);
                    playerIn.addChiefArrow(theGame);
                }
            }
        }
        else {
            playerIn.setArrows(playerIn.getArrows() + arrows);
            theGame.setArrowPile(theGame.getArrowPile() - arrows);
        }
    }
}
