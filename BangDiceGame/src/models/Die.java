/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;
import java.lang.Math; 
import java.util.ArrayList;
/**
 *
 * @author Troll
 */
//instantiatting the die class creates an object with a random Sides value
public class Die {

    /**
     * # number of sides and what are on the side of the dice
     */
    public enum Sides{

        /**
         * variable arrow
         */
        arrow,
        broken_arrow,
        bullet,
        dynamite,
        whiskey_bottle,
        one_shot,
        double_one_shot,
        two_shot,
        double_two_shot,
        beer,
        double_beer,
        gatling,
        double_gatling,
        duel
        



    }; 

    /**
     * different number of dice there are a total of four
     */
    public enum DieType {

        /**
         * white die from the base game
         */
        white,

        /**
         * coward die from expansion 1 old saloon
         */
        coward,

        /**
         * loudmouth die from expansion old saloon
         */
        loudmouth,

        /**
         * black die / duel die from "undead or alive" expansion
         */
        black
    };
    //To use the Sides enum in other classes ues Die.Sides.arrow or whichever
    //you need.//To use the Sides enum in other classes ues Die.Sides.arrow or whichever
    //you need.

    /**
     * array list of the amount of sides each die can have and what they can have
     */
    
    public static Sides[] sidesList = Sides.values();
    //sidesList is created so we can access the sides enum by index Sides.values
    //retunrs the values of the enum as an array. This is used in the roll function

    /**
     * variable for sides
     */
    protected Sides side;  
    
    /**
     * properties of the dice
     */
    protected boolean locked = false;

    /**
     * which other player is losing one health or in this case one bullet
     */
    protected int whosGettingShot = -1;

    /**
     * player or other player receives a heal of a bear for one health or one bullet
     */
    protected int whosGettingABeer = -1;
    protected int whosGettingDueled = -1;
    private DieType dieType;
    private ArrayList <Sides> validSides = new ArrayList <Sides>();
    
    /**
     * roll a specific die from white, coward, loudmouth, black
     * @param type
     */
    public Die(DieType type){
        this.dieType = type;
        
       roll(); 
    }
    
    /**
     * Roll is created for each die, white for example: has specific properties 
     * loudmouth is different then the white die arrow, bullet, double one shot, double two shot, double gatling, dynamite
     * coward is different then then the previous two arrow, beer, one shot, double beer, broken arrow, dynamite
     * black die is different then all 3 it contains arrow whiskey bottle, duel, duel, gatling, dynamite
     */
    public void roll() {
        this.validSides.clear();
       if(this.dieType == DieType.white){
            this.validSides.add(Sides.arrow);
            this.validSides.add(Sides.beer);
            this.validSides.add(Sides.one_shot);
            this.validSides.add(Sides.two_shot);
            this.validSides.add(Sides.dynamite);
            this.validSides.add(Sides.gatling);
            
            
        }
        else if(this.dieType == DieType.loudmouth){
            this.validSides.add(Sides.arrow);
            this.validSides.add(Sides.bullet);
            this.validSides.add(Sides.double_one_shot);
            this.validSides.add(Sides.double_two_shot);
            this.validSides.add(Sides.double_gatling);
            this.validSides.add(Sides.dynamite);
        }
        else if(this.dieType == DieType.coward){
            this.validSides.add(Sides.arrow);
            this.validSides.add(Sides.beer);
            this.validSides.add(Sides.one_shot);
            this.validSides.add(Sides.double_beer);
            this.validSides.add(Sides.broken_arrow);
            this.validSides.add(Sides.dynamite);
        }
        else {
            this.validSides.add(Sides.arrow);
            this.validSides.add(Sides.whiskey_bottle);
            this.validSides.add(Sides.duel);
            this.validSides.add(Sides.duel);
            this.validSides.add(Sides.gatling);
            this.validSides.add(Sides.dynamite);
        }
        whosGettingShot = -1;
        whosGettingABeer = -1;
        this.side = validSides.get( (int)(Math.random() * 6) );
        this.locked = false;
        //math .random retunrs a value between 0 and 1 and we multiply by 5 to
        //get a value between 0 and 5 bc we have 6 sides
        
    }
    //returns the side of the die object asa string

    /**
     * sets case statement for each side and what to return.
     * @return error if side doesnt exist
     */
    public String getSideAsString(){
        switch(side){
            case arrow:
                return "arrow";
            case dynamite:
                return "dynamite";
            case gatling:
                return "gatling";
            case one_shot:
                return "one Shot";
            case two_shot:
                return "two shot";
            case beer:
                return "beer";           
        }
        return "error";
    }
    
    /**
     * specific images of each side of the die
     * @return error if no side exists. 
     */
    public String getSideImageFL(){
        switch(side){
            case arrow:
                return "DiceImages/Arrow.PNG";
            case dynamite:
                return "DiceImages/Dynamite.PNG";
            case gatling:
                return "DiceImages/Gatling.PNG";
            case one_shot:
                return "DiceImages/One.PNG";
            case two_shot:
                return "DiceImages/Two.PNG";
            case beer:
                return "DiceImages/Beer.PNG";           
        }
        return "error";
    }

    /**
     * getter for each side of the die
     * @return specific side of die
     */
    public Sides getSide(){
        return this.side;
    }
    public void setSide(Die.Sides sideIn){
        this.side = sideIn;
    }

    /**
     * locks a side of the die
     */
    public void lockDie () {
        this.locked = true;
    }

    /**
     * unlocks a side of the die
     */
    public void unlockDie () {
        this.locked = false;
    }

    /**
     * a boolean true or false to see if the side is locked or not?
     * @return
     */
    public boolean isLocked (){
        return locked;
    }

    /**
     * created function for who is getting shot
     * @return who is getting shot from one shot two shot or double one shot or double two shot
     */
    public int getWhosGettingShot(){
        return this.whosGettingShot;
    }

    /**
     * function to set who is getting shot
     * @param player who is getting shot
     */
    public void setWhosGettingShot(int player){
        this.whosGettingShot = player;
    }

    /**
     * function to set who is getting a beer to heal for 1 bullet
     * @param player who is getting the beer
     */
    public void setWhosGettingABeer(int player){
        this.whosGettingABeer = player;
    }

    /**
     * function to get who is getting the beer
     * @return who is getting the beer
     */
    public int getWhosGettingABeer(){
        return this.whosGettingABeer;
    }
    public void setWhosGettingDueled(int player){
        this.whosGettingDueled = player;
    }
    public int getWhosGettingDueled(){
        return this.whosGettingDueled;
    }
    
}
