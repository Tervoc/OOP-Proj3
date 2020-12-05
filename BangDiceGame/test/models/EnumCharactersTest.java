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
public class EnumCharactersTest {
    
    public EnumCharactersTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class EnumCharacters.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EnumCharacters[] expResult = null;
        EnumCharacters[] result = EnumCharacters.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EnumCharacters.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EnumCharacters expResult = null;
        EnumCharacters result = EnumCharacters.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringToCharacters method, of class EnumCharacters.
     */
    @Test
    public void testStringToCharacters() {
        System.out.println("stringToCharacters");
        String role = "";
        EnumCharacters expResult = null;
        EnumCharacters result = EnumCharacters.stringToCharacters(role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacterAsString method, of class EnumCharacters.
     */
    @Test
    public void testGetCharacterAsString() {
        System.out.println("getCharacterAsString");
        EnumCharacters instance = null;
        String expResult = "";
        String result = instance.getCharacterAsString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharImageFL method, of class EnumCharacters.
     */
    @Test
    public void testGetCharImageFL() {
        System.out.println("getCharImageFL");
        EnumCharacters instance = null;
        String expResult = "";
        String result = instance.getCharImageFL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
