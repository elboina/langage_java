/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

import java.util.Scanner;

/**
 *
 * @author formation
 */
public class Commande {
    private String description;
    private double prix;
    
    public Commande(String description, double prix) {
    
        this.description = description;
        this.prix = prix;
    }
    
    @Override
    public String toString() {
    
        return "Commande : " + description + " prix : " + prix + " €";
    }
    
//    public void encoderCommande()
//    {
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Décrivez votre commande.");
//       this.description = scan.nextLine();
//       
//       System.out.println("Quel est son prix en euros ?");
//       this.prix = scan.nextDouble();
//    }
}
