/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.OpenClose;
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
public class OpenCloseJpaController implements Serializable {

    public OpenCloseJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OpenClose openClose) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(openClose);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OpenClose openClose) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            openClose = em.merge(openClose);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = openClose.getId();
                if (findOpenClose(id) == null) {
                    throw new NonexistentEntityException("The openClose with id " + id + " no longer exists.");
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
            OpenClose openClose;
            try {
                openClose = em.getReference(OpenClose.class, id);
                openClose.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The openClose with id " + id + " no longer exists.", enfe);
            }
            em.remove(openClose);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OpenClose> findOpenCloseEntities() {
        return findOpenCloseEntities(true, -1, -1);
    }

    public List<OpenClose> findOpenCloseEntities(int maxResults, int firstResult) {
        return findOpenCloseEntities(false, maxResults, firstResult);
    }

    private List<OpenClose> findOpenCloseEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OpenClose.class));
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

    public OpenClose findOpenClose(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OpenClose.class, id);
        } finally {
            em.close();
        }
    }

    public int getOpenCloseCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OpenClose> rt = cq.from(OpenClose.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
