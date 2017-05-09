/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.services;

import atelierswing.entity.Chambre;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.eclipse.persistence.jpa.rs.exceptions.PersistenceExceptionMapper;

/**
 *
 * @author formation
 */
public class ChambreService {

    public void ajouter(Chambre chambre) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        em.persist(chambre);
        em.getTransaction().commit();
    }

}
