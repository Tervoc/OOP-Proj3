/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import game.Game;

/**
 *Character module for Jourdonnais 
 * Located in the indian attack for player.java
 * @author Darrel
 */
public class jourdonnais extends Character{
    public jourdonnais(EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.jourdonnais;
    }

}
