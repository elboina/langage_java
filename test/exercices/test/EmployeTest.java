/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Employe;
import exercices.objet.Responsable;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class EmployeTest {
    
    @Test
    public void Test(){
        Employe e = new Employe (3000, "Stevens", "Thomas");
        System.out.println(e);
        Employe e1 = new Employe (5000, "Morris", "Phillip");
        
        Set<Employe> employes = new HashSet<>();
        employes.add(e);
        employes.add(e1);
        Responsable r = new Responsable(employes, 5000, "Nolan", "Luke");
        
       System.out.println(r);
}
}
