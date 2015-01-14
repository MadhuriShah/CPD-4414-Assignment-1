/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment.pkg1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0647610
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of getCustomerId method, of class Order.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Order instance = new Order();
        instance.setCustomerId("c001");
        String expResult = "c001";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCustomerId method, of class Order.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String customerId = "c001";
        Order instance = new Order();
        instance.setCustomerId(customerId);
      
    }

    /**
     * Test of getCustomerName method, of class Order.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Order instance = new Order();
        instance.setCustomerName("jim");
        String expResult = "jim";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCustomerName method, of class Order.
     */
    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String customerName = "jim";
        Order instance = new Order();
        instance.setCustomerName(customerName);
        
    }

    /**
     * Test of getTimeRecieved method, of class Order.
     */
    @Test
    public void testGetTimeRecieved() {
        System.out.println("getTimeRecieved");
        Order instance = new Order();
        instance.setTimeRecieved(new Date());
        Date expResult=new Date();
        Date result = instance.getTimeRecieved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTimeRecieved method, of class Order.
     */
    @Test
    public void testSetTimeRecieved() {
        System.out.println("setTimeRecieved");
        Date timeRecieved = new Date();
        Order instance = new Order();
        instance.setTimeRecieved(timeRecieved);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTimeProcessed method, of class Order.
     */
    @Test
    public void testGetTimeProcessed() {
        System.out.println("getTimeProcessed");
        Order instance = new Order();
        instance.setTimeProcessed(new Date());
        Date expResult = new Date();
        Date result = instance.getTimeProcessed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTimeProcessed method, of class Order.
     */
    @Test
    public void testSetTimeProcessed() {
        System.out.println("setTimeProcessed");
        Date timeProcessed = new Date();
        Order instance = new Order();
        instance.setTimeProcessed(timeProcessed);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTimeFulfilled method, of class Order.
     */
    @Test
    public void testGetTimeFulfilled() {
        System.out.println("getTimeFulfilled");
        Order instance = new Order();
        instance.setTimeFulfilled(new Date());
        Date expResult = new Date();
        Date result = instance.getTimeFulfilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTimeFulfilled method, of class Order.
     */
    @Test
    public void testSetTimeFulfilled() {
        System.out.println("setTimeFulfilled");
        Date timeFulfilled = new Date();
        Order instance = new Order();
        instance.setTimeFulfilled(timeFulfilled);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Order instance = new Order();
        instance.setNotes("first Order");
        String expResult = "first Order";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of setNotes method, of class Order.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "first Order";
        Order instance = new Order();
        instance.setNotes(notes);
        
    }
    
}
