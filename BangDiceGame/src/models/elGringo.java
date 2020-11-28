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

    public void removeBullets(int bullets, Game theGame, Character charIn) {
        this.bullets -= bullets; //remove bullets
        if (charIn != null) //if a player attacked el gringo, that player gets an arrow
        {
            charIn.addArrows(1, theGame);
        }
    }
}
