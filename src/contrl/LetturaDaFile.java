/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrl;

import model.HashSetControl;


public class LetturaDaFile {

    
    public static void main(String[] args) throws Exception  {
    
    HashSetControl controllo = new HashSetControl();
        System.out.println("Numero di parole diverse: "+controllo.LeggiHashSet());
    
            }
    
}
