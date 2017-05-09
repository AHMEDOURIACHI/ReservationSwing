/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Hotel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HotelServices {
    
    
    public List<Hotel> lister(){
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT h FROM Hotel h ORDER BY h.nom").getResultList();
        
        
    }
    
    public void ajouter(Hotel hotel){
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(hotel);
        em.getTransaction().commit();
    }
    
}
