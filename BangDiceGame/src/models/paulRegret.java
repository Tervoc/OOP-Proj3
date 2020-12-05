/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import game.Game;

/**
 * Character Module for Paul Regret
 * Located in the game.java class in Use Gatling function
 * @author Michael
 * moved to game class
 */
public class paulRegret extends Character{
    
    public paulRegret(EnumRoles thisRole) {
        super(9, thisRole);
        this.charType = EnumCharacters.paulRegret;
    }

}
