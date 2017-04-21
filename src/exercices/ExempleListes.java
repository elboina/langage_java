/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author formation
 */
public class ExempleListes {
    public static void main(String[] args) {
       //Liste non typée
//        ArrayList liste = new ArrayList();
//        
//        liste.add("La fierté des notres");
//        liste.add(new Date ());
//        liste.add(10);
//        
//        for(Object elem:liste)
//            System.out.println(elem);
//          Liste typée
//            ArrayList<String> titres = new ArrayList<>();
//            titres.add("Thriller");
//            titres.add("Hybrid Theory");
//            titres.add("Back in black");
//            
//            for(String titre:titres)
//            {
//                System.out.println(titre);
//            }


            ArrayList<String> A = new ArrayList<>();
            ArrayList<String> B = new ArrayList<>();
            
            A.add("a");
            A.add("b");
            A.add("c");
            
            B.add("d");
            B.add("e");
            B.add("f");
            
            ArrayList<String> C = new ArrayList<>();
            C.addAll(A); //Ajoute tous les éléments d'une liste A.
            C.addAll(B);
           System.out.println(C.contains("a")); // Renvoie un booléen selon la présence ou l'absence de l'élement.
           
           //Suppression de l'élément "a" de la listeC
           C.remove("a");
           
           System.out.println(C.contains("a"));
           
           for(String lettre:C)
           {
               System.out.println(lettre);
           }
            
            
            
    }
}
