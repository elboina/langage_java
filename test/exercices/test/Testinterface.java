/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.Flottant;
import exercices.interfaces.HydravionMitrailleur;
import exercices.interfaces.Mitrailleur;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class Testinterface {

    @Test
    public void Test() {
        BombardierFlottant bf1 = new BombardierFlottant();
        BombardierFlottant bf2 = new BombardierFlottant();
        HydravionMitrailleur hydrav = new HydravionMitrailleur();
        HydravionMitrailleur hydra2 = new HydravionMitrailleur();
        
        //Création d'une liste de flottants

        List<Flottant> listeFlotteurs = new ArrayList<>();
        listeFlotteurs.add(bf2);
        listeFlotteurs.add(bf1);
        
        //Création d'une liste de mitrailleurs.
        List<Mitrailleur> listeMitrailleurs = new ArrayList<>();
        listeMitrailleurs.add(bf1);
        listeMitrailleurs.add(bf2);
        listeMitrailleurs.add(hydrav);
        listeMitrailleurs.add(hydra2);

        //Création d'une liste de bombardants
        List<Bombardant> listeBombardiers = new ArrayList<>();
        listeBombardiers.add(bf1);
        listeBombardiers.add(bf2);
        
        //Itération

        for (Flottant flotteur : listeFlotteurs) {
            flotteur.flotter();
        }

        for (Bombardant bombardier : listeBombardiers) {
            bombardier.bombarder();
        }

        for (Mitrailleur mitrailleur : listeMitrailleurs) {
            mitrailleur.mitrailler();
        }
    }
}
