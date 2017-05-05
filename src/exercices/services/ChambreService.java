/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercices.entity.Chambre;
import exercices.entity.Compte;
import exercices.exceptions.ChambreIndisponibleException;
import exercices.exceptions.SoldeInsuffisantException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class ChambreService {
    
    public void reserver(Long idChambre, Long idCompte) throws SoldeInsuffisantException,ChambreIndisponibleException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        Chambre chambre = em.find(Chambre.class, idChambre);
        Compte compte = em.find(Compte.class, idCompte );
        
        if (!chambre.isDisponible()) {
            throw new ChambreIndisponibleException();
            
        }else if (compte.getSolde() < chambre.getPrix()) {
            
            throw new SoldeInsuffisantException();
            
        } else {
            compte.setSolde(compte.getSolde() - chambre.getPrix());
            chambre.setDisponible(false);
        }
        
        em.getTransaction().commit();
    }
    
}
