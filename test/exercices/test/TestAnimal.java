/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.animaux.Oiseau;
import exercices.animaux.Poisson;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class TestAnimal {
    
    @Test
    public void test()
    {
    Poisson poisson = new Poisson("Nemo");
    Oiseau oiseau = new Oiseau("Iago");
    
    oiseau.bouger();
    oiseau.manger();
    poisson.bouger();
    poisson.manger();
    }
}
