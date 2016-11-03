/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Waqas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({facades.ShopJpaControllerTest.class, facades.ShopMapPositionJpaControllerTest.class, facades.AddressJpaControllerTest.class, facades.exceptions.ExceptionsSuite.class, facades.CityInfoJpaControllerTest.class, facades.UserFacadeTest.class, facades.OpenCloseJpaControllerTest.class})
public class FacadesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
