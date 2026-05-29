package TP2025;


public class Enseignant extends Personnel {
    private String nomCursus;

    public Enseignant(String nom, String nomCursus) {
        super(nom);
        this.nomCursus = nomCursus;
    }

    public String getNomCursus() {
        return nomCursus;
    }

    @Override
    public String toString() {
        return "Enseignant, " + getNom() + ", " + nomCursus;
    }
}