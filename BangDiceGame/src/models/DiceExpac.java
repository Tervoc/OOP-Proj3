/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package models;
//import java.util.ArrayList;
//
///**
// *
// * @author Troll
// */
//public class DiceExpac {
//    private ArrayList dice = new ArrayList ();
//
//    
//    private final int diceChoice;
//    
//    
//    public DiceExpac(int diceChoice){
//        this.diceChoice = diceChoice;
//        switch(diceChoice) {
//            case 0:
//                this.dice.add(new WhiteDie());
//                this.dice.add(new WhiteDie());
//                this.dice.add(new WhiteDie());
//                this.dice.add(new BlackDie());
//                this.dice.add(new BlackDie());
//            case 1:
//                this.dice.add(new WhiteDie());
//                this.dice.add(new WhiteDie());
//                this.dice.add(new LoudmouthDie());
//                this.dice.add(new BlackDie());
//                this.dice.add(new BlackDie());
//            case 2:
//                this.dice.add(new WhiteDie());
//                this.dice.add(new WhiteDie());
//                this.dice.add(new CowardDie());
//                this.dice.add(new BlackDie());
//                this.dice.add(new BlackDie());
//                
//        }
//    }
//    
//    
//
//    public void rerollAllDice(){
//       switch(diceChoice) {
//           case 0:
//                this.dice.set(0, new WhiteDie());
//                this.dice.set(1, new WhiteDie());
//                this.dice.set(2, new WhiteDie());
//                this.dice.set(3, new BlackDie());
//                this.dice.set(4, new BlackDie());
//           case 1:
//                this.dice.set(0, new WhiteDie());
//                this.dice.set(1, new WhiteDie());
//                this.dice.set(2, new LoudmouthDie());
//                this.dice.set(3, new BlackDie());
//                this.dice.set(4, new BlackDie());
//           case 2:
//                this.dice.set(0, new WhiteDie());
//                this.dice.set(1, new WhiteDie());
//                this.dice.set(2, new CowardDie());
//                this.dice.set(3, new BlackDie());
//                this.dice.set(4, new BlackDie());
//       }
//       
//
//      }
//    
//    public void rerollDice(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f){
//        //you can specify up too 6 dice to re roll, all arguments are optional
//        //I thought this might be useful to say I want to reroll dice 1 2 and 4
//        //it can also be used to just reroll single dice ina for loop 
//        Integer[] indecies = {a,b,c,d,e,f};
//        for(int i=0; i<6; i++){
//            if(indecies[i] != null && indecies[i] < numDie){
//                dice[indecies[i]].roll();
//            }
//        }
//    }
//    
//    //prints the sides of the dice to the console
//    public void printDice(){ 
//        for(int i=0; i<numDie; i++){
//            System.out.println(dice[i].getSideAsString());
//        }
//    }
//    
//    //returns list of enum values instead of die objects
//    public WhiteDie.Sides[] getDiceSides(){
//        WhiteDie.Sides[] diceEnums = null;
//        for(int i=0; i<numDie; i++){
//            diceEnums[i] = dice[i].getSide();
//        }
//        return diceEnums;
//    }
//    //returns array of WhiteDie objects to get the side of a certian WhiteDie call dice[i].getSide()
//    public WhiteDie[] getDice(){
//        return dice;
//    }
//    
//    public int getNumDice(){
//        return numDie;
//    }
//}

