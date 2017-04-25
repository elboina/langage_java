/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.animaux.Animal;
import exercices.animaux.Oiseau;
import exercices.animaux.Poisson;
import exercices.animaux.Serpent;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class TestAnimal {

    @Test
    public void test() {
        Poisson poisson = new Poisson("Jean-Frédéric");
        Oiseau oiseau = new Oiseau("Iago");
        Serpent serpent = new Serpent("Evans");

//    oiseau.bouger();
//    oiseau.manger();
//    poisson.bouger();
//    poisson.manger();
//    serpent.bouger();
//    serpent.manger();
        ArrayList<Animal> list = new ArrayList<>();
        list.add(poisson);
        list.add(new Poisson("Sebastian"));
        list.add(oiseau);
        list.add(new Oiseau("Sam"));
        list.add(serpent);
        list.add(new Serpent("Wallace"));

        for (Animal animal : list) {
            animal.bouger();
            animal.manger();
        }
    }
}
