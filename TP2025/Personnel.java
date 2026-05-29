package TP2025;

public abstract class Personnel {
    private String nom;

    public Personnel(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}