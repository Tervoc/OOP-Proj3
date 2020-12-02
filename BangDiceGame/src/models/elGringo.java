/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import game.*;

/**
 *
 * @author Jared
 */
public class elGringo extends Character {

    public elGringo(EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.elGringo;
    }
}
