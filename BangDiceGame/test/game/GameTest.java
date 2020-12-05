/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import models.Character;
import models.Dice;
import models.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nextTurn method, of class Game.
     */
    @Test
    public void testNextTurn() {
        System.out.println("nextTurn");
        Game instance = null;
        instance.nextTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interpretRoll method, of class Game.
     */
    @Test
    public void testInterpretRoll() {
        System.out.println("interpretRoll");
        Game instance = null;
        instance.interpretRoll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useRoll method, of class Game.
     */
    @Test
    public void testUseRoll() {
        System.out.println("useRoll");
        Game instance = null;
        instance.useRoll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initRoll method, of class Game.
     */
    @Test
    public void testInitRoll() {
        System.out.println("initRoll");
        Game instance = null;
        instance.initRoll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollDice method, of class Game.
     */
    @Test
    public void testRollDice_0args() {
        System.out.println("rollDice");
        Game instance = null;
        instance.rollDice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollDice method, of class Game.
     */
    @Test
    public void testRollDice_int() {
        System.out.println("rollDice");
        int i = 0;
        Game instance = null;
        instance.rollDice(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playsOutTurns method, of class Game.
     */
    @Test
    public void testPlaysOutTurns() {
        System.out.println("playsOutTurns");
        Game instance = null;
        instance.playsOutTurns();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useBeer method, of class Game.
     */
    @Test
    public void testUseBeer() {
        System.out.println("useBeer");
        int die = 0;
        Game instance = null;
        instance.useBeer(die);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useWhiskey method, of class Game.
     */
    @Test
    public void testUseWhiskey() {
        System.out.println("useWhiskey");
        Game instance = null;
        instance.useWhiskey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of duel method, of class Game.
     */
    @Test
    public void testDuel() {
        System.out.println("duel");
        int playerToDuel = 0;
        Game instance = null;
        instance.duel(playerToDuel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useOneShot method, of class Game.
     */
    @Test
    public void testUseOneShot() {
        System.out.println("useOneShot");
        int die = 0;
        Game instance = null;
        instance.useOneShot(die);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useTwoShot method, of class Game.
     */
    @Test
    public void testUseTwoShot() {
        System.out.println("useTwoShot");
        int die = 0;
        Game instance = null;
        instance.useTwoShot(die);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useGatling method, of class Game.
     */
    @Test
    public void testUseGatling() {
        System.out.println("useGatling");
        Game instance = null;
        instance.useGatling();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indianAttack method, of class Game.
     */
    @Test
    public void testIndianAttack() {
        System.out.println("indianAttack");
        Game instance = null;
        instance.indianAttack();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerTurn method, of class Game.
     */
    @Test
    public void testPlayerTurn() {
        System.out.println("playerTurn");
        Character charIn = null;
        Game instance = null;
        instance.playerTurn(charIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveDuelToken method, of class Game.
     */
    @Test
    public void testGiveDuelToken() {
        System.out.println("giveDuelToken");
        Player playerIn = null;
        Game instance = null;
        instance.giveDuelToken(playerIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDuelToken method, of class Game.
     */
    @Test
    public void testRemoveDuelToken() {
        System.out.println("removeDuelToken");
        Player playerIn = null;
        Game instance = null;
        instance.removeDuelToken(playerIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllDuelTokens method, of class Game.
     */
    @Test
    public void testRemoveAllDuelTokens() {
        System.out.println("removeAllDuelTokens");
        Game instance = null;
        instance.removeAllDuelTokens();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class Game.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        Game instance = null;
        Player expResult = null;
        Player result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerNumber method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerNumber() {
        System.out.println("getCurrentPlayerNumber");
        Game instance = null;
        int expResult = 0;
        int result = instance.getCurrentPlayerNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPlayers method, of class Game.
     */
    @Test
    public void testGetNumPlayers() {
        System.out.println("getNumPlayers");
        Game instance = null;
        int expResult = 0;
        int result = instance.getNumPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> playersIn = null;
        Game instance = null;
        instance.setPlayers(playersIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayersReference method, of class Game.
     */
    @Test
    public void testGetPlayersReference() {
        System.out.println("getPlayersReference");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayersReference();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBulletPile method, of class Game.
     */
    @Test
    public void testGetBulletPile() {
        System.out.println("getBulletPile");
        Game instance = null;
        int expResult = 0;
        int result = instance.getBulletPile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBulletPile method, of class Game.
     */
    @Test
    public void testSetBulletPile() {
        System.out.println("setBulletPile");
        int bulletPile = 0;
        Game instance = null;
        instance.setBulletPile(bulletPile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrowPile method, of class Game.
     */
    @Test
    public void testGetArrowPile() {
        System.out.println("getArrowPile");
        Game instance = null;
        int expResult = 0;
        int result = instance.getArrowPile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrowPile method, of class Game.
     */
    @Test
    public void testSetArrowPile() {
        System.out.println("setArrowPile");
        int arrowPile = 0;
        Game instance = null;
        instance.setArrowPile(arrowPile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChiefArrow method, of class Game.
     */
    @Test
    public void testGetChiefArrow() {
        System.out.println("getChiefArrow");
        Game instance = null;
        int expResult = 0;
        int result = instance.getChiefArrow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChiefArrow method, of class Game.
     */
    @Test
    public void testSetChiefArrow() {
        System.out.println("setChiefArrow");
        int chiefArrow = 0;
        Game instance = null;
        instance.setChiefArrow(chiefArrow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameDice method, of class Game.
     */
    @Test
    public void testGetGameDice() {
        System.out.println("getGameDice");
        Game instance = null;
        Dice expResult = null;
        Dice result = instance.getGameDice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameDice method, of class Game.
     */
    @Test
    public void testSetGameDice() {
        System.out.println("setGameDice");
        Dice gameDice = null;
        Game instance = null;
        instance.setGameDice(gameDice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTurnRolls method, of class Game.
     */
    @Test
    public void testGetTurnRolls() {
        System.out.println("getTurnRolls");
        Game instance = null;
        int expResult = 0;
        int result = instance.getTurnRolls();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTurnRolls method, of class Game.
     */
    @Test
    public void testSetTurnRolls() {
        System.out.println("setTurnRolls");
        int turnRolls = 0;
        Game instance = null;
        instance.setTurnRolls(turnRolls);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSheriffWin method, of class Game.
     */
    @Test
    public void testIsSheriffWin() {
        System.out.println("isSheriffWin");
        Game instance = null;
        boolean expResult = false;
        boolean result = instance.isSheriffWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSheriffWin method, of class Game.
     */
    @Test
    public void testSetSheriffWin() {
        System.out.println("setSheriffWin");
        boolean sheriffWin = false;
        Game instance = null;
        instance.setSheriffWin(sheriffWin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutlawWin method, of class Game.
     */
    @Test
    public void testIsOutlawWin() {
        System.out.println("isOutlawWin");
        Game instance = null;
        boolean expResult = false;
        boolean result = instance.isOutlawWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutlawWin method, of class Game.
     */
    @Test
    public void testSetOutlawWin() {
        System.out.println("setOutlawWin");
        boolean outlawWin = false;
        Game instance = null;
        instance.setOutlawWin(outlawWin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRenegadeWin method, of class Game.
     */
    @Test
    public void testIsRenegadeWin() {
        System.out.println("isRenegadeWin");
        Game instance = null;
        boolean expResult = false;
        boolean result = instance.isRenegadeWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenegadeWin method, of class Game.
     */
    @Test
    public void testSetRenegadeWin() {
        System.out.println("setRenegadeWin");
        boolean renegadeWin = false;
        Game instance = null;
        instance.setRenegadeWin(renegadeWin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOutlaws method, of class Game.
     */
    @Test
    public void testGetNumOutlaws() {
        System.out.println("getNumOutlaws");
        Game instance = null;
        int expResult = 0;
        int result = instance.getNumOutlaws();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOutlaws method, of class Game.
     */
    @Test
    public void testSetNumOutlaws() {
        System.out.println("setNumOutlaws");
        int numOutlaws = 0;
        Game instance = null;
        instance.setNumOutlaws(numOutlaws);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRenegades method, of class Game.
     */
    @Test
    public void testGetNumRenegades() {
        System.out.println("getNumRenegades");
        Game instance = null;
        int expResult = 0;
        int result = instance.getNumRenegades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumRenegades method, of class Game.
     */
    @Test
    public void testSetNumRenegades() {
        System.out.println("setNumRenegades");
        int numRenegades = 0;
        Game instance = null;
        instance.setNumRenegades(numRenegades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
