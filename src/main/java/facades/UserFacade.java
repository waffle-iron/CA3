package facades;

import entity.Shop;
import security.IUserFacade;
import entity.User;
import facades.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import security.IUser;
import security.PasswordStorage;

public class UserFacade implements IUserFacade {

  EntityManagerFactory emf;
  ShopJpaController shopCtrl;

  public UserFacade(EntityManagerFactory emf) {
    this.emf = emf;
    shopCtrl = new ShopJpaController(emf);
  }

  private EntityManager getEntityManager() {
    return emf.createEntityManager();
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
  
  //Create
  public void create(Shop shop) {
      shopCtrl.create(shop);
  }
  
  
  //Retrieve
  public List<Shop> getAllShops(){
      return shopCtrl.findShopEntities();
  }
  
  //Update
  public void update(Shop shop) throws NonexistentEntityException, Exception {
      shopCtrl.edit(shop);
  }
  
  //Delete
  public void delete(Integer id) throws NonexistentEntityException {
      shopCtrl.destroy(id);
  }

}
