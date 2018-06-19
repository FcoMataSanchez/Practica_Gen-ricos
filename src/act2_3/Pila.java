/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2_3;

import java.util.ArrayList;

/**
 *
 * @author alumneDAM
 * 
 **/

public class Pila<E> implements iPila<E> {
  private Node ultim=null;
  private E[] arraye;
    public int i=0;
    
    
    @Override
    public void afegir(E e) {
         Node nou=new Node(ultim,e);
        ultim=nou;
        this.i++;
    }

    @Override
    public void buidar() {
         while(ultim!=null){
             this.i--;
         this.ultim=ultim.getPare();
     }
    }

    @Override
    public int mida() {
      return this.i;
    }

    @Override
    public E[] toArray() {
        int z=0;
       E[]arraye=(E[])new Object[this.i];
         Node control=this.ultim;
        while(control!=null){
            arraye[z]=control.e;
            z++;
            control=control.pare;
        }
        return arraye;
    }

    @Override
    public E treure() {
        E e=null;
        if (this.ultim != null) {
            this.i--;
            e=this.ultim.getValor();
           this.ultim=this.ultim.getPare();
        }
        return e;
    }

  
   
    
    private class Node{
    Node pare;
    E e;
    Node(Node pare,E e){
        this.pare=pare;
        this.e=e;
    }

        public Node getPare() {
            return pare;
        }

        public void setPare(Node pare) {
            this.pare = pare;
        }

        public E getValor() {
            return e;
        }

        public void setValor(E e) {
            this.e = e;
        }
    
    
}
     
    
}
