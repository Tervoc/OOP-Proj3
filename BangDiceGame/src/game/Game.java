/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import models.Character;
import models.*;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Game {
    protected int bulletPile;
    protected int arrowPile;
    protected int numPlayers;
    protected ArrayList <Roles> rolesList; 
    protected ArrayList <charactersList> enumChars;
    protected ArrayList <Player> players;
    protected Player playerOne;
    protected Player playerTwo;
    protected Player playerThree;
    protected Player playerFour;
    protected Player playerFive;
    protected Player playerSix;
    protected Player playerSeven;
    protected Player playerEight;
    
    public Game (int numPlayers) {
        this.bulletPile = 70;
        this.arrowPile = 9; 
        this.numPlayers = numPlayers;
        
        this.addRoles();
        this.addCharacters();
        this.addPlayers();
        
        
        
    }
    private void addRoles () {
        switch(this.numPlayers){
            case 4:
                rolesList.add(Roles.Sheriff);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                break;
            case 5:
                rolesList.add(Roles.Sheriff);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                break;
            case 6:
                rolesList.add(Roles.Sheriff);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                break;
            case 7:
                rolesList.add(Roles.Sheriff);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                break;
            case 8:
                rolesList.add(Roles.Sheriff);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Deputy);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Renegade);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                rolesList.add(Roles.Outlaw);
                break;
            default:
                System.out.println("idiot put in a correct number");
        }
        for (int i = 0; i < this.rolesList.size(); i++) { 
            int swapLocation = (int) (Math.random() * this.rolesList.size());
            Roles tempCard1 = this.rolesList.get(swapLocation);
            Roles tempCard2 = this.rolesList.get(i);
            this.rolesList.set(i, tempCard1);
            this.rolesList.set(swapLocation, tempCard2);
        }
        
    }
    
    private void addCharacters () {
        this.enumChars.add(charactersList.belleStar);
        this.enumChars.add(charactersList.paulRegret);
        this.enumChars.add(charactersList.jourdonnais);
        this.enumChars.add(charactersList.luckyDuke);
        this.enumChars.add(charactersList.pedroRamirez);
        this.enumChars.add(charactersList.gregDigger);
        this.enumChars.add(charactersList.elGringo);
        this.enumChars.add(charactersList.willyTheKid);
        this.enumChars.add(charactersList.tequilaJoe);
        this.enumChars.add(charactersList.joseDelgado);
        
        for (int i = 0; i < this.enumChars.size(); i++) { 
            int swapLocation = (int) (Math.random() * this.enumChars.size());
            charactersList tempCard1 = this.enumChars.get(swapLocation);
            charactersList tempCard2 = this.enumChars.get(i);
            this.enumChars.set(i, tempCard1);
            this.enumChars.set(swapLocation, tempCard2);
        }
    }
    
    private void addPlayers () {
        
        switch(this.numPlayers){
            case 4: 
                this.playerOne = new Player(assignCharacter(0));
                this.playerTwo = new Player(assignCharacter(1));
                this.playerThree = new Player(assignCharacter(2));
                this.playerFour = new Player(assignCharacter(3));
                
                this.players.add(playerOne);
                this.players.add(playerTwo);
                this.players.add(playerThree);
                this.players.add(playerFour);
                break;
            case 5:
                this.playerOne = new Player(assignCharacter(0));
                this.playerTwo = new Player(assignCharacter(1));
                this.playerThree = new Player(assignCharacter(2));
                this.playerFour = new Player(assignCharacter(3));
                this.playerFive = new Player(assignCharacter(4));
                
                this.players.add(playerOne);
                this.players.add(playerTwo);
                this.players.add(playerThree);
                this.players.add(playerFour);
                this.players.add(playerFive);
                break;
            case 6:
                this.playerOne = new Player(assignCharacter(0));
                this.playerTwo = new Player(assignCharacter(1));
                this.playerThree = new Player(assignCharacter(2));
                this.playerFour = new Player(assignCharacter(3));
                this.playerFive = new Player(assignCharacter(4));
                this.playerSix = new Player(assignCharacter(5));
                
                this.players.add(playerOne);
                this.players.add(playerTwo);
                this.players.add(playerThree);
                this.players.add(playerFour);
                this.players.add(playerFive);
                this.players.add(playerSix);
                break;
            case 7:
                this.playerOne = new Player(assignCharacter(0));
                this.playerTwo = new Player(assignCharacter(1));
                this.playerThree = new Player(assignCharacter(2));
                this.playerFour = new Player(assignCharacter(3));
                this.playerFive = new Player(assignCharacter(4));
                this.playerSix = new Player(assignCharacter(5));
                this.playerSeven = new Player(assignCharacter(6));
                this.players.add(playerOne);
                this.players.add(playerTwo);
                this.players.add(playerThree);
                this.players.add(playerFour);
                this.players.add(playerFive);
                this.players.add(playerSix);
                this.players.add(playerSeven);
                
                break;
            case 8:
                this.playerOne = new Player(assignCharacter(0));
                this.playerTwo = new Player(assignCharacter(1));
                this.playerThree = new Player(assignCharacter(2));
                this.playerFour = new Player(assignCharacter(3));
                this.playerFive = new Player(assignCharacter(4));
                this.playerSix = new Player(assignCharacter(5));
                this.playerSeven = new Player(assignCharacter(6));
                this.playerEight = new Player(assignCharacter(7));
                
                this.players.add(playerOne);
                this.players.add(playerTwo);
                this.players.add(playerThree);
                this.players.add(playerFour);
                this.players.add(playerFive);
                this.players.add(playerSix);
                this.players.add(playerSeven);
                this.players.add(playerEight);
                break;
            default:
                System.out.println("error, Idiot");
        }
    }
    
    private Character assignCharacter (int x) {
        
        if(this.enumChars.get(x) == charactersList.belleStar){
            belleStar a = new belleStar(this.rolesList.get(x));
            return a;
        }
        else if(this.enumChars.get(x) == charactersList.paulRegret){
            paulRegret b =  new paulRegret(this.rolesList.get(x));
            return b;
        }
        else if(this.enumChars.get(x) == charactersList.jourdonnais){
            jourdonnais c = new jourdonnais(this.rolesList.get(x));
            return c;
        }
        else if(this.enumChars.get(x) == charactersList.luckyDuke){
            luckyDuke d = new luckyDuke(this.rolesList.get(x));
            return d;
        }
        else if(this.enumChars.get(x) == charactersList.pedroRamirez){
            pedroRamirez e = new pedroRamirez(this.rolesList.get(x));
            return e;
        }
        else if(this.enumChars.get(x) == charactersList.gregDigger){
            gregDigger f = new gregDigger(this.rolesList.get(x));
            return f;
        }
        else if(this.enumChars.get(x) == charactersList.elGringo){
            elGringo g = new elGringo(this.rolesList.get(x));
            return g;
        }
        /*else if(this.enumChars.get(x) == charactersList.willyTheKid){
            willyTheKid h
            return new willyTheKid(this.rolesList.get(x));
        }*/
        /*else if(this.enumChars.get(x) == charactersList.tequilaJoe){
            tequilaJoe i
            return new tequilaJoe(this.rolesList.get(x));
        }*/
        else if (this.enumChars.get(x) == charactersList.joseDelgado){
            joseDelgado j = new joseDelgado(this.rolesList.get(x));
            return j;
        }
        
        else {
            return new Character(11,Roles.Sheriff);
        }
            
    }
    
    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Player getPlayerThree() {
        return playerThree;
    }

    public Player getPlayerFour() {
        return playerFour;
    }

    public Player getPlayerFive() {
        return playerFive;
    }

    public Player getPlayerSix() {
        return playerSix;
    }

    public Player getPlayerSeven() {
        return playerSeven;
    }

    public Player getPlayerEight() {
        return playerEight;
    }
    
    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    public void indianAttack () {
        
    }
}
