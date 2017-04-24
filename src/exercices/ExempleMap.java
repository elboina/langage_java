/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author formation
 */
public class ExempleMap {
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<>();
        map.put("Intrinsèque", "Qui est inhérent à quelque chose. Qui lui appartient en propre.");
        map.put("ésotérique", "Qui ne peut être compris que par les initiés.");
        
//        System.out.println("Esotérique : " + map.get("ésotérique"));
        
        java.util.Set<String> cles = map.keySet();
        
        for(String cle:cles)
        {
            System.out.println(cle + " : " + map.get(cle));
        }
        
        map.remove("ésotérique");
        
        System.out.println(map);
    }
}
