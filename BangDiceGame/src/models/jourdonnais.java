/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Darrel
 */
public class jourdonnais extends Character{
    public jourdonnais(EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.jourdonnais;
    }
        
        public void indianAttack() {
            if(this.arrows >= 1){
                this.bullets = this.bullets - 1; //Jourdonnais only lose 1 bullet due to his ablity.
                this.arrows = 0;
            }
            else{
                 this.bullets = this.bullets - 0; //Jourdonnais would not lose any health for indian attack.
                 this.arrows = 0;
            } 
    }
}
