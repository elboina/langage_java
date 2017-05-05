/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercices.entity.Compte;
import exercices.exceptions.DecouvertException;
import exercices.exceptions.OperationInterditeException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class OperationService {

    public void transferer(Long idCompteCible, Long idCompteOrigine, Float montant) throws DecouvertException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        Compte cible = em.find(Compte.class, idCompteCible);
        Compte origine = em.find(Compte.class, idCompteOrigine);

        Float soldeCible = cible.getSolde();
        Float soldeOrigine = origine.getSolde();
       

            if (soldeOrigine <= montant) {

                throw new DecouvertException();
            } else {
                cible.setSolde(soldeCible + montant);
                origine.setSolde(soldeOrigine - montant);
                

            }
        

//            throw new DecouvertException();
        em.getTransaction().commit();

    }

    public void retrait(Long idCompte, Float montant) throws DecouvertException, OperationInterditeException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Compte cible = em.find(Compte.class, idCompte);
        Float solde = cible.getSolde();
        Float plafond = 1000F;
        
            if (solde <= montant) {

                throw new DecouvertException();
            } else if (montant >= plafond) {
                throw new OperationInterditeException();
            } else {
                cible.setSolde(solde - montant);
                
            }
       

        em.getTransaction().commit();
    }
    
    public void interetsAnnuels(Float pourcentage)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
       em.getTransaction().begin();
        Query query = em.createQuery("SELECT c FROM Compte c");
        
        List<Compte> comptes = query.getResultList();
        
        for(Compte c:comptes){
            Float solde = c.getSolde();
            c.setSolde((1+ pourcentage/100) * solde);
            
        }
       
        
        em.getTransaction().commit();
    
    }

}
