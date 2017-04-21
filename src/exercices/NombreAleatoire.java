/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;


import java.util.Scanner;

/**
 *
 * @author formation
 */
public class NombreAleatoire {
    public static void main(String[] args) {
//        String rep;
//        do{
//        rechercheNombre();
//        System.out.println("Voulez vous rejouer une partie ?");
//        Scanner scan = new Scanner(System.in);
//        rep = scan.nextLine();
//        } while( rep.equals("oui"));
        
      rechercheNombre();
    }
    
    public static void rechercheNombre() {
        Scanner sca = new Scanner(System.in);
        
        int nbrecherche = (int) (Math.random() * 100);
        int nbessais = 0;
        
        
        System.out.println(nbrecherche);
        System.out.println("Entrez un nombre compris entre 0 et 100");
        
        int nbmystere = sca.nextInt();
        nbessais++;
        
       
        while(nbmystere !=nbrecherche) { 
            if (nbmystere < nbrecherche) {
                System.out.println("Le nombre saisi est trop petit.");
                
            }
            
            else if (nbmystere > nbrecherche)
            {
                System.out.println("Le nombre saisi est trop grand.");
                
            }
            
            nbmystere = sca.nextInt();
            
            nbessais++;
            
        } 
            
                     
        
            System.out.println("Bravo ! Vous avez trouvé le nombre caché !");
            System.out.println("Il vous a fallu " + nbessais + " essais pour y arriver.");
            if(nbessais <= 3)
            {
                System.out.println("Votre score est : ***");
            }
            else if(nbessais <= 6)
            {
                System.out.println("Votre score est : **");
            }
            else
            {
                System.out.println("Vous êtes nul.");
            }
     
            
            String rep;
            
            System.out.println("Voulez-vous continuer ?");
            rep = sca.next();
            if(rep.equals("oui"))
            {
                rechercheNombre();
            }
            
            else
            {
                System.out.println("A bientôt.");
            }
        
    }
}
