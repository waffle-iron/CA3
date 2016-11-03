/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.OpenClose;
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
public class OpenCloseJpaControllerTest {
    
    public OpenCloseJpaControllerTest() {
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
     * Test of getEntityManager method, of class OpenCloseJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        OpenCloseJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class OpenCloseJpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        OpenClose openClose = null;
        OpenCloseJpaController instance = null;
        instance.create(openClose);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class OpenCloseJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        OpenClose openClose = null;
        OpenCloseJpaController instance = null;
        instance.edit(openClose);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class OpenCloseJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Integer id = null;
        OpenCloseJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOpenCloseEntities method, of class OpenCloseJpaController.
     */
    @Test
    public void testFindOpenCloseEntities_0args() {
        System.out.println("findOpenCloseEntities");
        OpenCloseJpaController instance = null;
        List<OpenClose> expResult = null;
        List<OpenClose> result = instance.findOpenCloseEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOpenCloseEntities method, of class OpenCloseJpaController.
     */
    @Test
    public void testFindOpenCloseEntities_int_int() {
        System.out.println("findOpenCloseEntities");
        int maxResults = 0;
        int firstResult = 0;
        OpenCloseJpaController instance = null;
        List<OpenClose> expResult = null;
        List<OpenClose> result = instance.findOpenCloseEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOpenClose method, of class OpenCloseJpaController.
     */
    @Test
    public void testFindOpenClose() {
        System.out.println("findOpenClose");
        Integer id = null;
        OpenCloseJpaController instance = null;
        OpenClose expResult = null;
        OpenClose result = instance.findOpenClose(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenCloseCount method, of class OpenCloseJpaController.
     */
    @Test
    public void testGetOpenCloseCount() {
        System.out.println("getOpenCloseCount");
        OpenCloseJpaController instance = null;
        int expResult = 0;
        int result = instance.getOpenCloseCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
