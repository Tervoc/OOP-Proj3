/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import game.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class CharacterTest {
    
    public CharacterTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaxBullets method, of class Character.
     */
    @Test
    public void testGetMaxBullets() {
        System.out.println("getMaxBullets");
        Character instance = null;
        int expResult = 0;
        int result = instance.getMaxBullets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Character.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Character instance = null;
        EnumRoles expResult = null;
        EnumRoles result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBullets method, of class Character.
     */
    @Test
    public void testGetBullets() {
        System.out.println("getBullets");
        Character instance = null;
        int expResult = 0;
        int result = instance.getBullets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedroAbility method, of class Character.
     */
    @Test
    public void testPedroAbility() {
        System.out.println("pedroAbility");
        Player myPlayer = null;
        Game theGame = null;
        Character instance = null;
        instance.pedroAbility(myPlayer, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apacheKidAbility method, of class Character.
     */
    @Test
    public void testApacheKidAbility() {
        System.out.println("apacheKidAbility");
        int arrows = 0;
        Player playerIn = null;
        Game theGame = null;
        Character instance = null;
        instance.apacheKidAbility(arrows, playerIn, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dynamiteToGatling method, of class Character.
     */
    @Test
    public void testDynamiteToGatling() {
        System.out.println("dynamiteToGatling");
        int dynamite = 0;
        int gatling = 0;
        Game theGame = null;
        Character instance = null;
        instance.dynamiteToGatling(dynamite, gatling, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharType method, of class Character.
     */
    @Test
    public void testGetCharType() {
        System.out.println("getCharType");
        Character instance = null;
        EnumCharacters expResult = null;
        EnumCharacters result = instance.getCharType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
