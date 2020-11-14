/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author chris
 */
public class pedroRamirez extends Character {
    
    protected boolean discard = true;
    
    public pedroRamirez(Roles thisRole) {
        super(8, thisRole);
    }
    
    public void removeBullets(int bullets) {
        if(this.arrows != 0 && discard){
            this.arrows -= 1; 
        }
        
        this.bullets -= bullets;
    }
    
}
