package models;

public class Character {
    private int maxBullets;
    private int bullets;
    private int arrows;
    
    public Character(int bullets) {
        this.maxBullets = bullets;
        this.bullets = this.maxBullets;
        this.arrows = 0;
    }

    public int getBullets() {
        return bullets;
    }
    
    public void addBullets(int bullets) {
        if (this.bullets != this.maxBullets) {
            this.bullets += bullets;
        }
    }
    
    public void removeBullets(int bullets) {
        this.bullets -= bullets;
    }
    
    public int getArrows() {
        return arrows;
    }

    public void addArrows(int arrows) {
        this.arrows += arrows;
    }
    
    public void removeArrows(int arrows) {
        this.arrows -= arrows;
    }
    
    public void clearArrows() {
        this.arrows = 0;
    }
    
    public void indianAttack() {
        this.bullets = this.bullets - this.arrows;
        this.arrows = 0; 
    }

}
