/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.ShopMapPosition;
import facades.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author TimmosQuadros
 */
public class ShopMapPositionJpaController implements Serializable {

    public ShopMapPositionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ShopMapPosition shopMapPosition) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(shopMapPosition);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ShopMapPosition shopMapPosition) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            shopMapPosition = em.merge(shopMapPosition);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = shopMapPosition.getId();
                if (findShopMapPosition(id) == null) {
                    throw new NonexistentEntityException("The shopMapPosition with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ShopMapPosition shopMapPosition;
            try {
                shopMapPosition = em.getReference(ShopMapPosition.class, id);
                shopMapPosition.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shopMapPosition with id " + id + " no longer exists.", enfe);
            }
            em.remove(shopMapPosition);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ShopMapPosition> findShopMapPositionEntities() {
        return findShopMapPositionEntities(true, -1, -1);
    }

    public List<ShopMapPosition> findShopMapPositionEntities(int maxResults, int firstResult) {
        return findShopMapPositionEntities(false, maxResults, firstResult);
    }

    private List<ShopMapPosition> findShopMapPositionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ShopMapPosition.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ShopMapPosition findShopMapPosition(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ShopMapPosition.class, id);
        } finally {
            em.close();
        }
    }

    public int getShopMapPositionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ShopMapPosition> rt = cq.from(ShopMapPosition.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
