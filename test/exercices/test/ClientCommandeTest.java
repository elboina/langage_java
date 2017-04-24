/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Client;
import exercices.objet.Commande;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ClientCommandeTest {
    @Test
    public void testConstructor(){

     Commande cmd = new Commande("une jolie lampe", 9.99);
    Client client = new Client("Blanc", "Sylvain", 32, cmd);
    
    System.out.println(client);
}
    
    
}
