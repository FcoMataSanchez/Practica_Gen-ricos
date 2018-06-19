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
public class Persona implements Comparable<Persona> {
    private String nom;
    private String nif;

    public Persona(String nom, String nif) {
        this.nom = nom;
        this.nif = nif;
    }

    @Override
    public int compareTo(Persona p) {
       return nom.compareTo(p.getNom());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", nif=" + nif + '}';
    }
    
    
}
