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
public class Variable {
    public static void main(String[] args) {
//        //Entiers
//        byte b= 1;
//        short s = 32000;
//        int a=123;
//        long l = 1219587985;
//        
//        //Décimal
//        double d = 123.456;
//        float f = (float) 123.456;
//        
//        //Texte
//        String str = "coucou";
          String a = "Bonjour";
          String b = "Tout le monde";
          System.out.println(a + " " + b);
          System.out.println("Entrez un texte.");
          Scanner scanner = new Scanner(System.in);
          String txtConsole = scanner.nextLine();
          System.out.println("Vous avez entré : " + txtConsole);

//        
//        //Booléen
//        boolean bool = true;
        
        
        System.out.println(puissance(2, 3));
       
    }
    
    public static long puissance(long n, long exposant) {
    long m = 1;
    
        for (long i = 0; i < exposant; i++) {
            m = m*n;
            
        }
        
        return m;
    }
}
