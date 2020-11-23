/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Troll
 */
public class DiceBase {
    private ArrayList<WhiteDie> dice = new ArrayList<WhiteDie>();
    private final int numDie;
    
    public DiceBase(int numDie){
        this.numDie = numDie;
        rollDice();
    }
    
    public void rollDice(){
        for(int i=0; i<numDie; i++){
            dice.add(new WhiteDie()); 
        }
    }
    public void rerollAllDice(){
        for(int i=0; i<numDie; i++){
            dice.get(i).roll();
        }
    }
    public void rerollDice(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f){
        //you can specify up too 6 dice to re roll, all arguments are optional
        //I thought this might be useful to say I want to reroll dice 1 2 and 4
        //it can also be used to just reroll single dice ina for loop 
        Integer[] indecies = {a,b,c,d,e,f};
        for(int i=0; i<6; i++){
            if(indecies[i] != null && indecies[i] < numDie){
                dice.get(indecies[i]).roll();
            }
        }
    }
    
    //prints the sides of the dice to the consol
    public void printDice(){ 
        for(int i=0; i<numDie; i++){
            System.out.println(dice.get(i).getSideAsString());
        }
    }
    
    //returns list of enum values instead of die objects
    public ArrayList<WhiteDie.Sides> getDiceSides(){
        ArrayList<WhiteDie.Sides> diceEnums = new ArrayList<WhiteDie.Sides>();
        for(int i=0; i<numDie; i++){
            diceEnums.set(i,dice.get(i).getSide());
        }
        return diceEnums;
    }
    //returns array of WhiteDie objects to get the side of a certian WhiteDie call dice[i].getSide()
    public ArrayList<WhiteDie> getDice(){
        return dice;
    }
    
    public int getNumDice(){
        return numDie;
    }
}
