/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Client;
import atelierswing.entity.Hotel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class HotelServices {
    
    
    public List<Hotel> listerHotel(){
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        
         Query  requete= em.createQuery(" SELECT (h) FROM Hotel h");
        
        return requete.getResultList();
        
        
    }
    
    public void ajouter(Hotel hotel){
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(hotel);
        em.getTransaction().commit();
    }
    
    public void modifier (Hotel hotel){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(hotel);
        em.getTransaction().commit();
        
    }
    
    public Hotel SelectHotel(Long id){
        
        
        EntityManager  em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Hotel h = em.find(Hotel.class, id);
        em.getTransaction().commit();
        return h;
           
    }
    
    
    public void supprimerhotel(Long id){
            EntityManager  em= Persistence.createEntityManagerFactory("PU").createEntityManager();
            em.getTransaction().begin();
            em.remove(em.find(Hotel.class, id));
            em.getTransaction().commit();
            
           
        
        
    }
    
}
