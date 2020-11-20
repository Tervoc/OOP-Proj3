package models;

public class Character {
    protected int maxBullets;
    protected int bullets;
    protected int arrows;
    protected int gatling;
    protected Roles role;
    protected Dice charDice;
    protected int numRolls;
    
    public Character(int bullets, Roles roleIn) {
        this.role = roleIn;
        if(this.role == Roles.Sheriff){
            this.maxBullets = bullets + 2;
            this.bullets = this.maxBullets;
        }
        else{
            this.maxBullets = bullets;
            this.bullets = this.maxBullets;
        }
        
        this.charDice = new Dice(5);
        
        this.gatling = 0;
        this.arrows = 0;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public Roles getRole() {
        return role;
    }

    public Dice getCharDice() {
        return charDice;
    }

    public int getNumRolls() {
        return numRolls;
    }

    /**
     * returns number of bullets 
     * @return 
     */
    public int getBullets() {
        return bullets;
    }
    
    /**
     * add a number of bullets to character
     * @param bullets 
     */
    public void addBullets(int bullets) {
        if (this.bullets != this.maxBullets) {
            this.bullets += bullets;
        }
    }
    
    /**
     * remove a number of bullets from a character 
     * @param bullets 
     */
    public void removeBullets(int bullets) {
        this.bullets -= bullets;
    }
    
    /**
     * return current number of arrows
     * @return 
     */
    public int getArrows() {
        return arrows;
    }

    /**
     * add number of arrows to character 
     * @param arrows 
     */
    public void addArrows(int arrows) {
        this.arrows += arrows;
    }
    
    /**
     * remove number of arrows from character 
     * @param arrows 
     */
    public void removeArrows(int arrows) {
        this.arrows -= arrows;
    }
    
    /**
     * clear the number of arrows currently assigned to player 
     */
    public void clearArrows() {
        this.arrows = 0;
    }
    
    /**
     * subtract the number of arrows from the character's health
     * set number of arrows to zero 
     */
    public void indianAttack() {
        this.bullets = this.bullets - this.arrows;
        this.arrows = 0; 
    }
    
    public void gatling() {
        this.gatling = 3;
    }
    
    public void initRoll() {
        charDice.rerollAllDice();
        this.numRolls = 1;
    }
    
    public void reRoll(Integer aa, Integer bb, Integer cc, Integer dd, Integer ee, Integer ff) {
        if(this.numRolls < 3){
            charDice.rerollDice(aa, bb, cc, dd, ee, ff);
            this.numRolls += 1;
        }
    }
}
