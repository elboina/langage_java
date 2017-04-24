/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class AnimalTest {
    @Test
   public void testConstructeur(){
    Animal renard = new Animal();
    renard.setNom("Rox");
    renard.setGenre("Mammifère");
    renard.setNbPattes(4);
    Animal corbeau = new Animal();
    
    corbeau.setNom("Raven");
    corbeau.setNbPattes(2);
    corbeau.setGenre("Oiseau");
    
    renard.afficher();
    corbeau.afficher();
    
    Animal renard1 = new Animal("Chipper", 4, "Mammifère");
    renard1.afficher();
    
    Animal corbeau1 = new Animal("Pierre", 2, "Oiseau");
    corbeau1.afficher();
   }
}
