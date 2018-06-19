/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author alumneDAM
 * @param <I>
 */
public class InfoClasse<I>  {

 private Class<I> claseI;   

    public InfoClasse(Class<I> claseI) {
        this.claseI = claseI;
    }

    public Class<I> getClaseI() {
        return claseI;
    }

    public void setClaseI(Class<I> claseI) {
        this.claseI = claseI;
    }

   public String nomSuperClasse(){
      return this.claseI.getSuperclass().getSimpleName();
   }
    
   public String nomCompletClasse(){
       return this.claseI.getCanonicalName();
   }
   
   public String nomClase(){
       return this.claseI.getName();
   } 
   
   
   public ArrayList<String> nomsAtributs(){
       Field[]f=this.claseI.getDeclaredFields();
       ArrayList<String> noms1 = new ArrayList<>();
        for(Field e : f){
            noms1.add(e.getName());
        }
        return noms1;
   }
       
   
   public ArrayList<String> nomsMetodes(){
       Method[]m=this.claseI.getDeclaredMethods();
        ArrayList<String> noms1 = new ArrayList<>();
             for(Method e : m){
            noms1.add(e.getName());
        }
        return noms1;
   }
   
   
   
   public I  instancia() throws InstantiationException, IllegalAccessException{
       return this.claseI.newInstance();
   }
   
   /*
   public Object clonar () throws CloneNotSupportedException{
       Object obj=null;
       return super.clone();
   }*/
    
}
