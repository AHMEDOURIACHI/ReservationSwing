/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Reservation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class ReservationService {
    public void ajouterRes(Reservation res){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(res);
        em.getTransaction().commit();
    }
    
    public List<Reservation> listerRes(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT res FROM Reservation res ORDER BY res.numReser").getResultList();
    }
    
    public void modifierRes (long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        Reservation res = em.find(Reservation.class, id);
        em.merge(res);
        em.getTransaction().commit();
    }
    
    public void supprimerRes(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        Reservation res = em.find(Reservation.class, id);
        em.remove(res);
        em.getTransaction().commit();
    }
}