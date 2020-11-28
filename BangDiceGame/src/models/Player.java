/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package models;
import game.Game;
import javafx.scene.Group;
/**
 *
 * @author Darrel
 */
public class Player {

    protected int maxBullets;
    protected int bullets;
    protected int arrows;
    protected int numRolls;
    private Group playerGroup;
    private Character myChar;
    private String Role = "";
    private String Character = "";
    private String ability = "";
    private String number = "";
    private boolean AI = true;
    
    

    
    public Player(Character myChar) {
        this.myChar = myChar;
    }
    
    public void addBullets(int bullets, Game theGame) { //add a number of bullets to character
        if (this.bullets != this.maxBullets) {
            this.bullets += bullets;
            if(this.bullets > this.maxBullets) {
                this.bullets = this.maxBullets;
            }
            theGame.setBulletPile(theGame.getBulletPile()-bullets);
        }
    }

    public void removeBullets(int bullets, Game theGame) { //remove a number of bullets from a character
        this.bullets -= bullets;
        theGame.setBulletPile(theGame.getBulletPile()+bullets);
        
        if (this.bullets == 0) {
            this.killMe(theGame);
        }
    }

    public int getArrows() { //return current number of arrows
        return arrows;
    }

    public void addArrows(int arrows, Game theGame) { //add number of arrows to character
        this.arrows += arrows;
        theGame.setArrowPile(theGame.getArrowPile()-arrows);
    }

    public void removeArrows(int arrows, Game theGame) { //remove number of arrows from character
        this.arrows -= arrows;
        theGame.setArrowPile(theGame.getArrowPile()+arrows);
    }

    public void clearArrows(Game theGame) { //clear the number of arrows currently assigned to player
        theGame.setArrowPile(theGame.getArrowPile() + this.arrows);
        this.arrows = 0;
    }

    public void indianAttack(Game theGame) {
        //subtract the number of arrows from the character's health set number of
        //arrows to zero
        this.removeBullets(this.arrows, theGame);
        this.clearArrows(theGame);
    }
    
    public Character getMyCharacter(){
        return myChar;
    }
    
    //this is the player group set on the gui
    public void setPlayerGroup(Group playerGroup){
            this.playerGroup = playerGroup;
    }
    public Group getPlayerGroup(){
        return playerGroup;
    }

    public String getAbility()
    {
        return ability;
    }
    
    public int getMaxBullets() {
        return maxBullets;
    }
    
    public void setUser(){
        AI = false;
    }
    
    public String getRole()
    {
        return Role;
    }
    
    public void setRole(String temp)
    {
        Role = temp;
    }
    
    public int getNumRolls() {
        return numRolls;
    }
    
    public int getBullets() { //returns number of bullets
        return bullets;
    }
    
    public void setCharacterTraits(int num)
    {
       
        
    }

}
