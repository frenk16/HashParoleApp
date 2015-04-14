/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author bel22638
 * 
 */

public class HashSetControl {

    int Parole, ParoleDiverse;
    HashSet set = new HashSet();
    String p[] = null;
    String text = "";

    public int LeggiHashSet() throws Exception {
        FileReader lettore = new FileReader("data/romanzo.txt");
        BufferedReader scanner = new BufferedReader(lettore);
        while (scanner.ready()) {
            String romanzo = scanner.readLine(); // Legge Tutto il romanzo 
            System.out.println(romanzo); // Scrive tutto il romanzo
            p = romanzo.split("|,|\\.|;|:|'|-|!|\\ ?"); // Separazione stringhe
            for (int i = 0; i < p.length; i++) { //ciclo per contare le parole
                if (set.contains(p[i])) {// ritorna vero se il set contiene quell'elemento
                    ParoleDiverse++;
                }
                set.add(p[i]); //aggiungi quell'elemento
                Parole++;
            }
            
            System.out.println("\n\n"+set.toString());// converte il vettore in stringa
            Iterator it = set.iterator();// restituisce un iterator sopra all'elemento set
            while (it.hasNext()) {
                System.out.print("Lettera:(" + it.next().toString() + ")\t");
            }
            
            System.out.println("\n\n"+"Numero di parole: " + Parole);
        
        }
        return ParoleDiverse;
        }


}
