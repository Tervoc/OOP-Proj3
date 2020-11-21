/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mtbol
 */
//hopefully this man fucking survives this time
public class willyTheKid extends Character{
    
    public willyTheKid(Roles thisRole) {
        super(8, thisRole);
    }
       public void removeBullets(int bullets) {
        if(this.gatling >= 2) //If gatling roll is 2 or more, 1 total damage happens
        {
            this.bullets -= 0; //Subtract zero becuase of character special ability
            //of no damage from gatling gun.
        }
        
        this.bullets -= bullets;
    }
}

