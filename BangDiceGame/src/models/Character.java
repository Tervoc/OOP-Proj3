package models;
import game.*;
import java.util.ArrayList;

public class Character {

    protected int maxBullets;
    protected int bullets;
    protected EnumCharacters charType;
    protected EnumRoles role;

    public Character(int bullets, EnumRoles roleIn) {
        this.role = roleIn;
        if (this.role == EnumRoles.Sheriff) {
            this.maxBullets = bullets + 2;
            this.bullets = this.maxBullets;
        } else {
            this.maxBullets = bullets;
            this.bullets = this.maxBullets;
        }
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public EnumRoles getRole() {
        return role;
    }

    public int getBullets() { //returns number of bullets
        return bullets;
    }
    
    public void pedroAbility(int bullets,Player myPlayer, Game theGame) {
     
    }

    public EnumCharacters getCharType() {
        return charType;
    }
    
}
