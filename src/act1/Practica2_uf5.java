/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

/**
 *
 * @author alumneDAM
 */
public class Practica2_uf5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       M m=new M("claseM","hola");
        
        
        InfoClasse<M> ic=new InfoClasse<>(M.class);
        System.out.println(ic.nomClase());
        System.out.println(ic.nomCompletClasse());
        System.out.println(ic.nomSuperClasse());
        System.out.println(ic.nomsAtributs());
        System.out.println(ic.nomsMetodes());
       
    }
    
}
