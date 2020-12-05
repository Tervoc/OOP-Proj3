/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import game.bangMain;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class StartViewControllerTest {
    
    public StartViewControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateGamePane method, of class StartViewController.
     */
    @Test
    public void testUpdateGamePane() {
        System.out.println("updateGamePane");
        StartViewController instance = new StartViewController();
        instance.updateGamePane();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMain method, of class StartViewController.
     */
    @Test
    public void testSetMain() {
        System.out.println("setMain");
        bangMain main = null;
        StartViewController instance = new StartViewController();
        instance.setMain(main);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
