/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Character Module for Willy The Kid
 * @author Michael
 * Relocated to the game class and is in the function use role. 
 */
public class willyTheKid extends Character{
    
    public willyTheKid(EnumRoles thisRole) {
        super(8, thisRole);
        this.charType = EnumCharacters.willyTheKid;
    }

}

