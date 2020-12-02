/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Troll
 */
public class DiceTest {
    
    public DiceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rollDice method, of class Dice.
     */
    @Test
    public void testRollDice() {
        System.out.println("rollDice");
        Dice instance = null;
        instance.rollDice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rerollAllDice method, of class Dice.
     */
    @Test
    public void testRerollAllDice() {
        System.out.println("rerollAllDice");
        Dice instance = null;
        instance.rerollAllDice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rerollDice method, of class Dice.
     */
    @Test
    public void testRerollDice() {
        System.out.println("rerollDice");
        Integer a = null;
        Integer b = null;
        Integer c = null;
        Integer d = null;
        Integer e = null;
        Integer f = null;
        Dice instance = null;
        instance.rerollDice(a, b, c, d, e, f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDice method, of class DiceBase.
     */
//    @Test
//    public void testGetDice() {
//        System.out.println("getDice");
//        Dice instance = null;
//        WhiteDie[] expResult = null;
//        //WhiteDie[] result = instance.getDice();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
