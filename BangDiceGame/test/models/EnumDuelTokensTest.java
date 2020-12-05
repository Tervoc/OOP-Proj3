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
 * @author Owner
 */
public class EnumDuelTokensTest {
    
    public EnumDuelTokensTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class EnumDuelTokens.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EnumDuelTokens[] expResult = null;
        EnumDuelTokens[] result = EnumDuelTokens.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EnumDuelTokens.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EnumDuelTokens expResult = null;
        EnumDuelTokens result = EnumDuelTokens.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
