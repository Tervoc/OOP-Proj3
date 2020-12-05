/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Character Module for Greg Digger.
 * @author mtbol
 */
public class gregDigger extends Character {
    public gregDigger (EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.gregDigger;
    }
        
}
