/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4;

import act2_3.Pila;
import java.util.Arrays;

/**
 *
 * @author paco
 */
public class ManipularFigures{
    
    /**
     *
     * @param fig
     * @return
     */
    public double mitjanaPerimetres(Pila<Figura>fig){
        double total=0;
     Figura array[]= fig.toArray();
      
        for (Figura figura : array) {
             total=+figura.area();
            
        }
       return total/array.length;
    }
   
    public <T extends Figura>Figura[] arrayOrdenat(T[] t){
      Figura[] arrayordenado =(Figura[]) new Object[t.length];
        Arrays.sort(arrayordenado);
      return arrayordenado; 
    }
    
}
