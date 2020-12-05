/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import game.Game;
import java.util.ArrayList;
import javafx.scene.Group;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addBullets method, of class Player.
     */
    @Test
    public void testAddBullets() {
        System.out.println("addBullets");
        int bullets = 0;
        Game theGame = null;
        Player instance = null;
        instance.addBullets(bullets, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBullets method, of class Player.
     */
    @Test
    public void testRemoveBullets() {
        System.out.println("removeBullets");
        int bullets = 0;
        Game theGame = null;
        Player instance = null;
        instance.removeBullets(bullets, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of amIDead method, of class Player.
     */
    @Test
    public void testAmIDead() {
        System.out.println("amIDead");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.amIDead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDead method, of class Player.
     */
    @Test
    public void testSetDead() {
        System.out.println("setDead");
        Player instance = null;
        instance.setDead();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of killMe method, of class Player.
     */
    @Test
    public void testKillMe() {
        System.out.println("killMe");
        Game theGame = null;
        Player instance = null;
        instance.killMe(theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrows method, of class Player.
     */
    @Test
    public void testGetArrows() {
        System.out.println("getArrows");
        Player instance = null;
        int expResult = 0;
        int result = instance.getArrows();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChiefArrow method, of class Player.
     */
    @Test
    public void testAddChiefArrow() {
        System.out.println("addChiefArrow");
        Game theGame = null;
        Player instance = null;
        instance.addChiefArrow(theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeChiefArrow method, of class Player.
     */
    @Test
    public void testRemoveChiefArrow() {
        System.out.println("removeChiefArrow");
        Game theGame = null;
        Player instance = null;
        instance.removeChiefArrow(theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChiefArrow method, of class Player.
     */
    @Test
    public void testGetChiefArrow() {
        System.out.println("getChiefArrow");
        Player instance = null;
        int expResult = 0;
        int result = instance.getChiefArrow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArrows method, of class Player.
     */
    @Test
    public void testAddArrows() {
        System.out.println("addArrows");
        int arrows = 0;
        Game theGame = null;
        Player instance = null;
        instance.addArrows(arrows, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeArrows method, of class Player.
     */
    @Test
    public void testRemoveArrows() {
        System.out.println("removeArrows");
        int arrows = 0;
        Game theGame = null;
        Player instance = null;
        instance.removeArrows(arrows, theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearArrows method, of class Player.
     */
    @Test
    public void testClearArrows() {
        System.out.println("clearArrows");
        Game theGame = null;
        Player instance = null;
        instance.clearArrows(theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indianAttack method, of class Player.
     */
    @Test
    public void testIndianAttack() {
        System.out.println("indianAttack");
        Game theGame = null;
        Player instance = null;
        instance.indianAttack(theGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyCharacter method, of class Player.
     */
    @Test
    public void testGetMyCharacter() {
        System.out.println("getMyCharacter");
        Player instance = null;
        Character expResult = null;
        Character result = instance.getMyCharacter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerGroup method, of class Player.
     */
    @Test
    public void testSetPlayerGroup() {
        System.out.println("setPlayerGroup");
        Group playerGroup = null;
        Player instance = null;
        instance.setPlayerGroup(playerGroup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerGroup method, of class Player.
     */
    @Test
    public void testGetPlayerGroup() {
        System.out.println("getPlayerGroup");
        Player instance = null;
        Group expResult = null;
        Group result = instance.getPlayerGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbility method, of class Player.
     */
    @Test
    public void testGetAbility() {
        System.out.println("getAbility");
        Player instance = null;
        String expResult = "";
        String result = instance.getAbility();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasConfirmedDice method, of class Player.
     */
    @Test
    public void testIsHasConfirmedDice() {
        System.out.println("isHasConfirmedDice");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isHasConfirmedDice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasConfirmedDice method, of class Player.
     */
    @Test
    public void testSetHasConfirmedDice() {
        System.out.println("setHasConfirmedDice");
        boolean hasConfirmedDice = false;
        Player instance = null;
        instance.setHasConfirmedDice(hasConfirmedDice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxBullets method, of class Player.
     */
    @Test
    public void testGetMaxBullets() {
        System.out.println("getMaxBullets");
        Player instance = null;
        int expResult = 0;
        int result = instance.getMaxBullets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Player.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Player instance = null;
        instance.setUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Player.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Player instance = null;
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class Player.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String temp = "";
        Player instance = null;
        instance.setRole(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBullets method, of class Player.
     */
    @Test
    public void testGetBullets() {
        System.out.println("getBullets");
        Player instance = null;
        int expResult = 0;
        int result = instance.getBullets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharacterTraits method, of class Player.
     */
    @Test
    public void testSetCharacterTraits() {
        System.out.println("setCharacterTraits");
        int num = 0;
        Player instance = null;
        instance.setCharacterTraits(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrows method, of class Player.
     */
    @Test
    public void testSetArrows() {
        System.out.println("setArrows");
        int arrows = 0;
        Player instance = null;
        instance.setArrows(arrows);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyDuelTokens method, of class Player.
     */
    @Test
    public void testGetMyDuelTokens() {
        System.out.println("getMyDuelTokens");
        Player instance = null;
        ArrayList<EnumDuelTokens> expResult = null;
        ArrayList<EnumDuelTokens> result = instance.getMyDuelTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyDuelTokens method, of class Player.
     */
    @Test
    public void testSetMyDuelTokens() {
        System.out.println("setMyDuelTokens");
        ArrayList<EnumDuelTokens> myDuelTokens = null;
        Player instance = null;
        instance.setMyDuelTokens(myDuelTokens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
