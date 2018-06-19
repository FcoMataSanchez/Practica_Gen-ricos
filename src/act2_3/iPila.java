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
 */
public interface iPila<E>  {
  
 public void afegir(E e);
 
 public E treure();
 
 public void buidar();
 
 public int mida();
 
 public E[] toArray();
    
      
}
