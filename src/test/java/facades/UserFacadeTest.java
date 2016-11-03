/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.Shop;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import security.IUser;

/**
 *
 * @author Waqas
 */
public class UserFacadeTest {
    
    public UserFacadeTest() {
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
     * Test of getUserByUserId method, of class UserFacade.
     */
    @Test
    public void testGetUserByUserId() {
        System.out.println("getUserByUserId");
        String id = "";
        UserFacade instance = null;
        IUser expResult = null;
        IUser result = instance.getUserByUserId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticateUser method, of class UserFacade.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        String userName = "";
        String password = "";
        UserFacade instance = null;
        List<String> expResult = null;
        List<String> result = instance.authenticateUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UserFacade.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Shop shop = null;
        UserFacade instance = null;
        instance.create(shop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllShops method, of class UserFacade.
     */
    @Test
    public void testGetAllShops() {
        System.out.println("getAllShops");
        UserFacade instance = null;
        List<Shop> expResult = null;
        List<Shop> result = instance.getAllShops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserFacade.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Shop shop = null;
        UserFacade instance = null;
        instance.update(shop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserFacade.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Integer id = null;
        UserFacade instance = null;
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
