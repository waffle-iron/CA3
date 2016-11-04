package test;

import entity.User;
import facades.UserFacade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import security.PasswordStorage;

/**
 *
 * @author lam
 */
public class FacadeTest {
  
    private static EntityManagerFactory emf;
    private static UserFacade facade;
    private static EntityManager em;
    
  public FacadeTest() {
      emf = Persistence.createEntityManagerFactory("PU_TEST");
      facade = new UserFacade(emf);
  }
  
  @BeforeClass
  public static void setUpClass() {
        
  }
  
  @Before
  public void setUp() {
      em = emf.createEntityManager();
      em.getTransaction().begin();
  }
  
  @After 
    public void tearDown() {
        if (em != null) {
          em.close();
        }
    }
  
  @Test  
  public void dummyTest(){
    assertTrue(true);  //Really "nothing" to test in the initial version of the seed
  }
  
}
