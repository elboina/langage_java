/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.entity.Chambre;
import exercices.entity.Compte;
import exercices.exceptions.ChambreIndisponibleException;
import exercices.exceptions.DecouvertException;
import exercices.exceptions.OperationInterditeException;
import exercices.exceptions.SoldeInsuffisantException;
import exercices.services.ChambreService;
import exercices.services.OperationService;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class ExceptionsTest {

    public int divise(int a, int b) {

        int q = a / b;
        return q;

    }
//    @Test

    public void test1() {

        int a = 1;
        int b = 0;

        divise(a, b);

    }

    //@Test
    public void ajoutTest() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();

        Compte compteA = new Compte();

        compteA.setNomClient("A");
        compteA.setSolde(500F);

        Compte compteB = new Compte();

        compteB.setNomClient("B");
        compteB.setSolde(2000F);

        em.persist(compteA);
        em.persist(compteB);

        em.getTransaction().commit();

    }

//   @Test
    public void testTransfert() throws DecouvertException {

        OperationService op = new OperationService();
        try {
            op.transferer(1L,2L, 30000F);
        } catch(DecouvertException e){
            System.out.println("Vous ne disposez pas des autorisations pour cette opération.");
            
        }
        
    }

//    @Test
    public void testRetrait() throws DecouvertException, OperationInterditeException {
        OperationService op = new OperationService();
        
        try {
            op.retrait(1L, 1000F);
            
        } catch (DecouvertException e) {
            
            System.out.println("Vous ne disposez pas des autorisations pour cette opération.");
        } catch(OperationInterditeException ex)
        {
            System.out.println("La somme demandée dépasse le montant de retrait autorisé.");
        
        }


    }
    
//    @Test
    public void testInterets() {
        OperationService op = new OperationService();
        op.interetsAnnuels((float)1);
    }
    
//    @Test
    public void ajoutChambreTest() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();

        Chambre chambre = new Chambre();
        
        chambre.setDisponible(true);
        chambre.setNom("Suite royale");
        chambre.setPrix(1000F);

        em.persist(chambre);
        

        em.getTransaction().commit();

    }
    
    @Test
    public void reservation() throws SoldeInsuffisantException, ChambreIndisponibleException{
        ChambreService s = new ChambreService();
        try {
            s.reserver(51L, 1L);
            
        } catch (ChambreIndisponibleException e) {
            System.out.println("Désolé. La chambre que vous demandez est indisponible.");
        } catch (SoldeInsuffisantException e){
            System.out.println("Votre paiement a été rejeté. Veuillez utiliser un autre moyen de paiement ou réessayer");
        }
              
    }

}
