/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class ClientService {
    
    
    public List<Client> ListerClient(){
        
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query  requete= em.createQuery("SELECT c FROM Client c");
        
        return requete.getResultList();
        
    }
    
    public void Ajouter(Client client){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
        
    }
    
    
    public void modifier (Client client){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
        
    }
    
     public Client select (Long id){
        
        EntityManager em=Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        
        em.getTransaction().begin();
        Client c =em.find(Client.class, id);
        em.getTransaction().commit();
        
        return c;
    }
     
     
    public void supprimer (Long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Client.class, id));
        em.getTransaction().commit();
    }
    
}
