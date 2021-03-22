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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getId method, of class Cliente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cliente instance = new Cliente();
        int expResult = 18;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Cliente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cliente instance = new Cliente();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "Santiago";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Cliente.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Cliente instance = new Cliente();
        String expResult = "martinez";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Cliente.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Cliente instance = new Cliente();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Cliente.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Cliente instance = new Cliente();
        String expResult = "juan.martinez@gmail.com";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Cliente.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Cliente instance = new Cliente();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Cliente instance = new Cliente();
        int expResult =22;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Cliente instance = new Cliente();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
