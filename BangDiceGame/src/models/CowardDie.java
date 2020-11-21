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
public class CowardDie {
    public enum Sides{arrow,
                      broken_arrow,
                      dynamite,
                      one_shot,
                      beer,
                      two_beer}; 
    //To use the Sides enum in other classes ues WhiteDie.Sides.arrow or whichever
    //you need.
    
    public Sides[] sidesList = Sides.values();
    //sidesList is created so we can access the sides enum by index Sides.values
    //retunrs the values of the enum as an array. This is used in the roll function

    private Sides side;  
    
              
    public CowardDie(){
       roll(); 
    }
    
    public void roll(){
        this.side = sidesList[(int)(Math.random() * 5)];
        //math .random retunrs a value between 0 and 1 and we multiply by 5 to
        //get a value between 0 and 5 bc we have 6 sides
        
    }
    //returns the side of the die object asa string
    public String getSideAsString(){
        switch(side){
            case arrow:
                return "arrow";
            case broken_arrow:
                return "broken arrow";
            case dynamite:
                return "dynamite";
            case one_shot:
                return "one Shot";
            case beer:
                return "beer";
            case two_beer:
                return "two beer";           
        }
        return "error";
    }
    public Sides getSide(){
        return side;
    }
}