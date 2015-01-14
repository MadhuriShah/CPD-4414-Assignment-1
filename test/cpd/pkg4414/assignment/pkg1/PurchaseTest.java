/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment.pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0647456
 */
public class PurchaseTest {
    
    public PurchaseTest() {
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
     * Test of getProduct_id method, of class Purchase.
     */
    @Test
    public void testGetProduct_id() {
        System.out.println("getProduct_id");
        Purchase instance = new Purchase("1",500);
        String expResult = "1";
        String result = instance.getProduct_id();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setProduct_id method, of class Purchase.
     */
    @Test
    public void testSetProduct_id() {
        System.out.println("setProduct_id");
        String product_id = "1";
        Purchase instance = new Purchase();
        instance.setProduct_id(product_id);
        assertEquals(product_id, instance.getProduct_id());
    }

    /**
     * Test of getQuantity method, of class Purchase.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Purchase instance = new Purchase("1",500);
        int expResult = 500;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuantity method, of class Purchase.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 500;
        Purchase instance = new Purchase();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }
    
}
