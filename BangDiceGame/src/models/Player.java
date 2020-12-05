/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package models;
import game.Game;
import java.util.ArrayList;
import javafx.scene.Group;
import views.StartViewController;
//import models.*;
/**
 *
 * @author Darrel
 */
public class Player {

    /**
     * Created variable for maxBullets
     */
    protected int maxBullets;

    /**
     * Created variable for bullets
     */
    protected int bullets;

    /**
     * Created variable for arrows
     */
    protected int arrows;

    /**
     * Created variable for the chief arrow from expansion
     */
    protected int chiefArrow;
    private Group playerGroup;
    private Character myChar;
    private String Role = "";
    private String Character = "";
    private String ability = "";
    private String number = "";
    private boolean AI = true;

    /**
     * Created a boolean to check if player or players are dead
     */
    protected boolean amIDead = false;
    private boolean hasConfirmedDice = false;

    /**
     * Created ArrayList for duel tokens
     */
    protected ArrayList <EnumDuelTokens> myDuelTokens = new ArrayList <EnumDuelTokens> ();

    /**
     * Function to give characters max bullets depending on what character they are
     * @param myChar
     */
    public Player(Character myChar) {
        this.myChar = myChar;
        this.maxBullets = myChar.maxBullets;
        this.bullets = myChar.bullets;
        this.arrows = 0;
    }
    
    /**
     * Function to add bullets if healed from beer ...
     * @param bullets
     * @param theGame
     */
    public void addBullets(int bullets, Game theGame) { //add a number of bullets to character
        if (this.bullets != this.maxBullets) {
            this.bullets += bullets;
            if(this.bullets > this.maxBullets) {
                this.bullets = this.maxBullets;
            }
            theGame.setBulletPile(theGame.getBulletPile()-bullets);
        }
    }

    /**
     * Function to remove bullets incase player takes damage from one shot two shot gatling indian attack...
     * @param bullets
     * @param theGame
     */
    public void removeBullets(int bullets, Game theGame) { //remove a number of bullets from a character
        if (this.getMyCharacter().getCharType() == EnumCharacters.pedroRamirez) {
            this.getMyCharacter().pedroAbility(this, theGame);
        }
        
        this.bullets -= bullets;
        
        theGame.setBulletPile(theGame.getBulletPile()+bullets);
        
        if (this.bullets <= 0) {
            this.killMe(theGame);
        }
    }
    
    /**
     * Created Boolean to check if currentPLayer or player is dead
     * @return amIDead
     */
    public boolean amIDead() {
        return amIDead;
    }

    /**
     * Sets a person to dead if they run out of bullets
     */
    public void setDead() {
        this.amIDead = true;
    }
    
    /**
     * Force kill a player if they run out of bullets
     * @param theGame
     */
    public void killMe (Game theGame) {
        this.setDead();
        
//        for (int i = 0; i < theGame.getPlayers().size();i++) {
//            if(theGame.getPlayers().get(i).getMyCharacter().getCharType() == this.getMyCharacter().getCharType()) {
//                ArrayList <Player> temp = new ArrayList <Player> ();
//                temp = theGame.getPlayers();
//                temp.remove(i);
//                theGame.setPlayers(temp);
//            }
//        }
        if(this.getMyCharacter().role == EnumRoles.Outlaw) {
            theGame.setNumOutlaws(theGame.getNumOutlaws() - 1);
        }
        else if (this.getMyCharacter().role == EnumRoles.Renegade){
            theGame.setNumRenegades(theGame.getNumRenegades() - 1);
        }
        
        if( (this.getMyCharacter().role == EnumRoles.Sheriff) && (theGame.getNumOutlaws() == 0) ) {
            theGame.setRenegadeWin(true);
        }
        else if ( this.getMyCharacter().role == EnumRoles.Sheriff ) {
            theGame.setOutlawWin(true);
        }
    }
    
    /**
     * Function to get arrows
     * @return
     */
    public int getArrows() { //return current number of arrows
        if (this.chiefArrow > 0) {
            return this.arrows + 2;
        }
        else {
            return this.arrows;
        }
    }
    
    /**
     * Function to add the chief arrow to game if needed for expansion
     * @param theGame
     */
    public void addChiefArrow(Game theGame) {
        this.chiefArrow = 1;
        theGame.setChiefArrow(0);
    }
    
    /**
     * Function to remove chief arrow
     * @param theGame
     */
    public void removeChiefArrow(Game theGame) {
        this.chiefArrow = 0;
        theGame.setChiefArrow(1);
    }

    /**
     * Getter for Chief arrow
     * @return
     */
    public int getChiefArrow() {
        return chiefArrow;
    }
    
    /**
     * Function to add arrows to each player if they roll an arrow
     * @param arrows
     * @param theGame
     */
    public void addArrows(int arrows, Game theGame) { //add number of arrows to character
        if (theGame.getCurrentPlayer().getMyCharacter().getCharType() == EnumCharacters.apacheKid) {
            theGame.getCurrentPlayer().getMyCharacter().apacheKidAbility(arrows, theGame.getCurrentPlayer(), theGame);
        }
        else {
            this.arrows += arrows;
            theGame.setArrowPile(theGame.getArrowPile()-arrows);
        }
    }

    /**
     * Remove a number of arrows if indian attack occurs or special character ability
     * @param arrows
     * @param theGame
     */
    public void removeArrows(int arrows, Game theGame) { //remove number of arrows from character
        this.arrows -= arrows;
        theGame.setArrowPile(theGame.getArrowPile()+arrows);
    }

    /**
     * Clear all arrows from currently assigned player
     * @param theGame
     */
    public void clearArrows(Game theGame) { //clear the number of arrows currently assigned to player
        theGame.setArrowPile(theGame.getArrowPile() + this.arrows);
        theGame.setChiefArrow(theGame.getChiefArrow() + this.chiefArrow);
        this.arrows = 0;
        this.chiefArrow = 0;
    }

    /**
     * Function for if the last arrow is taken indian attack occurs to all players.
     * @param theGame
     */
    public void indianAttack(Game theGame) {
        int maxArrows = 0;
        if(this.chiefArrow > 0){
            for (int i = 0; i < theGame.getNumPlayers(); i++){
                if (theGame.getPlayers().get(i).getArrows() > maxArrows) {
                    maxArrows = theGame.getPlayers().get(i).getArrows();
                } 
            }
            if (this.getArrows() > maxArrows) {
                this.clearArrows(theGame);
            }
            else {
                if (this.getMyCharacter().getCharType() == EnumCharacters.jourdonnais){
                    if (this.getArrows() > 1){
                        this.removeBullets(1, theGame);
                    }
                    this.clearArrows(theGame);
                }
                else {
                    this.removeBullets(this.getArrows(), theGame);
                    this.clearArrows(theGame);
                }
            }
        }
        else {
            if (this.getMyCharacter().getCharType() == EnumCharacters.jourdonnais) {
                if (this.getArrows() > 1){
                    this.removeBullets(1, theGame);
                }
                this.clearArrows(theGame);
            }
            else {
                this.removeBullets(this.getArrows(), theGame);
                this.clearArrows(theGame);
            }
        }
    }
    
    /**
     * Getter for what character
     * @return
     */
    public Character getMyCharacter(){
        return myChar;
    }
    
    //this is the player group set on the gui

    /**
     *
     * @param playerGroup
     */
    public void setPlayerGroup(Group playerGroup){
            this.playerGroup = playerGroup;
    }

    /**
     *
     * @return
     */
    public Group getPlayerGroup(){
        return playerGroup;
    }

    /**
     * Get ability for certain character
     * @return
     */
    public String getAbility()
    {
        return ability;
    }

    /**
     * boolean to make sure player has correct dice
     * @return
     */
    public boolean isHasConfirmedDice() {
        return hasConfirmedDice;
    }

    /**
     * set the confirmed dice to the player
     * @param hasConfirmedDice
     */
    public void setHasConfirmedDice(boolean hasConfirmedDice) {
        this.hasConfirmedDice = hasConfirmedDice;
    }
    
    /**
     * getter for max bullets
     * @return
     */
    public int getMaxBullets() {
        return maxBullets;
    }
    
    /**
     *
     */
    public void setUser(){
        AI = false;
    }
    
    /**
     * get role for character
     * @return
     */
    public String getRole()
    {
        return Role;
    }
    
    /**
     * set role to the character at start of game
     * @param temp
     */
    public void setRole(String temp)
    {
        Role = temp;
    }
    
    /**
     * gets number of bullets equivalent to character health
     * @return
     */
    public int getBullets() { //returns number of bullets
        return bullets;
    }
    
    /**
     * Sets character specific traits
     * @param num
     */
    public void setCharacterTraits(int num)
    {
       
        
    }

    /**
     * sets required arrows to game
     * @param arrows
     */
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    /**
     * ArrayList of the duel tokens
     * @return
     */
    public ArrayList<EnumDuelTokens> getMyDuelTokens() {
        return this.myDuelTokens;
    }

    /**
     * Sets my duel tokens
     * @param myDuelTokens
     */
    public void setMyDuelTokens(ArrayList<EnumDuelTokens> myDuelTokens) {
        this.myDuelTokens = myDuelTokens;
    }

}
