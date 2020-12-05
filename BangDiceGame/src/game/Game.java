/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import models.Character;
import models.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * This is a game class for the game BANG!
 * @see import models.Character
 * @see import models.*
 * @see java.util.ArrayList
 * 
 * @author Christian, Darrel, Andrew
 * Java doc Editor Michael
 */
public class Game {

    /**
     * Creates a integer variable <em> bulletPile </em> 
     */
    protected int bulletPile = 100;

    /**
     * Creates a integer variable <em> arrowPile </em> 
     */
    protected int arrowPile;

    /**
     * Creates a integer variable <em> chiefArrow </em> 
     */
    protected int chiefArrow;

    /**
     * Creates a integer variable <em> numPlayers </em> 
     */
    protected int numPlayers;

    /**
     * Creates a integer variable <em> numBrokenArrow </em> 
     */
    protected int numBrokenArrow;

    /**
     * Creates a integer variable <em> numBullets </em> 
     */
    protected int numBullet;

    /**
     * Creates a integer variable <em> numDynamite </em> 
     */
    protected int numDynamite;

    /**
     * Creates a integer variable <em> numWhiskey </em> 
     */
    protected int numWhiskey;

    /**
     * Creates a integer variable <em> numGatling </em> 
     */
    protected int numGatling;

    /**
     * Creates a integer variable <em> numDoubleGatling </em> 
     */
    protected int numDoubleGatling;

    /**
     * Creates a integer variable <em> numBeer </em> 
     */
    protected int numBeer;

    /**
     * Creates a integer variable <em> numOneShot </em> 
     */

    protected int numOneShot;

    /**
     * Creates a integer variable <em> numTwoShot </em> 
     */
    protected int numTwoShot;

    /**
     * Creates a integer variable <em> numDuel </em> 
     */
    protected int numDuel;

    /**
     * Creates a integer variable <em> numOutlaws </em> 
     */

    protected int numOutlaws;

    /**
     * Creates a integer variable <em> numRenegades </em> 
     */
    protected int numRenegades;

    /**
     * Creates an ArrayLisr of number of roles <em> enumRoles </em>
     * Calls defined roleList
     * And creates a <em> new ArrayList of enumRoles </em>
     */
    protected ArrayList<EnumRoles> rolesList = new ArrayList<EnumRoles>();

    /**
     * Creates an ArrayLisr of number of Characters <em> enumCharacters </em>
     * Calls defined charsList
     * And creates a <em> new ArrayList of enumCharacters </em>
     */
    protected ArrayList<EnumCharacters> charsList = new ArrayList<EnumCharacters>();

    /**
     * Creates an ArrayLisr of number of players <em> Player </em>
     * Calls defined number of players
     * And creates a <em> new ArrayList Player </em>
     */
    protected ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Player> playersReference = new ArrayList<Player>();
    
    /**
     * Creates an ArrayList of number of duel tokens <em> duelTokens </em>
     */
    protected ArrayList <EnumDuelTokens> duelTokens = new ArrayList <EnumDuelTokens> ();

    /**
     * Creates an int array of ordered dice of a total of 5
     */
    protected int[] orderedDice = new int[5];

    /**
     * Creates a defaulted boolean for sherrifWin
     * Sets <em> sherriifWin to False </em>
     */
    protected boolean sheriffWin = false;

    /**
     * Creates a defaulted boolean for outlawWin
     * Sets <em> outlawWin to False </em>
     */
    protected boolean outlawWin = false;

    /**
     * Creates a defaulted boolean for renegadeWin
     * Sets <em> renegadeWin to False </em>
     */
    protected boolean renegadeWin = false;

    /**
     * Creates a defaulted boolean for taking the chief arrow
     * Sets <em> takeChieffArrow to false </em>
     */
    protected boolean takeChiefArrow = false;

    /**
     * Creates a defaulted boolean for removing broken arrow
     * Sets <em> removeBrokenarrow to false </em>
     */
    protected boolean removeBrokenArrow = false;
    
    private int numGameDice = 5;
    private int numWhiteDie;
    private int numCowardDie;
    private int numLoudmouthDie;
    private int numBlackDie;
    private int turnRolls = 0;
    private Dice gameDice;
    private Player currentPlayer;
    private int currentPlayerNumber;

    public Game(int numPlayers, boolean isExpansionSelected) {
        this.bulletPile = 70;
        this.arrowPile = 9;
        this.chiefArrow = 1;
        this.numPlayers = numPlayers;

        this.addRoles();
        this.addCharacters();
        this.addPlayers();
        this.addDuelTokens();

        this.playersReference = players;
        currentPlayer = players.get(0);
        currentPlayerNumber = 0;
        if(isExpansionSelected){
            this.gameDice = new Dice(4,1,1,0);
        }else{
            this.gameDice = new Dice(5, 0, 0, 0);
        }
        this.currentPlayer = this.players.get(0);
        this.currentPlayerNumber = 0;


    }

    /**
     * Function to figure out which player is next in turn
     */
    public void nextTurn() {
        turnRolls = 0;
        for(int i=0; i<5; i++){
            gameDice.getDice().get(i).unlockDie();
        }
        boolean findNextPlayer = true;
        while(findNextPlayer){
            if (this.currentPlayerNumber == this.numPlayers) {
                this.currentPlayerNumber = 0;
            } else {
                this.currentPlayerNumber++;
            }
            if(!this.players.get(this.currentPlayerNumber).amIDead()){
                this.currentPlayer = this.players.get(this.currentPlayerNumber);
                findNextPlayer = false;
            }

        }
    }

    private void addRoles() {
        switch (this.numPlayers) {
            case 4:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                this.numOutlaws = 2;
                this.numRenegades = 1;
                break;
            case 5:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                this.numOutlaws = 2;
                this.numRenegades = 1;
                break;
            case 6:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                this.numOutlaws = 3;
                this.numRenegades = 1;
                break;
            case 7:
                rolesList.add(EnumRoles.Sheriff);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Deputy);
                rolesList.add(EnumRoles.Renegade);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                rolesList.add(EnumRoles.Outlaw);
                this.numOutlaws = 3;
                this.numRenegades = 1;
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
                this.numOutlaws = 3;
                this.numRenegades = 2;
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

    private void addCharacters() {
        this.charsList.add(EnumCharacters.belleStar);
        this.charsList.add(EnumCharacters.paulRegret);
        this.charsList.add(EnumCharacters.jourdonnais);
        this.charsList.add(EnumCharacters.luckyDuke);
        this.charsList.add(EnumCharacters.pedroRamirez);
        this.charsList.add(EnumCharacters.gregDigger);
        this.charsList.add(EnumCharacters.elGringo);
        this.charsList.add(EnumCharacters.willyTheKid);
        this.charsList.add(EnumCharacters.apacheKid);
        this.charsList.add(EnumCharacters.billNoFace);

        for (int i = 0; i < this.charsList.size(); i++) {
            int swapLocation = (int) (Math.random() * this.charsList.size());
            EnumCharacters tempCard1 = this.charsList.get(swapLocation);
            EnumCharacters tempCard2 = this.charsList.get(i);
            this.charsList.set(i, tempCard1);
            this.charsList.set(swapLocation, tempCard2);
        }
    }

    private void addPlayers() {

        switch (this.numPlayers) {
            case 4:
                this.players.add(new Player(assignCharacter(0)));
                this.players.add(new Player(assignCharacter(1)));
                this.players.add(new Player(assignCharacter(2)));
                this.players.add(new Player(assignCharacter(3)));
                break;
            case 5:
                this.players.add(new Player(assignCharacter(0)));
                this.players.add(new Player(assignCharacter(1)));
                this.players.add(new Player(assignCharacter(2)));
                this.players.add(new Player(assignCharacter(3)));
                this.players.add(new Player(assignCharacter(4)));
                break;
            case 6:
                this.players.add(new Player(assignCharacter(0)));
                this.players.add(new Player(assignCharacter(1)));
                this.players.add(new Player(assignCharacter(2)));
                this.players.add(new Player(assignCharacter(3)));
                this.players.add(new Player(assignCharacter(4)));
                this.players.add(new Player(assignCharacter(5)));
                break;
            case 7:
                this.players.add(new Player(assignCharacter(0)));
                this.players.add(new Player(assignCharacter(1)));
                this.players.add(new Player(assignCharacter(2)));
                this.players.add(new Player(assignCharacter(3)));
                this.players.add(new Player(assignCharacter(4)));
                this.players.add(new Player(assignCharacter(5)));
                this.players.add(new Player(assignCharacter(6)));

                break;
            case 8:
                this.players.add(new Player(assignCharacter(0)));
                this.players.add(new Player(assignCharacter(1)));
                this.players.add(new Player(assignCharacter(2)));
                this.players.add(new Player(assignCharacter(3)));
                this.players.add(new Player(assignCharacter(4)));
                this.players.add(new Player(assignCharacter(5)));
                this.players.add(new Player(assignCharacter(6)));
                this.players.add(new Player(assignCharacter(7)));
                break;
            default:
                System.out.println("error, Idiot");
        }
    }

    private Character assignCharacter(int x) {

        if (this.charsList.get(x) == EnumCharacters.belleStar) {
            belleStar a = new belleStar(this.rolesList.get(x));
            return a;
        } else if (this.charsList.get(x) == EnumCharacters.paulRegret) {
            paulRegret b = new paulRegret(this.rolesList.get(x));
            return b;
        } else if (this.charsList.get(x) == EnumCharacters.jourdonnais) {
            jourdonnais c = new jourdonnais(this.rolesList.get(x));
            return c;
        } else if (this.charsList.get(x) == EnumCharacters.luckyDuke) {
            luckyDuke d = new luckyDuke(this.rolesList.get(x));
            return d;
        } else if (this.charsList.get(x) == EnumCharacters.pedroRamirez) {
            pedroRamirez e = new pedroRamirez(this.rolesList.get(x));
            return e;
        } else if (this.charsList.get(x) == EnumCharacters.gregDigger) {
            gregDigger f = new gregDigger(this.rolesList.get(x));
            return f;
        } else if (this.charsList.get(x) == EnumCharacters.elGringo) {
            elGringo g = new elGringo(this.rolesList.get(x));
            return g;
        } else if (this.charsList.get(x) == EnumCharacters.willyTheKid) {
            willyTheKid h = new willyTheKid(this.rolesList.get(x));
            return h;
        } else if (this.charsList.get(x) == EnumCharacters.apacheKid) {
            apacheKid i = new apacheKid(this.rolesList.get(x));
            return i;
        } else if (this.charsList.get(x) == EnumCharacters.billNoFace) {
            billNoFace j = new billNoFace(this.rolesList.get(x));
            return j;
        } else {
            return new Character(11, EnumRoles.Sheriff);
        }

    }
    
    private void addDuelTokens () {
        this.duelTokens.add(EnumDuelTokens.beer);
        this.duelTokens.add(EnumDuelTokens.beer);
        this.duelTokens.add(EnumDuelTokens.beer);
        this.duelTokens.add(EnumDuelTokens.oneShot);
        this.duelTokens.add(EnumDuelTokens.oneShot);
        this.duelTokens.add(EnumDuelTokens.oneShot);
        this.duelTokens.add(EnumDuelTokens.oneShot);
        this.duelTokens.add(EnumDuelTokens.oneShot);
        this.duelTokens.add(EnumDuelTokens.twoShot);
        this.duelTokens.add(EnumDuelTokens.twoShot);
        this.duelTokens.add(EnumDuelTokens.twoShot);
        this.duelTokens.add(EnumDuelTokens.twoShot);
        this.duelTokens.add(EnumDuelTokens.twoShot);
        this.duelTokens.add(EnumDuelTokens.dynamite);
        this.duelTokens.add(EnumDuelTokens.dynamite);
        
        for (int i = 0; i < this.duelTokens.size(); i++) {
            int swapLocation = (int) (Math.random() * this.duelTokens.size());
            EnumDuelTokens tempCard1 = this.duelTokens.get(swapLocation);
            EnumDuelTokens tempCard2 = this.duelTokens.get(i);
            this.duelTokens.set(i, tempCard1);
            this.duelTokens.set(swapLocation, tempCard2);
        }
    }

    /**
     *
     */
    public void interpretRoll() {
        this.turnRolls++;
        if (this.turnRolls == 1) {
            this.numDynamite = 0;
            this.numBeer = 0;
            this.numGatling = 0;
            this.numOneShot = 0;
            this.numTwoShot = 0;
            for (int i = 0; i < this.numGameDice; i++) {
                if ( (this.gameDice.getDice().get(i).getSide() == Die.Sides.arrow) && (this.currentPlayer.getMyCharacter().getCharType() != EnumCharacters.billNoFace) ){
                    if (takeChiefArrow && this.chiefArrow == 0) {
                        this.currentPlayer.addChiefArrow(this);
                        this.takeChiefArrow = false;
                    }
                    this.currentPlayer.addArrows(1, this);

                    if (this.getArrowPile() <= 0) {
                        this.indianAttack();
                    }
                }
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.broken_arrow) {
                    if (removeBrokenArrow){
                        this.currentPlayer.removeArrows(1, this);
                    }
                    this.removeBrokenArrow = false;
                    
                }
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.bullet) {
                    this.currentPlayer.removeBullets(1, this);
                }
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.dynamite) {
                    this.numDynamite += 1;
                    this.gameDice.getDice().get(i).lockDie();
                    if (this.numDynamite >= 3) {
                        this.currentPlayer.removeBullets(1, this);
                        this.turnRolls = 3;
                        //next turn?
                        break;
                    }
                }
            }
        }
        
        else if (turnRolls <= 3 || ( (currentPlayer.getMyCharacter().getCharType() == EnumCharacters.luckyDuke) && turnRolls <=4)) {
            for (int i = 0; i < numGameDice; i++) {
                if (gameDice.getDice().get(i).getSide() == Die.Sides.arrow && (this.currentPlayer.getMyCharacter().getCharType() != EnumCharacters.billNoFace)) {
                    if (takeChiefArrow && this.chiefArrow == 0) {
                        this.currentPlayer.addChiefArrow(this);
                        this.takeChiefArrow = false;
                    }
                    this.currentPlayer.addArrows(1, this);

                    if (this.getArrowPile() <= 0) {
                        this.indianAttack();
                    }
                } 
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.broken_arrow) {
                    if (removeBrokenArrow){
                        this.currentPlayer.removeArrows(1, this);
                    }
                    this.removeBrokenArrow = false;
                    
                }
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.bullet) {
                    this.currentPlayer.removeBullets(1, this);
                }
                else if (gameDice.getDice().get(i).getSide() == Die.Sides.dynamite) {
                    this.numDynamite += 1;
                    gameDice.getDice().get(i).lockDie();
                    if (this.numDynamite >= 3) {
                        this.turnRolls = 3;
                        this.currentPlayer.removeBullets(1, this);
                        //next turn?
                        break;
                    }
                }
            }
        }
    }

    /**
     * Function to use roll
     * Takes the game dice and re-rolls all 5 dice
     */
    public void useRoll() {
//       Dice tempDice = this.gameDice;
//
//       for (int i = 0; i < numGameDice; i++) {
//           orderedDice[i] = this.gameDice.getDice().get(i).getSide().ordinal();
//       }
//       
//       Arrays.sort(orderedDice);
//       
//       for(int i = 0; i < orderedDice.length;i++) {
//           tempDice.getDice().get(i).setSide(Die.sidesList[orderedDice[i]] );
//       }
//       
//       this.gameDice = tempDice;
       
       for(int i = 0; i < this.numGameDice;i++) {
           switch(this.gameDice.getDice().get(i).getSide().ordinal()) {
               case (0): 
                    if ( (currentPlayer.getMyCharacter().getCharType() == EnumCharacters.billNoFace) ) {
                    currentPlayer.addArrows(1, this);

                    if (this.getArrowPile() <= 0) {
                        this.indianAttack();
                        this.arrowPile = 9;
                        }
                    }
                   break;
               case (4):
                   this.useWhiskey();
                   break;
               case (5):
                   this.useOneShot(i);
                   break;
               case (6):
                   this.useOneShot(i);
                   this.useOneShot(i);
                   break;
               case (7):
                   this.useTwoShot(i);
                   break;
               case (8):
                   this.useTwoShot(i);
                   this.useTwoShot(i);
                   break;
               case (9):
                   this.useBeer(i);
                   break;
               case (10):
                   this.useBeer(i);
                   this.useBeer(i);
                   break;
               case (11):
                   this.numGatling++;
                   break;
               case (12):
                   this.numGatling += 2;
                   break;
               case (13):
                   this.duel(gameDice.getDice().get(i).getWhosGettingDueled());
                   break;
           }
       }
       
        if ( (this.numGatling >= 3 ) || ( (this.currentPlayer.getMyCharacter().getCharType() == EnumCharacters.willyTheKid) && (this.numGatling  >= 2) ) ) {
            this.useGatling();
        }

    }

    /**
     * Function to set the initial roll to be between any of the dice listed
     * white, coward, loudmouth, and black
     */
    public void initRoll() {
        this.gameDice = new Dice(this.numWhiteDie, this.numCowardDie, this.numLoudmouthDie, this.numBlackDie);
    }
     
    /**
     * function to take all the dice and roll them
     */
    public void rollDice() {
        
        gameDice.rollAllDice();

    }

    /**
     * Creates an integer i for each dice being rolled from 1 - 5
     * @param i
     */
    public void rollDice(int i) {
        this.gameDice.rollDice(i);
    }
    
    /**
     * Function for AI capability to play the game through the GUI with computers as other players
     */
    public void playsOutTurns () {
       
        Random rand = new Random();
        for(int i = 0; i < numPlayers; i++)
        {
            
           //initRoll();
           for(int j = 0; j < numGameDice; j++) {
            gameDice.rollDice(j);
            interpretRoll();
            //.gameDice.rollDice(i); 
            //this.game.getGameDice().getDice().get(i).setWhosGettingShot(index in player list);
            //this.game.getGameDice().getDice().get(i).setWhosGettingABeer(index in player list);
            
            if(gameDice.getDice().get(j).getSide() == Die.Sides.beer )
            {    
                //gameDice.getDice().get(j).isLocked();
                int randValue = rand.nextInt() % 2;
                if(randValue == 0)
                {
                    
                }
                else if(randValue == 1) 
                {
                gameDice.getDice().get(j).isLocked();  
                }   
            }
            else if(gameDice.getDice().get(j).getSide() == Die.Sides.one_shot)
            {
                //gameDice.getDice().get(j).isLocked();
                int randValue = rand.nextInt() % 2;
                if(randValue == 0)
                {
                   
                }
                else if(randValue == 1) 
                {
                gameDice.getDice().get(j).isLocked();  
                }
            }
            else if(gameDice.getDice().get(j).getSide() == Die.Sides.two_shot)
            {
                //gameDice.getDice().get(j).isLocked();
                int randValue = rand.nextInt() % 2;
                if(randValue == 0)
                {
                   
                }
                else if(randValue == 1) 
                {
                gameDice.getDice().get(j).isLocked();  
                }
            }
            
            this.gameDice.rollDice(j); //roll dice
            useRoll(); //then use roll
            nextTurn();//then next turn  
           }
        }
   }
       //this.players().get(gameDice)
       //this.nextTurn().get(currentPlayer).get(gameDice) initRoll;
           
       

    /**
     * Function to use beer if the die rolls beer
     * @param die
     */
    public void useBeer(int die) {
        players.get(gameDice.getDice().get(die).getWhosGettingABeer()).addBullets(1, this);
    }
    
    /**
     * Function to use Whiskey Bottle if die rolls Whiskey Bottle
     */
    public void useWhiskey () {
        this.currentPlayer.addBullets(1, this);
        if (this.currentPlayer.getMyDuelTokens().size() > 0) {
            this.removeDuelToken(currentPlayer);
        }
    }
    
    /**
     * 
     * @param playerToDuel
     */
    public void duel (int playerToDuel) {
        Die duelDie = new Die(Die.DieType.black);
        if(duelDie.getSide() != Die.Sides.duel) {
            this.giveDuelToken(this.players.get(playerToDuel));
        }
        else {
            while (true) {
                duelDie.roll();
                if(duelDie.getSide() != Die.Sides.duel) {
                    this.giveDuelToken(this.currentPlayer);
                    break;
                }
                duelDie.roll();
                if(duelDie.getSide() != Die.Sides.duel) {
                    this.giveDuelToken(this.players.get(playerToDuel));
                    break;
                }
            }
        }
    }

    /**
     * Function to use one shot on which players left or right of the player
     * @param die
     */
    public void useOneShot(int die) {
        players.get(gameDice.getDice().get(die).getWhosGettingShot()).removeBullets(1, this);
        if (players.get(gameDice.getDice().get(die).getWhosGettingShot()).getMyCharacter().getCharType() == EnumCharacters.elGringo ){
            currentPlayer.addArrows(1, this);
        }
        

    }

    /**
     * Function to use two shot on which players are two down left or right from the current player in turn
     * @param die
     */
    public void useTwoShot(int die) {
        
        players.get(gameDice.getDice().get(die).getWhosGettingShot()).removeBullets(1, this);
        if (players.get(gameDice.getDice().get(die).getWhosGettingShot()).getMyCharacter().getCharType() == EnumCharacters.elGringo ){
            currentPlayer.addArrows(1, this);
        }
    }

    /**
     * Function for using Gatling
     * Paul Regret and el Gringo are apart of this function based on there character abilities
     */
    public void useGatling() {
        for (int i = 0; i < players.size(); i++) {
            if ( (players.get(i).getMyCharacter().getCharType() != currentPlayer.getMyCharacter().getCharType() ) || ( players.get(i).getMyCharacter().getCharType() != EnumCharacters.paulRegret) ) {
                players.get(i).removeBullets(1, this);
                if (players.get(i).getMyCharacter().getCharType() == EnumCharacters.elGringo ){
                    currentPlayer.addArrows(1, this);
                }
            }
        }
        currentPlayer.clearArrows(this);
    }

    /**
     * Function to affect all players for indian attack
     */
    public void indianAttack() {
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).indianAttack(this);
        }
    }

    /**
     * Function to initiate role on a player turn
     * @param charIn
     */
    public void playerTurn(Character charIn) {
        initRoll();
    }
    
    /**
     * Function to give duel tokens to other players in the game
     * @param playerIn
     */
    public void giveDuelToken (Player playerIn) { 
        boolean giveToken = true;
        for (int i = 0; i < playerIn.getMyDuelTokens().size(); i++) {
            if (this.duelTokens.get(0) == playerIn.getMyDuelTokens().get(i)) {
                giveToken = false;
            }
        }
        if (giveToken) {
            playerIn.getMyDuelTokens().add(this.duelTokens.get(0));
            this.duelTokens.remove(0);
        }
    }
    
    /**
     * Function to remove duel tokens from players in the game
     * @param playerIn
     */
    public void removeDuelToken (Player playerIn) {
        if (playerIn.getMyDuelTokens().size() > 0) {
            this.duelTokens.add(playerIn.getMyDuelTokens().get(0));
            playerIn.getMyDuelTokens().remove(0);
        }
    }
    
    /**
     * Function to remove all duel tokens in the play of the game
     */
    public void removeAllDuelTokens () {
        for (int i = 0; i < this.currentPlayer.getMyDuelTokens().size();i++) {
            this.duelTokens.add(this.currentPlayer.getMyDuelTokens().get(i));
            this.currentPlayer.getMyDuelTokens().remove(i);
        }
    }
    
    /**
     * Getter to get the current player
     * @return
     */

    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    /**
     * Getter for current players number
     * @return
     */
    public int getCurrentPlayerNumber(){
        return currentPlayerNumber;
    }
    
    /**
     * Getter for finding how many players are in the game
     * @return
     */
    public int getNumPlayers(){
        return this.numPlayers;
    }
    

    /**
     * Getter for ArrayList of players
     * @return
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Sets the players in the ArrayList
     * @param playersIn
     */
    public void setPlayers(ArrayList<Player> playersIn) {
        this.players = playersIn;
    }

    /**
     * ArrayList of players
     * @return
     */
    public ArrayList<Player> getPlayersReference() {
        return playersReference;
    }
    

    /**
     * Getter for the bullet pile involved in the game for max amount of bullets
     * @return
     */
    public int getBulletPile() {
        return bulletPile;
    }

    /**
     * Set the amount of Bullets available in the game reference to the players
     * @param bulletPile
     */
    public void setBulletPile(int bulletPile) {
        this.bulletPile = bulletPile;
    }

    /**
     * Getter for the arrow pile in the game which can be distributed to all players
     * @return
     */
    public int getArrowPile() {
        return arrowPile;
    }

    /**
     * Sets the arrow pile for the game
     * @param arrowPile
     */
    public void setArrowPile(int arrowPile) {
        this.arrowPile = arrowPile;
    }

    /**
     * Getter for chief arrow
     * @return
     */
    public int getChiefArrow() {
        return chiefArrow;
    }

    /**
     * Sets the chief arrow into the current game
     * @param chiefArrow
     */
    public void setChiefArrow(int chiefArrow) {
        this.chiefArrow = chiefArrow;
    }

    /**
     * getter for the game dice
     * @return
     */
    public Dice getGameDice() {
        return gameDice;
    }

    /**
     * Setting the game dice available for the current game
     * @param gameDice
     */
    public void setGameDice(Dice gameDice) {
        this.gameDice = gameDice;
    }

    /**
     * getter for turn rolls
     * @return
     */
    public int getTurnRolls() {
        return turnRolls;
    }

    /**
     * sets the turn rolls for each player
     * @param turnRolls
     */
    public void setTurnRolls(int turnRolls) {
        this.turnRolls = turnRolls;
    }
    
    /**
     * Defined boolean if sheriff wins
     * @return sheriff wins
     */
    public boolean isSheriffWin() {
        return sheriffWin;
    }

    /**
     * Sets the sheriff to win if the boolean is true
     * @param sheriffWin
     */
    public void setSheriffWin(boolean sheriffWin) {
        this.sheriffWin = sheriffWin;
    }

    /**
     * Defined boolean if outlaws wins
     * @return outlaws wins
     */
    public boolean isOutlawWin() {
        return outlawWin;
    }

    /**
     * sets outlaws to win if the boolean is true
     * @param outlawWin
     */
    public void setOutlawWin(boolean outlawWin) {
        this.outlawWin = outlawWin;
    }

    /**
     * Defined boolean if renegade wins
     * @return renegades wins
     */
    public boolean isRenegadeWin() {
        return renegadeWin;
    }

    /**
     * sets renegade to win of the boolean is true
     * @param renegadeWin
     */
    public void setRenegadeWin(boolean renegadeWin) {
        this.renegadeWin = renegadeWin;
    }

    /**
     * getter for number of outlaws depending on the amount of players
     * @return
     */
    public int getNumOutlaws() {
        return numOutlaws;
    }

    /**
     * sets the number of outlaws based on the number of players in the game
     * @param numOutlaws
     */
    public void setNumOutlaws(int numOutlaws) {
        this.numOutlaws = numOutlaws;
    }

    /**
     * getter for the number of renegades in the game
     * @return
     */
    public int getNumRenegades() {
        return numRenegades;
    }

    /**
     * sets the number of renegades in the game based on the amount of players
     * @param numRenegades
     */
    public void setNumRenegades(int numRenegades) {
        this.numRenegades = numRenegades;
    }
   
    

}
