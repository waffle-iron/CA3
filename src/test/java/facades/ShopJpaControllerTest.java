/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.Shop;
import java.util.List;
import javax.persistence.EntityManager;
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
public class ShopJpaControllerTest {
    
    public ShopJpaControllerTest() {
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
     * Test of getEntityManager method, of class ShopJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ShopJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ShopJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Shop shop = null;
        ShopJpaController instance = null;
        instance.create(shop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class ShopJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Shop shop = null;
        ShopJpaController instance = null;
        instance.edit(shop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ShopJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Integer id = null;
        ShopJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShopEntities method, of class ShopJpaController.
     */
    @Test
    public void testFindShopEntities_0args() {
        System.out.println("findShopEntities");
        ShopJpaController instance = null;
        List<Shop> expResult = null;
        List<Shop> result = instance.findShopEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShopEntities method, of class ShopJpaController.
     */
    @Test
    public void testFindShopEntities_int_int() {
        System.out.println("findShopEntities");
        int maxResults = 0;
        int firstResult = 0;
        ShopJpaController instance = null;
        List<Shop> expResult = null;
        List<Shop> result = instance.findShopEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShop method, of class ShopJpaController.
     */
    @Test
    public void testFindShop() {
        System.out.println("findShop");
        Integer id = null;
        ShopJpaController instance = null;
        Shop expResult = null;
        Shop result = instance.findShop(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShopCount method, of class ShopJpaController.
     */
    @Test
    public void testGetShopCount() {
        System.out.println("getShopCount");
        ShopJpaController instance = null;
        int expResult = 0;
        int result = instance.getShopCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
