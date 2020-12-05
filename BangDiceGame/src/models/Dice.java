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
public class Dice {
    private ArrayList<Die> dice = new ArrayList<Die>();
    private final int numDie;
    
    /**
     * creates array list of all dices
     * @param whiteDie
     * @param cowardDie
     * @param loudmouthDie
     * @param blackDie
     */
    public Dice(int whiteDie, int cowardDie, int loudmouthDie, int blackDie){
        this.numDie = whiteDie+cowardDie+loudmouthDie+blackDie;
        for(int i=0; i<whiteDie; i++){
            dice.add(new Die(Die.DieType.white)); 
        }
        for(int i=0; i<cowardDie; i++){
            dice.add(new Die(Die.DieType.coward)); 
        }
        for(int i=0; i<loudmouthDie; i++){
            dice.add(new Die(Die.DieType.loudmouth)); 
        }
        for(int i=0; i<blackDie; i++){
            dice.add(new Die(Die.DieType.black)); 
        }
    }

    /**
     * roll die whether 5 or 6 depending on the characters
     * @param i
     */
    public void rollDice(int i){
        dice.get(i).roll();
    }

    /**
     * Roll all dice whether 5 or 6 depending on character
     */
    public void rollAllDice(){
        for(int i=0; i<numDie; i++){
            dice.get(i).roll();
        }
    }
   //just ignore this function it doesnt work like i wanted it too

    /**
     * rerollDice each dice integer a - f
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     */
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

    /**
     * printDice to the user
     */
    public void printDice(){ 
        for(int i=0; i<numDie; i++){
            System.out.println(dice.get(i).getSideAsString());
        }
    }
    
    //returns list of enum values instead of die objects

    /**
     * array list of all sides of the dice
     * @return
     */
    public ArrayList<Die.Sides> getDiceSides(){
        ArrayList<Die.Sides> diceEnums = new ArrayList<Die.Sides>();
        for(int i=0; i<numDie; i++){
            diceEnums.set(i,dice.get(i).getSide());
        }
        return diceEnums;
    }
    //returns array of Die objects to get the side of a certian Die call dice[i].getSide()

    /**
     * getter of ArrayList die
     * @return dice
     */
    public ArrayList<Die> getDice(){
        return dice;
    }
    
    /**
     * getter for number of dice being used
     * @return numDie
     */
    public int getNumDice(){
        return numDie;
    }
}
