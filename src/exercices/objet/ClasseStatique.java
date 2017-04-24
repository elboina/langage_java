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
public class ClasseStatique {
    
  private static ClasseStatique singleton = null;
  private static int nbInstances= 0;
    
     
    private ClasseStatique() {
        nbInstances++;
    }
    
    public static ClasseStatique getInstance() {
    if(singleton != null)
    return singleton;
    singleton = new ClasseStatique();
    return singleton;
    }
    
    
    
    
    
    public static void afficheNbInstances(){
        
        System.out.println("Instances: " + ClasseStatique.nbInstances);
    }
}
