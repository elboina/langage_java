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
public class Collection {
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
            ArrayList<String> titres = new ArrayList<String>();
            titres.add("Thriller");
            titres.add("Hybrid Theory");
            titres.add("Back in black");
            
            for(String titre:titres)
            {
                System.out.println(titre);
            }
    }
}
