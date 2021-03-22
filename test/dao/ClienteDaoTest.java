/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
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
public class ClienteDaoTest {
    
    public ClienteDaoTest() {
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
     * Test of consultarClienteById method, of class ClienteDao.
     */
    @Test
    public void testConsultarClienteById() {
        System.out.println("consultarClienteById");
        int id = 18;
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteById(18);
        List result = instance.consultarClienteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class ClienteDao.
     */
    @Test
    public void testConsultarClienteByNombre() {
        System.out.println("consultarClienteByNombre");
        String nombre = "Santiago";
        ClienteDao instance = new ClienteDao();
        List expResult = instance.consultarClienteByNombre("Santiago");
        List result = instance.consultarClienteByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
