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
public class EnumPlayerGroupLabelsTest {
    
    public EnumPlayerGroupLabelsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class EnumPlayerGroupLabels.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EnumPlayerGroupLabels[] expResult = null;
        EnumPlayerGroupLabels[] result = EnumPlayerGroupLabels.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EnumPlayerGroupLabels.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EnumPlayerGroupLabels expResult = null;
        EnumPlayerGroupLabels result = EnumPlayerGroupLabels.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
