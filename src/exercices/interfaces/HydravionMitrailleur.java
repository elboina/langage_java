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
public class HydravionMitrailleur implements Flottant, Volant, Mitrailleur {

    @Override
    public void flotter() {
        System.out.println("Hydravion flotte.");
    }

    @Override
    public void voler() {
        System.out.println("Hydravion vole.");
    }

    @Override
    public void mitrailler() {
        System.out.println("Hydravion mitraille.");

    }

}
