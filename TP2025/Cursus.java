package TP2025;

import java.util.ArrayList;

public class Cursus {
    private String nomCursus;
    private int nombrePlaces;
    private ArrayList<Etudiant> listEtudiants;
    private ArrayList<Enseignant> listEnseignants;

    public Cursus(String nomCursus, int nombrePlaces) {
        this.nomCursus = nomCursus;
        this.nombrePlaces = nombrePlaces;
        this.listEtudiants = new ArrayList<>();
        this.listEnseignants = new ArrayList<>();
    }

    public String getNomCursus() { return nomCursus; }
    public int getNombrePlaces() { return nombrePlaces; }
    public ArrayList<Etudiant> getListEtudiants() { return listEtudiants; }
    public ArrayList<Enseignant> getListEnseignants() { return listEnseignants; }
public void ajoutEnseignant(Enseignant enseignant) {
    listEnseignants.add(enseignant);
}
public void supprime(Enseignant enseignant) throws EnseignantAbsentException {
    if (!listEnseignants.contains(enseignant)) {
        throw new EnseignantAbsentException("Enseignant absent du cursus : " + enseignant.getNom());
    }
    listEnseignants.remove(enseignant);
}
public void ajoutEtudiant(Etudiant etudiant) throws NombrePlacesException, MoyenneInsuffisanteException {
    if (etudiant.getMoyenne() < 10) {
        throw new MoyenneInsuffisanteException("Moyenne insuffisante : " + etudiant.getMoyenne());
    }
    if (listEtudiants.size() >= nombrePlaces) {
        throw new NombrePlacesException("Plus de places disponibles dans : " + nomCursus);
    }
    listEtudiants.add(etudiant);
}
public int getNombreEtudiants() {
    return listEtudiants.size();
}

public int getNombreEnseignants() {
    return listEnseignants.size();
}
public double getMoyenneGlobale() {
    if (listEtudiants.isEmpty()) return 0;
    double somme = 0;
    for (Etudiant e : listEtudiants) {
        somme += e.getMoyenne();
    }
    return somme / listEtudiants.size();
}
}
