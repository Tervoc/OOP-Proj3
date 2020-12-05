/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Character Module for Bill No Face
 * Code for Bill No Face is located in Game.Java in interpreted role
 * @author chris
 */
public class billNoFace extends Character{
    
    public billNoFace (EnumRoles thisRole) {
        super (9, thisRole);
        this.charType = EnumCharacters.billNoFace;
    }
}

