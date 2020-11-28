/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;
import java.lang.Math; 
/**
 *
 * @author Troll
 */
//instantiatting the die class creates an object with a random Sides value
public class WhiteDie {
    public enum Sides{
        arrow,
        dynamite,
        gatling,
        one_shot,
        two_shot,
        beer}; 
    //To use the Sides enum in other classes ues WhiteDie.Sides.arrow or whichever
    //you need.
    
    public Sides[] sidesList = Sides.values();
    //sidesList is created so we can access the sides enum by index Sides.values
    //retunrs the values of the enum as an array. This is used in the roll function

    private Sides side;  
    
    private boolean locked = false;
    private boolean rerolled = false;
    private int whosGettingShot = -1;
    private int whosGettingABeer = -1;
    
              
    public WhiteDie(){
       roll(); 
    }
    
    public void roll(){
        whosGettingShot = -1;
        whosGettingABeer = -1;
        this.side = sidesList[(int)(Math.random() * 5)];
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
        return side;
    }
    public void lockDie () {
        this.locked = true;
    }
    /*public void unlockDie () {
        this.locked = false;
    }*/
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
