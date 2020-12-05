/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Character Module for Lucky Duke
 * Located in the game.java class in interpret role
 * @author Darrel
 */
public class luckyDuke extends Character{
    
    public luckyDuke(EnumRoles thisRole) {
        super(8, thisRole);
        this.charType = EnumCharacters.luckyDuke;
    }
}
