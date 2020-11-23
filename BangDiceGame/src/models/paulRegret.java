/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Michael
 */
public class paulRegret extends Character{
    
    public paulRegret(EnumRoles thisRole) {
        super(9, thisRole);
        this.charType = EnumCharacters.paulRegret;
    }
       public void removeBullets(int bullets) {
        if(this.gatling >= 3) //If gatling roll is 3 or more, 1 total damage happens
        {
            this.bullets -= 0; //Subtract zero becuase of character special ability
            //of no damage from gatling gun.
        }
        
        this.bullets -= bullets;
    }
}
