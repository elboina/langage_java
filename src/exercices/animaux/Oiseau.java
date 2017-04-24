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
public class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }
    
    
    @Override
    public void bouger() {
    System.out.println(super.getNom() +"  vole.");
    
    }
    
    @Override
    public void manger() {
    System.out.println(super.getNom() +"  mange des souris.");
    }
}
