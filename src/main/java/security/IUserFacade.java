/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import entity.Shop;
import entity.User;
import facades.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author lam
 */
public interface IUserFacade {

    /*
    Return the Roles if users could be authenticated, otherwise null
     */
    List<String> authenticateUser(String userName, String password);

    IUser getUserByUserId(String id);
    
    public Shop create(Shop shop);
    
    public List<Shop> getAllShops();
    
    public void update(Shop shop) throws NonexistentEntityException, Exception;
    
    public void delete(Integer id) throws NonexistentEntityException;
    
}
