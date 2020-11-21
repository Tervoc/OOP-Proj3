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
public class elGringo extends Character {
        public elGringo(Roles thisRole) {
        super(7, thisRole);
    }
        public void removeBullets(int bullets)
        {
            this.bullets -= bullets;
            if(this.bullets < bullets)
            {
                this.arrows += arrows;
            }
        }
}
