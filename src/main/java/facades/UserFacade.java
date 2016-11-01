package facades;

import entity.Role;
import security.IUserFacade;
import entity.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import security.IUser;
import security.PasswordStorage;

public class UserFacade implements IUserFacade {

  EntityManagerFactory emf;

  public UserFacade(EntityManagerFactory emf) {
    this.emf = emf;   
    insertData();
  }

  private EntityManager getEntityManager() {
    return emf.createEntityManager();
  }
  
  
  private void insertData(){
      EntityManager em = getEntityManager();
      
      try {
      System.out.println("Creating TEST Users");
      if (em.find(User.class, "user") == null) {
        em.getTransaction().begin();
        Role userRole = new Role("User");
        Role adminRole = new Role("Admin");
        User user = new User("user", "test");
        user.addRole(userRole);
        User admin = new User("admin", "test");
        admin.addRole(adminRole);
        User both = new User("user_admin", "test");
        both.addRole(userRole);
        both.addRole(adminRole);
        em.persist(userRole);
        em.persist(adminRole);
        em.persist(user);
        em.persist(admin);
        em.persist(both);
        em.getTransaction().commit();
        System.out.println("Created TEST Users");
      }
    } catch (Exception ex) {
      Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
      em.getTransaction().rollback();
    } finally {
      em.close();
    }
  }

  @Override
  public IUser getUserByUserId(String id) {
    EntityManager em = getEntityManager();
    try {
      return em.find(User.class, id);
    } finally {
      em.close();
    }
  }

  /*
  Return the Roles if users could be authenticated, otherwise null
   */
  @Override
  public List<String> authenticateUser(String userName, String password) {
    IUser user = getUserByUserId(userName);
    try {
      return user != null && PasswordStorage.verifyPassword(password, user.getPassword()) ? user.getRolesAsStrings() : null;
    } catch (PasswordStorage.CannotPerformOperationException | PasswordStorage.InvalidHashException ex) {
      Logger.getLogger(UserFacade.class.getName()).log(Level.SEVERE, null, ex);
      return null;
    }
  }

}
