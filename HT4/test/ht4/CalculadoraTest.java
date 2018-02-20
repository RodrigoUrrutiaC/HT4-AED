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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getInstance method, of class Calculadora.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Calculadora expResult = null;
        Calculadora result = Calculadora.getInstance();
        assertEquals(expResult, result);

    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        String exp = "2 2 +";
        int x = 1;
        int y = 1;
        Calculadora instance = new Calculadora();
        String expResult = "4";
        String result = instance.calcular(exp, x, y);
        assertEquals(expResult, result);

    }
    
}

