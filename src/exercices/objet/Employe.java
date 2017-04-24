/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

/**
 *
 * @author formation
 */
public class Employe extends Personne {

    
    private double salaire;

   public Employe(double salaire, String nom, String prenom) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        
        return super.toString() + " " + salaire + " €";
    }
    
}
