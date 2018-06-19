/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2_3;

/**
 *
 * @author alumneDAM
 */
public class LlistaDeNodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pila<Persona> p1 = new Pila<Persona>();
       
        Persona persona = new Persona("Antonio","78451299A");
        Persona persona1 = new Persona("Juan","78451299A");
        Persona persona2 = new Persona("Luis","78451299A");
        
        
        p1.afegir(persona);
        p1.afegir(persona1);
        System.out.println(p1.mida());
        p1.treure();
        System.out.println(p1.mida());
        p1.buidar();
        System.out.println(p1.mida());
        p1.afegir(persona2);
        Object array[]=p1.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        
    }
    
}
