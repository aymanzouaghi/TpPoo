package TP4;

public abstract class FormeGeometrique {
    protected String nom ;
       public FormeGeometrique(String nom) {
        this.nom = nom;
    }
    public abstract double perimetre ();
}
