/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Santiago
 */
@RunWith(value = Parameterized.class)
public class ProductoreunwithTest {

    /**
     *
     * @return
     */
    @Parameters
    public static Iterable<Object[]>getData(){
    List<Object[]> obj = new ArrayList<>();
    obj.add(new Object[]{4,5,20});
    return obj;
    }
    
    private int cantidad;
    private int costo;
    private int expResult;
    /**
     * @param cantidad
     * @param costo
     * @param expResult
     */
    
    public ProductoreunwithTest(int cantidad, int costo, int expResult) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.expResult = expResult;
    }
    
    /**
     *
     */
    @Test
    public void testCalcularcosto() {
        System.out.println("calcularcosto");
        //int cantidad = 0;
        //int costo = 0;
        Producto instance = new Producto();
       // int expResult = 0;
        int result = instance.calcularcosto(cantidad, costo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

 
    
}
