/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Waqas
 */
public class ShopIT {
    
    public ShopIT() {
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
     * Test of getGoogleData method, of class Shop.
     */
    @Test
    public void testGetGoogleData() throws Exception {
        System.out.println("getGoogleData");
        Shop instance = new Shop();
        String expResult = "";
        String result = instance.getGoogleData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllShops method, of class Shop.
     */
    @Test
    public void testGetAllShops() {
        System.out.println("getAllShops");
        Shop instance = new Shop();
        String expResult = "";
        String result = instance.getAllShops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putXml method, of class Shop.
     */
    @Test
    public void testPutXml() {
        System.out.println("putXml");
        String content = "";
        Shop instance = new Shop();
        instance.putXml(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
