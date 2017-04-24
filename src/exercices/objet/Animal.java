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
public class Animal {
    
    private String nom;
    private int nbPattes;
    private String genre;
    
    public String getNom() {
    
        return this.nom;
    }
public void setNom(String nom) {
this.nom = nom;
}

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
   
    public void afficher() {
    System.out.println(this.nom + " " + this.nbPattes + " pattes " + this.genre);
    }
    
    public Animal()
    {}

    public Animal(String nom, int nbPattes, String genre) {
        this.nom = nom;
        this.nbPattes = nbPattes;
        this.genre = genre;
    }
}
