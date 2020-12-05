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
public class EnumRolesTest {
    
    public EnumRolesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class EnumRoles.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EnumRoles[] expResult = null;
        EnumRoles[] result = EnumRoles.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EnumRoles.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EnumRoles expResult = null;
        EnumRoles result = EnumRoles.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringToRole method, of class EnumRoles.
     */
    @Test
    public void testStringToRole() {
        System.out.println("stringToRole");
        String role = "";
        EnumRoles expResult = null;
        EnumRoles result = EnumRoles.stringToRole(role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleAsString method, of class EnumRoles.
     */
    @Test
    public void testGetRoleAsString() {
        System.out.println("getRoleAsString");
        EnumRoles instance = null;
        String expResult = "";
        String result = instance.getRoleAsString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
