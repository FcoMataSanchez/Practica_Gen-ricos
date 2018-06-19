
package act4;

/**
 *
 * @author paco
 * @param <T>
 */
abstract public class Figura implements Comparable<Figura> {
    private String nom;
   
    public Figura(String nom) {
        this.nom = nom;
    }

    public Figura() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public abstract double area();
    
    public abstract double perimetre();

    
    @Override
    public int compareTo(Figura t){
        int salida=0;
      if(this.area()>t.area()){
          salida=1;
      }else if(this.area()<t.area()){
          salida=-1;
      }
     return salida;
              }
    
    
}
