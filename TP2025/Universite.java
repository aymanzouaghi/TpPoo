package TP2025;

import java.util.ArrayList;

public class Universite {
    private Cursus[] tabCursus;
    private ArrayList<Personnel> listPersonnel;
    private ArrayList<Etudiant> listEtudiantsAdmis;
    private ArrayList<Etudiant> listEtudiantsRefuses;
    private ArrayList<Etudiant> listEtudiantAttente;

public Universite() {
    this.listPersonnel = new ArrayList<>();
    this.listEtudiantsAdmis = new ArrayList<>();
    this.listEtudiantsRefuses = new ArrayList<>();
    this.listEtudiantAttente = new ArrayList<>();

    this.tabCursus = new Cursus[3];
    this.tabCursus[0] = new Cursus("Informatique", 100);
    this.tabCursus[1] = new Cursus("Mathematiques", 80);
    this.tabCursus[2] = new Cursus("PhysiqueChimie", 120);
}

    public Cursus[] getTabCursus() { return tabCursus; }
    public ArrayList<Personnel> getListPersonnel() { return listPersonnel; }
    public ArrayList<Etudiant> getListEtudiantsAdmis() { return listEtudiantsAdmis; }
    public ArrayList<Etudiant> getListEtudiantsRefuses() { return listEtudiantsRefuses; }
    public ArrayList<Etudiant> getListEtudiantAttente() { return listEtudiantAttente; }
public void ajoutAdministratif(Administratif administratif) {
    this.listPersonnel.add(administratif);
}
public void ajoutEnseignant(Enseignant enseignant) {
    this.listPersonnel.add(enseignant);
    for (int i = 0; i < tabCursus.length; i++) {
        if (tabCursus[i].getNomCursus().equals(enseignant.getNomCursus())) {
            tabCursus[i].ajoutEnseignant(enseignant);
        }
    }
}
public void suppressionEnseignant(Enseignant enseignant) throws EnseignantAbsentException {
    this.listPersonnel.remove(enseignant);
    for (int i = 0; i < tabCursus.length; i++) {
        if (tabCursus[i].getNomCursus().equals(enseignant.getNomCursus())) {
            tabCursus[i].supprime(enseignant); // peut lancer EnseignantAbsentException
        }
    }
}
public void ajoutEtudiant(Etudiant etudiant) {
    for (int i = 0; i < tabCursus.length; i++) {
        if (tabCursus[i].getNomCursus().equals(etudiant.getChoixCursus())) {
            try {
                tabCursus[i].ajoutEtudiant(etudiant);
                this.listEtudiantsAdmis.add(etudiant); // aucune exception → admis

            } catch (MoyenneInsuffisanteException e) {
                this.listEtudiantsRefuses.add(etudiant); // moyenne < 10 → refusé

            } catch (NombrePlacesException e) {
                this.listEtudiantAttente.add(etudiant); // plus de place → attente
            }
        }
    }
}
public void afficherEffectifParCursus() {
    for (int i = 0; i < tabCursus.length; i++) {
        System.out.println("Cursus : " + tabCursus[i].getNomCursus());
        System.out.println("  Nombre d'enseignants : " + tabCursus[i].getNombreEnseignants());
        System.out.println("  Nombre d'etudiants : " + tabCursus[i].getNombreEtudiants());
        System.out.println();
    }
}
}