/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.ShopMapPosition;
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
public class ShopMapPositionJpaControllerTest {
    
    public ShopMapPositionJpaControllerTest() {
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
     * Test of getEntityManager method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ShopMapPositionJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ShopMapPosition shopMapPosition = null;
        ShopMapPositionJpaController instance = null;
        instance.create(shopMapPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        ShopMapPosition shopMapPosition = null;
        ShopMapPositionJpaController instance = null;
        instance.edit(shopMapPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Integer id = null;
        ShopMapPositionJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShopMapPositionEntities method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testFindShopMapPositionEntities_0args() {
        System.out.println("findShopMapPositionEntities");
        ShopMapPositionJpaController instance = null;
        List<ShopMapPosition> expResult = null;
        List<ShopMapPosition> result = instance.findShopMapPositionEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShopMapPositionEntities method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testFindShopMapPositionEntities_int_int() {
        System.out.println("findShopMapPositionEntities");
        int maxResults = 0;
        int firstResult = 0;
        ShopMapPositionJpaController instance = null;
        List<ShopMapPosition> expResult = null;
        List<ShopMapPosition> result = instance.findShopMapPositionEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findShopMapPosition method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testFindShopMapPosition() {
        System.out.println("findShopMapPosition");
        Integer id = null;
        ShopMapPositionJpaController instance = null;
        ShopMapPosition expResult = null;
        ShopMapPosition result = instance.findShopMapPosition(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShopMapPositionCount method, of class ShopMapPositionJpaController.
     */
    @Test
    public void testGetShopMapPositionCount() {
        System.out.println("getShopMapPositionCount");
        ShopMapPositionJpaController instance = null;
        int expResult = 0;
        int result = instance.getShopMapPositionCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
