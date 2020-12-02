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
    public enum Sides{
        arrow,
        dynamite,
        gatling,
        one_shot,
        two_shot,
        beer,
        double_one_shot,
        double_two_shot,
        double_gatling,
        bullet,
        double_beer,
        broken_arrow,
        duel,
        whiskey_bottle
    }; 
    public enum DieType {
      white,
      coward,
      loudmouth,
      black
    };
    //To use the Sides enum in other classes ues Die.Sides.arrow or whichever
    //you need.
    
    public Sides[] sidesList = Sides.values();
    //sidesList is created so we can access the sides enum by index Sides.values
    //retunrs the values of the enum as an array. This is used in the roll function

    protected Sides side;  
    
    protected boolean locked = false;
    protected boolean rerolled = false;
    protected int whosGettingShot = -1;
    protected int whosGettingABeer = -1;
    private DieType dieType;
    private ArrayList <Sides> validSides = new ArrayList <Sides>();
    
              
    public Die(DieType type){
        this.dieType = type;
        
       roll(); 
    }
    
    public void roll() {
        this.validSides.clear();
       if(this.dieType == DieType.white){
            this.validSides.add(Sides.arrow);
            this.validSides.add(Sides.beer);
            this.validSides.add(Sides.one_shot);
            this.validSides.add(Sides.two_shot);
            this.validSides.add(Sides.gatling);
            this.validSides.add(Sides.dynamite);
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
        this.side = validSides.get( (int)(Math.random() * 5) );
        this.locked = false;
        //math .random retunrs a value between 0 and 1 and we multiply by 5 to
        //get a value between 0 and 5 bc we have 6 sides
        
    }
    //returns the side of the die object asa string
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
    
    public String getSideImageFL(){
        switch(side){
            case arrow:
                return "DiceImages/Arrow.jpg";
            case dynamite:
                return "DiceImages/Dynamite.jpg";
            case gatling:
                return "DiceImages/Gatling.jpg";
            case one_shot:
                return "DiceImages/One.jpg";
            case two_shot:
                return "DiceImages/Two.jpg";
            case beer:
                return "DiceImages/Beer.jpg";           
        }
        return "error";
    }
    public Sides getSide(){
        return this.side;
    }
    public void lockDie () {
        this.locked = true;
    }
    public void unlockDie () {
        this.locked = false;
    }
    public boolean isLocked (){
        return locked;
    }

    public boolean isRerolled() {
        return rerolled;
    }

    public void setRerolled(boolean rerolled) {
        this.rerolled = rerolled;
    }
    public int getWhosGettingShot(){
        return this.whosGettingShot;
    }
    public void setWhosGettingShot(int player){
        this.whosGettingShot = player;
    }
    public void setWhosGettingABeer(int player){
        this.whosGettingABeer = player;
    }
    public int getWhosGettingABeer(){
        return this.whosGettingABeer;
    }
    
}
