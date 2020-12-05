/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class bangMainTest {
    
    public bangMainTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showStartView method, of class bangMain.
     */
    @Test
    public void testShowStartView() {
        System.out.println("showStartView");
        bangMain instance = new bangMain();
        instance.showStartView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class bangMain.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Stage primaryStage = null;
        bangMain instance = new bangMain();
        instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class bangMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        bangMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
