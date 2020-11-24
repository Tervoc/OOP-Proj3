/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import game.Game;

/**
 *
 * @author Darrel
 */
public class jourdonnais extends Character{
    public jourdonnais(EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.jourdonnais;
    }
        
        public void indianAttack(Game theGame) {
            if(this.arrows >= 1){
                this.bullets = this.bullets - 1; //Jourdonnais only lose 1 bullet due to his ablity.
            }
            this.clearArrows(theGame);
    }
}
