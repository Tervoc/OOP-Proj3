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
public class apacheKid extends Character{
    
    public apacheKid (EnumRoles thisRole) {
        super (9, thisRole);
        this.charType = EnumCharacters.apacheKid;
    }
}
