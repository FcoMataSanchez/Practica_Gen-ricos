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
public class M  {
    private String nom;
    private String otro;

    public M(String nom, String otro) {
        this.nom = nom;
        this.otro = otro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    @Override
    public String toString() {
        return "M{" + "nom=" + nom + ", otro=" + otro + '}';
    }
    
    
    
    
    
}
