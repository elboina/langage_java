/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Arrays;

/**
 *
 * @author formation
 */

/**
 * Exercices sur tableaux à deux dimensions
 * @author formation
 */
public class Tableaux {
    public static void main(String[] args) {
        String[][] tab;
        tab = new String [10][10];
        
        creerTableau(tab);
        
        afficherTableau(tab);
        
        System.out.println();
        String[][] tab1 = nouveauTableau(tab,5);
        afficherTableau(tab1);
        
        
    }
    
    /**
     * Remplit un tableau avec des étoiles
     * @param tableau un tableau à deux dimensions
     * @return Un tableau à deux dimensions rempli avec des étoiles
     */
    public static String [][] creerTableau(String[][] tableau)
      {
          //Remplit itérativement le tableau avec des étoiles.
           for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[0].length; j++) {
                tableau[i][j] = "*";
                
                
            }
            
        }
          
        return tableau;
    }
    
    /**
     * Place des signes dollars dans le tableau à des emplacements aléatoires
     * @param tableau un tableau à deux dimensions
     * @param nbSignes le nombre d'éléments du tableau à remplacer
     * @return un tableau où certains caractères sont remplacés par un signe dollar
     */
    
   public static String[][] nouveauTableau(String[][] tableau, int nbSignes){
        String [][] tab2 = tableau;
       int row = (int)(Math.random() * tableau.length);
       int col = (int)(Math.random() * tableau.length);
       for (int i = 0; i < nbSignes; i++) {
           if(tab2[row][col].equals("s")){
           tab2[row][col] = "$";
           }
           
           else
           {
               row = (int)(Math.random() * tableau.length);
           col = (int)(Math.random() * tableau[0].length);
           
           tab2[row][col] = "$";
           
           }
           
           row = (int)(Math.random() * tableau.length);
           col = (int)(Math.random() * tableau.length);
       }
       
       return tab2;
    }
   
   public static void afficherTableau( String[][] tab)
   {
       for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                
                System.out.print(tab[i][j]);
                
            }
            System.out.println();
        }
   }
}
