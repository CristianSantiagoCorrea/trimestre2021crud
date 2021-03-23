/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago
 */




public class ProductoTest {
           Producto instance;
    public ProductoTest() {
 
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
       instance = new Producto();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularcosto method, of class Producto.
     */
    @Test
    public void testCalcularcosto() {
        System.out.println("calcularcosto");
        int cantidad = 20;
        int costo = 1;
        //Producto instance = new Producto();
        int expResult = 20;
        int result = instance.calcularcosto(cantidad, costo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descuento method, of class Producto.
     */
    @Test
    public void testDescuento() {
        System.out.println("descuento");
        int valor = 943;
        int desc = 216;
        //Producto instance = new Producto();
        int expResult = 727;
        int result = instance.descuento(valor, desc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
