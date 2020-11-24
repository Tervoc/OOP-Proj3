/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Darrel
 */
public class luckyDuke extends Character{
    
    public luckyDuke(EnumRoles thisRole) {
        super(8, thisRole);
        this.charType = EnumCharacters.luckyDuke;
    }
    
    public void reRoll(Integer aa, Integer bb, Integer cc, Integer dd, Integer ee, Integer ff) {
        if(this.numRolls < 4){ //Lucky duke ablity allows him to roll 4 times instead of 3.
            charDice.rerollDice(aa, bb, cc, dd, ee, ff);
            this.numRolls += 1;
        }
    }
}
