package models;
import game.*;
import java.util.ArrayList;

/**
 *
 * @author mtbol
 */
public class Character {

    /**
     * Creates a integer variable <em> maxBullets </em> 
     */
    protected int maxBullets;

    /**
     * Creates a integer variable <em> bullets </em> 
     */
    protected int bullets;

    /**
     * Creates a integer variable <em> arrows </em> 
     */
    protected int arrows;

    /**
     * Creates a integer variable <em> dynamite </em> 
     */
    protected int dynamite;

    /**
     * Creates a integer variable <em> gatling </em> 
     */
    protected int gatling;

    /**
     * Creates a list of all character names <em> charType </em> 
     */
    protected EnumCharacters charType;

    /**
     * Creates a list of all character roles <em> role </em> 
     */
    protected EnumRoles role;

    /**
     * Character assign method
     * provides the role for the game and the maximum amount of bullets
     * if sheriff adds two bullets two max bullets
     * if not sheriff normal amount of max bullets per character associated health
     * @param bullets
     * @param roleIn
     */
    public Character(int bullets, EnumRoles roleIn) {
        this.role = roleIn;
        if (this.role == EnumRoles.Sheriff) {
            this.maxBullets = bullets + 2;
            this.bullets = this.maxBullets;
        } else {
            this.maxBullets = bullets;
            this.bullets = this.maxBullets;
        }
    }

    /**
     * getter for max bullets
     * @return maxBullted
     */
    public int getMaxBullets() {
        return maxBullets;
    }

    /**
     * getter for EnumRoles
     * @return role
     */
    public EnumRoles getRole() {
        return role;
    }

    /**
     * getter for get bullets
     * and returns number of bullets
     * @return bullets
     */
    public int getBullets() { //returns number of bullets
        return bullets;
    }
    
    /**
     * used to override in there actual character class
     * @param myPlayer
     * @param theGame
     */
    public void pedroAbility(Player myPlayer, Game theGame) {
     
    }
    
    /**
     * used to override in there actual characters class
     * @param arrows
     * @param playerIn
     * @param theGame
     */
    public void apacheKidAbility(int arrows, Player playerIn, Game theGame) {
    
    }

    /**
     * changes dynamite to gatling for belle star
     * @param dynamite
     * @param gatling
     * @param theGame
     */
    public void dynamiteToGatling(int dynamite, int gatling, Game theGame) {
        if(this.dynamite >= 1 && this.dynamite < 3){ 
            this.dynamite -= 1;
            this.gatling += 1;
        }
    }

    /**
     * getter to get list of characters available.
     * @return charType 
     */
    public EnumCharacters getCharType() {
        return charType;
    }
    
}
