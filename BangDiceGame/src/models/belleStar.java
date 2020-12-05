/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import game.Game;

/**
 * Character Module for Belle Star
 * @author Michael 
 */
public class belleStar extends Character {
   
    public belleStar(EnumRoles thisRole){
        super(8, thisRole);
        this.charType = EnumCharacters.belleStar;
    }

        boolean dynamiteToGatling = true;
    
        public void dynamiteToGatling(int dynamite, int gatling, Game theGame) {
        if(this.dynamite >= 1 && this.dynamite < 3){ 
            this.dynamite -= 1;
            this.gatling += 1;
        }
    }
    
    
}