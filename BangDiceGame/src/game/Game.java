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
    protected ArrayList <EnumRoles> rolesList = new ArrayList<EnumRoles>(); 
    protected ArrayList <EnumCharacters> charsList = new ArrayList<EnumCharacters>();
    protected ArrayList <Player> players = new ArrayList<Player>();
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
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                break;
            case 5:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                break;
            case 6:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                break;
            case 7:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                break;
            case 8:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                break;
            default:
                System.out.println("idiot put in a correct number");
        }
        for (int i = 0; i < this.rolesList.size(); i++) { 
            int swapLocation = (int) (Math.random() * this.rolesList.size());
            EnumRoles tempCard1 = this.rolesList.get(swapLocation);
            EnumRoles tempCard2 = this.rolesList.get(i);
            this.rolesList.set(i, tempCard1);
            this.rolesList.set(swapLocation, tempCard2);
        }
        
    }
    
    private void addCharacters () {
        this.charsList.add(EnumCharacters.belleStar);
        this.charsList.add(EnumCharacters.paulRegret);
        this.charsList.add(EnumCharacters.jourdonnais);
        this.charsList.add(EnumCharacters.luckyDuke);
        this.charsList.add(EnumCharacters.pedroRamirez);
        this.charsList.add(EnumCharacters.gregDigger);
        this.charsList.add(EnumCharacters.elGringo);
        this.charsList.add(EnumCharacters.willyTheKid);
        this.charsList.add(EnumCharacters.tequilaJoe);
        this.charsList.add(EnumCharacters.joseDelgado);
        
        for (int i = 0; i < this.charsList.size(); i++) { 
            int swapLocation = (int) (Math.random() * this.charsList.size());
            EnumCharacters tempCard1 = this.charsList.get(swapLocation);
            EnumCharacters tempCard2 = this.charsList.get(i);
            this.charsList.set(i, tempCard1);
            this.charsList.set(swapLocation, tempCard2);
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
        
        if(this.charsList.get(x) == EnumCharacters.belleStar){
            belleStar a = new belleStar(this.rolesList.get(x));
            return a;
        }
        else if(this.charsList.get(x) == EnumCharacters.paulRegret){
            paulRegret b =  new paulRegret(this.rolesList.get(x));
            return b;
        }
        else if(this.charsList.get(x) == EnumCharacters.jourdonnais){
            jourdonnais c = new jourdonnais(this.rolesList.get(x));
            return c;
        }
        else if(this.charsList.get(x) == EnumCharacters.luckyDuke){
            luckyDuke d = new luckyDuke(this.rolesList.get(x));
            return d;
        }
        else if(this.charsList.get(x) == EnumCharacters.pedroRamirez){
            pedroRamirez e = new pedroRamirez(this.rolesList.get(x));
            return e;
        }
        else if(this.charsList.get(x) == EnumCharacters.gregDigger){
            gregDigger f = new gregDigger(this.rolesList.get(x));
            return f;
        }
        else if(this.charsList.get(x) == EnumCharacters.elGringo){
            elGringo g = new elGringo(this.rolesList.get(x));
            return g;
        }
        else if(this.charsList.get(x) == EnumCharacters.willyTheKid){
            willyTheKid h = new willyTheKid(this.rolesList.get(x));
            return h;
        }
        else if(this.charsList.get(x) == EnumCharacters.tequilaJoe){
            tequilaJoe i = new tequilaJoe(this.rolesList.get(x));
            return i;
        }
        else if (this.charsList.get(x) == EnumCharacters.joseDelgado){
            joseDelgado j = new joseDelgado(this.rolesList.get(x));
            return j;
        }
        
        else {
            return new Character(11,EnumRoles.Sheriff);
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
