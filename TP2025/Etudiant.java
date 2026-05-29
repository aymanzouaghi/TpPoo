package TP2025;

public class Etudiant {
    private int identifiant;
    private double moyenne;
    private String choixCursus;

    public Etudiant(int identifiant, double moyenne, String choixCursus) {
        this.identifiant = identifiant;
        this.moyenne = moyenne;
        this.choixCursus = choixCursus;
    }

    public int getIdentifiant() { return identifiant; }
    public double getMoyenne() { return moyenne; }
    public String getChoixCursus() { return choixCursus; }

    @Override
    public String toString() {
        return identifiant + ", " + moyenne + ", " + choixCursus;
    }
}