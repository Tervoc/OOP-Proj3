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
public class Player {
    private Character myChar;
    
    public Player(Character myChar) {
        this.myChar = myChar;
    }
    
    public Character getMycharacter(){
        return myChar;
    }

}
