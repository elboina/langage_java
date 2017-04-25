/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.interfaces;

/**
 *
 * @author formation
 */
public class BombardierFlottant implements Volant, Bombardant, Mitrailleur, Flottant {

    @Override
    public void voler() {
        System.out.println("BombardierFlottant vole");
    }

    @Override
    public void bombarder() {
        System.out.println("BombardierFlottant bombarde.");
    }

    @Override
    public void mitrailler() {
        System.out.println("BombardierFlottant mitraille.");
    }

    @Override
    public void flotter() {
        System.out.println("BombardierFlottant flotte.");
    }

}
