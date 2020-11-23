/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Owner
 */
public class LoudmouthDie {
    public enum Sides{arrow,
                      bullet,
                      dynamite,
                      double_one,
                      double_two,
                      double_gatling}; 
    //To use the Sides enum in other classes ues WhiteDie.Sides.arrow or whichever
    //you need.
    
    public Sides[] sidesList = Sides.values();
    //sidesList is created so we can access the sides enum by index Sides.values
    //retunrs the values of the enum as an array. This is used in the roll function

    private Sides side;  
    
              
    public LoudmouthDie(){
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
            case bullet:
                return "bullet";
            case dynamite:
                return "dynamite";
            case double_one:
                return "double one";
            case double_two:
                return "double two";
            case double_gatling:
                return "double gatling";           
        }
        return "error";
    }
    public Sides getSide(){
        return side;
    }
}
