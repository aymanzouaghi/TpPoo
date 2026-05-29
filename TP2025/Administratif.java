package TP2025;

public class Administratif extends Personnel {

    public Administratif(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return "Personnel administratif, " + getNom();
    }
}