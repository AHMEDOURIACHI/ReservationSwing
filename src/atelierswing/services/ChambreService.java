/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Chambre;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.eclipse.persistence.jpa.rs.exceptions.PersistenceExceptionMapper;

/**
 *
 * @author formation
 */
public class ChambreService {

    public void supprimer(long id){
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Chambre chambre = em.find(Chambre.class, id);
        em.remove(chambre);
        em.getTransaction().commit();
    }
    
    public List<Chambre> lister(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT c FROM Chambre c ORDER BY c.nom").getResultList();
        
    }
    
    public void modifier(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Chambre chambre = em.find(Chambre.class, id);
        em.merge(chambre);
        em.getTransaction().commit();
    }
    
    public void ajouter(Chambre chambre) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        em.persist(chambre);
        em.getTransaction().commit();
    }

}