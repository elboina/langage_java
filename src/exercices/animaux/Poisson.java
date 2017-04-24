/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.animaux;

/**
 *
 * @author formation
 */
public class Poisson extends Animal {

    public Poisson(String nom) {
        super(nom);
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNom() {
        return super.getNom(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void manger()
    {
        System.out.println(super.getNom() +"  mange des planctons.");
    }
    
    @Override
    public void bouger() {
    System.out.println(super.getNom() + " nage.");
    }
}
