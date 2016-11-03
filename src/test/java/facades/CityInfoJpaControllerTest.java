/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.CityInfo;
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
public class CityInfoJpaControllerTest {
    
    public CityInfoJpaControllerTest() {
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
     * Test of getEntityManager method, of class CityInfoJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        CityInfoJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class CityInfoJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        CityInfo cityInfo = null;
        CityInfoJpaController instance = null;
        instance.create(cityInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class CityInfoJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        CityInfo cityInfo = null;
        CityInfoJpaController instance = null;
        instance.edit(cityInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class CityInfoJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        String id = "";
        CityInfoJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCityInfoEntities method, of class CityInfoJpaController.
     */
    @Test
    public void testFindCityInfoEntities_0args() {
        System.out.println("findCityInfoEntities");
        CityInfoJpaController instance = null;
        List<CityInfo> expResult = null;
        List<CityInfo> result = instance.findCityInfoEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCityInfoEntities method, of class CityInfoJpaController.
     */
    @Test
    public void testFindCityInfoEntities_int_int() {
        System.out.println("findCityInfoEntities");
        int maxResults = 0;
        int firstResult = 0;
        CityInfoJpaController instance = null;
        List<CityInfo> expResult = null;
        List<CityInfo> result = instance.findCityInfoEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCityInfo method, of class CityInfoJpaController.
     */
    @Test
    public void testFindCityInfo() {
        System.out.println("findCityInfo");
        String id = "";
        CityInfoJpaController instance = null;
        CityInfo expResult = null;
        CityInfo result = instance.findCityInfo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCityInfoCount method, of class CityInfoJpaController.
     */
    @Test
    public void testGetCityInfoCount() {
        System.out.println("getCityInfoCount");
        CityInfoJpaController instance = null;
        int expResult = 0;
        int result = instance.getCityInfoCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
