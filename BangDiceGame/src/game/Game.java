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
    protected int chiefArrow;
    protected int numPlayers;
    protected int numDynamite;
    protected int numGatling;
    protected int numBeer;
    protected int numOneShot;
    protected int numTwoShot;
    protected int numOutlaws;
    protected int numRenegades;
    protected ArrayList<EnumRoles> rolesList = new ArrayList<EnumRoles>();
    protected ArrayList<EnumCharacters> charsList = new ArrayList<EnumCharacters>();
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected boolean sheriffWin = false;
    protected boolean outlawWin = false;
    protected boolean renegadeWin = false;
    
    private int numGameDice = 5;
    private int numWhiteDie;
    private int numCowardDie;
    private int numLoudmouthDie;
    private int numBlackDie;
    private int turnRolls = 0;
    private Dice gameDice;
    private Player currentPlayer;
    private int currentPlayerNumber;

    public Game(int numPlayers) {
        this.bulletPile = 70;
        this.arrowPile = 9;
        this.chiefArrow = 1;
        this.numPlayers = numPlayers;

        this.addRoles();
        this.addCharacters();
        this.addPlayers();


        currentPlayer = players.get(0);
        currentPlayerNumber = 0;

        this.gameDice = new Dice(5, 0, 0, 0);
        this.currentPlayer = this.players.get(0);
        this.currentPlayerNumber = 0;


    }

    public void nextTurn() {
        turnRolls = 0;
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
                    this.currentPlayer.addArrows(1, this);
                    this.setArrowPile(this.getArrowPile() - 1);

                    if (this.getArrowPile() == 0) {
                        this.indianAttack();
                    }
                } 
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.dynamite) {
                    this.numDynamite += 1;
                    this.gameDice.getDice().get(i).lockDie();
                    if (this.numDynamite >= 3) {
                        this.currentPlayer.removeBullets(1, this);
                        //next turn?
                        break;
                    }
                }
            }
        }
        
        else if (turnRolls <= 3 || ( (currentPlayer.getMyCharacter().getCharType() == EnumCharacters.luckyDuke) && turnRolls <=4)) {
            for (int i = 0; i < numGameDice; i++) {
                if (gameDice.getDice().get(i).getSide() == Die.Sides.arrow && gameDice.getDice().get(i).isLocked() && (this.currentPlayer.getMyCharacter().getCharType() != EnumCharacters.billNoFace)) {
                    currentPlayer.addArrows(1, this);
                    this.setArrowPile(this.getArrowPile() - 1);

                    if (this.getArrowPile() == 0) {
                        this.indianAttack();
                    }
                } 
                else if (gameDice.getDice().get(i).getSide() == Die.Sides.dynamite && gameDice.getDice().get(i).isLocked()) {
                    this.numDynamite += 1;
                    gameDice.getDice().get(i).lockDie();
                    if (this.numDynamite >= 3) {
                        this.currentPlayer.removeBullets(1, this);
                        //next turn?
                        break;
                    }
                }
            }
        }
    }

    public void useRoll() {
        for (int i = 0; i < numGameDice; i++) {
            if(gameDice.getDice().get(i).isLocked() ) {
                if ( (gameDice.getDice().get(i).getSide() == Die.Sides.arrow) && (currentPlayer.getMyCharacter().getCharType() == EnumCharacters.billNoFace) ) {
                    currentPlayer.addArrows(1, this);
                    this.setArrowPile(this.getArrowPile() - 1);

                    if (this.getArrowPile() == 0) {
                        this.indianAttack();
                    }
                }
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.beer) {
                    this.useBeer(i);
                } 
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.one_shot) {
                    this.useOneShot(i);
                } 
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.two_shot) {
                    this.useTwoShot(i);
                } 
                else if (this.gameDice.getDice().get(i).getSide() == Die.Sides.gatling) {
                    this.numGatling += 1;
                }  
            }
        }
       
        if (this.numGatling >= 3 || (this.currentPlayer.getMyCharacter().getCharType() == EnumCharacters.willyTheKid && this.numGatling >= 2)) {
            this.useGatling();
        }

    }


    public void initRoll() {
        this.gameDice = new Dice(this.numWhiteDie, this.numCowardDie, this.numLoudmouthDie, this.numBlackDie);
    }
    
    public void rollDice() {
        
        gameDice.rollAllDice();

    }

    public void rollDice(int i) {
        this.gameDice.rollDice(i);
    }
    

    public void useBeer(int die) {
        players.get(gameDice.getDice().get(die).getWhosGettingABeer()).addBullets(1, this);
    }
    

    public void useOneShot(int die) {
        players.get(gameDice.getDice().get(die).getWhosGettingShot()).removeBullets(1, this);
        if (players.get(gameDice.getDice().get(die).getWhosGettingShot()).getMyCharacter().getCharType() == EnumCharacters.elGringo ){
            currentPlayer.addArrows(1, this);
        }
        System.out.println("Whoes Getting shot 1: " + gameDice.getDice().get(die).getWhosGettingShot());
                System.out.println("Die num: " + die);

    }

    public void useTwoShot(int die) {
        players.get(gameDice.getDice().get(die).getWhosGettingShot()).removeBullets(1, this);
        if (players.get(gameDice.getDice().get(die).getWhosGettingShot()).getMyCharacter().getCharType() == EnumCharacters.elGringo ){
            currentPlayer.addArrows(1, this);
        }
        System.out.println("Whoes Getting shot 2: " + gameDice.getDice().get(die).getWhosGettingShot());
        System.out.println("Die num: " + die);

    }

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

    public void indianAttack() {
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).indianAttack(this);
        }
    }

    public void playerTurn(Character charIn) {
        initRoll();
    }
    
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    public int getCurrentPlayerNumber(){
        return currentPlayerNumber;
    }
    
    public int getNumPlayers(){
        return this.numPlayers;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> playersIn) {
        this.players = playersIn;
    }

    public int getBulletPile() {
        return bulletPile;
    }

    public void setBulletPile(int bulletPile) {
        this.bulletPile = bulletPile;
    }

    public int getArrowPile() {
        return arrowPile;
    }

    public void setArrowPile(int arrowPile) {
        this.arrowPile = arrowPile;
    }

    public int getChiefArrow() {
        return chiefArrow;
    }

    public void setChiefArrow(int chiefArrow) {
        this.chiefArrow = chiefArrow;
    }

    public Dice getGameDice() {
        return gameDice;
    }

    public void setGameDice(Dice gameDice) {
        this.gameDice = gameDice;
    }

    public int getTurnRolls() {
        return turnRolls;
    }

    public void setTurnRolls(int turnRolls) {
        this.turnRolls = turnRolls;
    }
    

    public boolean isSheriffWin() {
        return sheriffWin;
    }

    public void setSheriffWin(boolean sheriffWin) {
        this.sheriffWin = sheriffWin;
    }

    public boolean isOutlawWin() {
        return outlawWin;
    }

    public void setOutlawWin(boolean outlawWin) {
        this.outlawWin = outlawWin;
    }

    public boolean isRenegadeWin() {
        return renegadeWin;
    }

    public void setRenegadeWin(boolean renegadeWin) {
        this.renegadeWin = renegadeWin;
    }

    public int getNumOutlaws() {
        return numOutlaws;
    }

    public void setNumOutlaws(int numOutlaws) {
        this.numOutlaws = numOutlaws;
    }

    public int getNumRenegades() {
        return numRenegades;
    }

    public void setNumRenegades(int numRenegades) {
        this.numRenegades = numRenegades;
    }
    

}
