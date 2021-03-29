/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import models.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Santiago
 */
public class homeControllerTest {
    
    /**
     *
     */
    public homeControllerTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of consultarClientexNombre method, of class homeController.
     */
    @Ignore
    public void testConsultarClientexNombre_0args() {
        System.out.println("consultarClientexNombre");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.consultarClientexNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClientexNombre method, of class homeController.
     */
    @Ignore
    public void testConsultarClientexNombre_3args() {
        System.out.println("consultarClientexNombre");
        Cliente cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.consultarClientexNombre(cli, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of homeCliente method, of class homeController.
     */
    @Ignore
    public void testHomeCliente() {
        System.out.println("homeCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.homeCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of homeClientePOST method, of class homeController.
     */
    @Ignore
    public void testHomeClientePOST() {
        System.out.println("homeClientePOST");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.homeClientePOST();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class homeController.
     */
    @Ignore
    public void testAgregarCliente_0args() {
        System.out.println("agregarCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.agregarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class homeController.
     */
    @Ignore
    public void testAgregarCliente_Cliente() {
        System.out.println("agregarCliente");
        Cliente cli = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.agregarCliente(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Ignore
    public void testActCliente_HttpServletRequest() {
        System.out.println("actCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.actCliente(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Ignore
    public void testActCliente_3args() {
        System.out.println("actCliente");
        Cliente cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.actCliente(cli, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientebyId method, of class homeController.
     */
    @Ignore
    public void testCargarClientebyId() {
        System.out.println("cargarClientebyId");
        int id = 0;
        homeController instance = new homeController();
        Cliente expResult = null;
        Cliente result = instance.cargarClientebyId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class homeController.
     */
    @Test
    public void testBorrarCliente() {
        System.out.println("borrarCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientesid method, of class homeController.
     */
    @Ignore
    public void testListarClientesid() {
        System.out.println("listarClientesid");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarClientesid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
