/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Natito
 */
public class StackFactoryTest {
    
    public StackFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStack method, of class StackFactory.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        String entry1 = "2";
        String entry2 = "0";
        StackFactory instance = new StackFactory();
        Stack expResult = new StackVector<>();
        Stack result = instance.getStack(entry1, entry2);
        assertEquals(expResult, result);
    }
    
}
