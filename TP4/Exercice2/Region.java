package TP4;
import java.lang.Comparable;
public class Region implements Comparable<Region> {
    private String nom ; 
    private int nbHabitants ; 
    private int milliardsPib ;
    private int superficie ; 

    public Region(String nom, int nbHabitants, int milliardsPib, int superficie) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.milliardsPib = milliardsPib;
        this.superficie = superficie;
    }
        public String getNom() { return nom; }
    public int getNbHabitants() { return nbHabitants; }
    public int getPib() { return milliardsPib; }
    public int getSuperficie() { return superficie; }
    
    @Override
    public String toString() {
        return "Region : " + nom 
            + " | Habitants : " + nbHabitants 
            + " | PIB : " + milliardsPib 
            + " | Superficie : " + superficie;
    }
    @Override
    public int compareTo(Region r) {
        return this.getNom().compareTo(r.getNom());
    }
}
