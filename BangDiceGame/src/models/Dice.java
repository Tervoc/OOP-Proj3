/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Troll
 */
public class Dice {
    private Die[] dice;
    private final int numDie;
    
    public Dice(int numDie){
        this.numDie = numDie;
        rollDice();
    }
    
    public void rollDice(){
        for(int i=0; i<numDie; i++){
            dice[i] = new Die(); 
        }
    }
    public void rerollAllDice(){
        for(int i=0; i<numDie; i++){
            dice[i].roll();
        }
    }
    public void rerollDice(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f){
        //you can specify up too 6 dice to re roll, all arguments are optional
        //I thought this might be useful to say I want to reroll dice 1 2 and 4
        //it can also be used to just reroll single dice ina for loop 
        Integer[] indecies = {a,b,c,d,e,f};
        for(int i=0; i<6; i++){
            if(indecies[i] != null && indecies[i] < numDie){
                dice[indecies[i]].roll();
            }
        }
    }
    //returns array of Die objects to get the side of a certian Die call dice[i].getSide()
    public Die[] getDice(){
        return dice;
    }
}
