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
public class Client {
    private String nom;
    private String prenom;
    private int age;
    private Commande commande;
    
    public Client(String nom, String prenom, int age, Commande commande)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.commande = commande;
        
        
    }
    
    @Override
    public String toString() {
    return "Client : " + prenom + " " + nom + " " + age + " ans " + commande.toString();
    }
    
//    public void encoderClient() {
//
//        Scanner sca = new Scanner(System.in);
//        System.out.println("Quel est votre nom ?");
//        this.nom = sca.nextLine();
//        System.out.println("Quel est votre prénom ?");
//        this.prenom = sca.nextLine();
//        System.out.println("Quel âge avec vous ?");
//        this.age = sca.nextInt();
//        this.commande.encoderCommande();
//}

    
}
