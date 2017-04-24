/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

import java.util.Set;

/**
 *
 * @author formation
 */
public class Responsable extends Employe {
    private Set<Employe> employes;

    public Set<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Set<Employe> employes) {
        this.employes = employes;
    }

    public Responsable(Set<Employe> employes, double salaire, String nom, String prenom) {
        super(salaire, nom, prenom);
        this.employes = employes;
    }

    @Override
    public String toString() {
        return super.toString() + " employes : " + employes + '}';
    }

    
    
}
