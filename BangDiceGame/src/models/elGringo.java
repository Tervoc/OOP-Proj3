/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import game.*;

/**
 * Character Module for El Gringo
 * Located in the game.java for one shot, two shot, gatling when receiving damage
 * @author Jared
 */
public class elGringo extends Character {

    public elGringo(EnumRoles thisRole) {
        super(7, thisRole);
        this.charType = EnumCharacters.elGringo;
    }
}
