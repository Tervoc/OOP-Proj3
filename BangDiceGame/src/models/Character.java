package models;
import game.*;
import java.util.ArrayList;

public class Character {

    protected int maxBullets;
    protected int bullets;
    protected int arrows;
    protected EnumCharacters charType;
    protected EnumRoles role;
    protected DiceBase charDice;
    protected int numRolls;
    protected boolean amIDead = false;

    public Character(int bullets, EnumRoles roleIn) {
        this.role = roleIn;
        if (this.role == EnumRoles.Sheriff) {
            this.maxBullets = bullets + 2;
            this.bullets = this.maxBullets;
        } else {
            this.maxBullets = bullets;
            this.bullets = this.maxBullets;
        }
        
        this.arrows = 0;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public EnumRoles getRole() {
        return role;
    }

    public DiceBase getCharDice() {
        return charDice;
    }

    public int getNumRolls() {
        return numRolls;
    }

    public int getBullets() { //returns number of bullets
        return bullets;
    }

    public void addBullets(int bullets, Game theGame) { //add a number of bullets to character
        if (this.bullets != this.maxBullets) {
            this.bullets += bullets;
            if(this.bullets > this.maxBullets) {
                this.bullets = this.maxBullets;
            }
            theGame.setBulletPile(theGame.getBulletPile()-bullets);
        }
    }

    public void removeBullets(int bullets, Game theGame) { //remove a number of bullets from a character
        this.bullets -= bullets;
        theGame.setBulletPile(theGame.getBulletPile()+bullets);
        
        if (this.bullets == 0) {
           // this.killMe(theGame);
        }
    }

    public int getArrows() { //return current number of arrows
        return arrows;
    }

    public void addArrows(int arrows, Game theGame) { //add number of arrows to character
        this.arrows += arrows;
        theGame.setArrowPile(theGame.getArrowPile()-arrows);
    }

    public void removeArrows(int arrows, Game theGame) { //remove number of arrows from character
        this.arrows -= arrows;
        theGame.setArrowPile(theGame.getArrowPile()+arrows);
    }

    public void clearArrows(Game theGame) { //clear the number of arrows currently assigned to player
        theGame.setArrowPile(theGame.getArrowPile() + this.arrows);
        this.arrows = 0;
    }

    public void indianAttack(Game theGame) {
        //subtract the number of arrows from the character's health set number of
        //arrows to zero
        this.removeBullets(this.arrows, theGame);
        this.clearArrows(theGame);
    }

    public void initRoll() {
        this.charDice = new DiceBase(5);
        this.numRolls = 1;
    }

    public void reRoll(Integer aa, Integer bb, Integer cc, Integer dd, Integer ee, Integer ff) {
        if (this.numRolls < 3) {
            charDice.rerollDice(aa, bb, cc, dd, ee, ff);
            this.numRolls += 1;
        }
    }

    public EnumCharacters getCharType() {
        return charType;
    }

//    public boolean amIDead() {
//        return amIDead;
//    }
//
//    public void setDead() {
//        this.amIDead = true;
//    }
//    
//    public void killMe (Game theGame) {
//        this.setDead();
//        for (int i = 0; i < theGame.getPlayers().size();i++) {
//            if(theGame.getPlayers().get(i).getMyCharacter().getCharType() == this.getCharType()) {
//                ArrayList <Player> temp = new ArrayList <Player> ();
//                temp = theGame.getPlayers();
//                temp.remove(i);
//                theGame.setPlayers(temp);
//            }
//        }
        /*if(this.role == EnumRoles.Sheriff) {
            theGame.setOutlawWin(true);
        }*/
        
//    }
    
    
}
